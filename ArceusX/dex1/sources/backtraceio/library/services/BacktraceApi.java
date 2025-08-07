package backtraceio.library.services;

import backtraceio.library.events.EventsOnServerResponseEventListener;
import backtraceio.library.events.EventsRequestHandler;
import backtraceio.library.events.OnServerErrorEventListener;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.events.RequestHandler;
import backtraceio.library.interfaces.Api;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.metrics.SummedEventsPayload;
import backtraceio.library.models.metrics.UniqueEventsPayload;
import y1.b;

public class BacktraceApi implements Api {
    private static final transient String LOG_TAG = "BacktraceApi";
    private final String reportSubmissionUrl;
    private final transient BacktraceHandlerThread threadSender;
    private OnServerErrorEventListener onServerError = null;
    private RequestHandler requestHandler = null;
    private EventsRequestHandler uniqueEventsRequestHandler = null;
    private EventsRequestHandler summedEventsRequestHandler = null;
    private EventsOnServerResponseEventListener uniqueEventsServerResponse = null;
    private EventsOnServerResponseEventListener summedEventsServerResponse = null;

    public BacktraceApi(b bVar) {
        if (bVar == null) {
            BacktraceLogger.e(LOG_TAG, "BacktraceCredentials parameter passed to BacktraceApi constructor is null");
            throw new IllegalArgumentException("BacktraceCredentials cannot be null");
        }
        String string = bVar.f().toString();
        this.reportSubmissionUrl = string;
        this.threadSender = new BacktraceHandlerThread(BacktraceHandlerThread.class.getSimpleName(), string);
    }

    @Override
    public SummedEventsHandler enableSummedEvents(BacktraceMetrics backtraceMetrics) {
        return this.threadSender.createSummedEventsHandler(backtraceMetrics, this);
    }

    @Override
    public UniqueEventsHandler enableUniqueEvents(BacktraceMetrics backtraceMetrics) {
        return this.threadSender.createUniqueEventsHandler(backtraceMetrics, this);
    }

    @Override
    public void send(BacktraceData backtraceData, OnServerResponseEventListener onServerResponseEventListener) {
        this.threadSender.sendReport(new BacktraceHandlerInputReport(backtraceData, onServerResponseEventListener, this.onServerError, this.requestHandler));
    }

    @Override
    public void sendEventsPayload(UniqueEventsPayload uniqueEventsPayload) {
        this.threadSender.sendUniqueEvents(new BacktraceHandlerInputEvents(uniqueEventsPayload, this.uniqueEventsServerResponse, this.onServerError, this.uniqueEventsRequestHandler));
    }

    @Override
    public void setOnServerError(OnServerErrorEventListener onServerErrorEventListener) {
        this.onServerError = onServerErrorEventListener;
    }

    @Override
    public void setRequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public void setSummedEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener) {
        this.summedEventsServerResponse = eventsOnServerResponseEventListener;
    }

    @Override
    public void setSummedEventsRequestHandler(EventsRequestHandler eventsRequestHandler) {
        this.summedEventsRequestHandler = eventsRequestHandler;
    }

    @Override
    public void setUniqueEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener) {
        this.uniqueEventsServerResponse = eventsOnServerResponseEventListener;
    }

    @Override
    public void setUniqueEventsRequestHandler(EventsRequestHandler eventsRequestHandler) {
        this.uniqueEventsRequestHandler = eventsRequestHandler;
    }

    @Override
    public void sendEventsPayload(SummedEventsPayload summedEventsPayload) {
        this.threadSender.sendSummedEvents(new BacktraceHandlerInputEvents(summedEventsPayload, this.summedEventsServerResponse, this.onServerError, this.summedEventsRequestHandler));
    }
}
