package backtraceio.library.services;

import W0.JWp.kNUgEaOjcPdX;
import android.os.Handler;
import android.os.Message;
import backtraceio.library.common.BacktraceMathHelper;
import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.interfaces.Api;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.metrics.Event;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.EventsResult;
import java.util.concurrent.ConcurrentLinkedDeque;

abstract class BacktraceEventsHandler<T extends Event> extends Handler {
    private static final transient String LOG_TAG = "BacktraceEventsHandler";
    protected final Api api;
    protected final BacktraceHandlerThread backtraceHandlerThread;
    protected final BacktraceMetrics backtraceMetrics;
    protected ConcurrentLinkedDeque<T> events;
    private int maximumNumberOfEvents;
    private final String submissionUrl;
    private final int timeBetweenRetriesMillis;

    public BacktraceEventsHandler(BacktraceMetrics backtraceMetrics, Api api, BacktraceHandlerThread backtraceHandlerThread, String str) {
        super(backtraceHandlerThread.getLooper());
        this.events = new ConcurrentLinkedDeque<>();
        this.maximumNumberOfEvents = 350;
        if (!backtraceHandlerThread.isAlive()) {
            throw new NullPointerException("Handler thread is not alive, this should not happen");
        }
        this.backtraceMetrics = backtraceMetrics;
        this.backtraceHandlerThread = backtraceHandlerThread;
        this.api = api;
        this.submissionUrl = backtraceMetrics.settings.getSubmissionUrl(str);
        this.timeBetweenRetriesMillis = backtraceMetrics.settings.getTimeBetweenRetriesMillis();
        final long timeIntervalMillis = backtraceMetrics.settings.getTimeIntervalMillis();
        if (timeIntervalMillis != 0) {
            postDelayed(new Runnable() {
                @Override
                public void run() {
                    this.send();
                    this.postDelayed(this, timeIntervalMillis);
                }
            }, timeIntervalMillis);
        }
    }

    private long calculateNextRetryTime(int i7) {
        double dClamp = BacktraceMathHelper.clamp(this.timeBetweenRetriesMillis * Math.pow(10.0d, i7 - 1), 0.0d, 300000.0d);
        return (long) BacktraceMathHelper.uniform(dClamp, (1.0d * dClamp) + dClamp);
    }

    private EventsResult getEventsResult(BacktraceHandlerInputEvents backtraceHandlerInputEvents) {
        if (backtraceHandlerInputEvents.eventsRequestHandler != null) {
            BacktraceLogger.d(LOG_TAG, "Sending using custom request handler");
            return backtraceHandlerInputEvents.eventsRequestHandler.onRequest(backtraceHandlerInputEvents.payload);
        }
        BacktraceLogger.d(LOG_TAG, "Sending report using default request handler");
        return BacktraceReportSender.sendEvents(this.submissionUrl, BacktraceSerializeHelper.toJson(backtraceHandlerInputEvents.payload), backtraceHandlerInputEvents.payload, backtraceHandlerInputEvents.serverErrorEventListener);
    }

    private void retrySendEvents(final BacktraceHandlerInputEvents backtraceHandlerInputEvents, int i7) {
        if (i7 <= 501 || i7 == 505) {
            return;
        }
        EventsPayload eventsPayload = backtraceHandlerInputEvents.payload;
        final int i8 = eventsPayload.numRetries + 1;
        eventsPayload.numRetries = i8;
        if (i8 >= 3 || this.timeBetweenRetriesMillis == 0) {
            onMaximumAttemptsReached(eventsPayload.getEvents());
        } else {
            postDelayed(new Runnable() {
                @Override
                public void run() {
                    EventsPayload<T> eventsPayload2 = backtraceHandlerInputEvents.payload;
                    eventsPayload2.setDroppedEvents(i8);
                    BacktraceEventsHandler.this.sendEventsPayload(eventsPayload2);
                }
            }, calculateNextRetryTime(i8));
        }
    }

    public int getCount() {
        return this.events.size();
    }

    protected abstract EventsPayload<T> getEventsPayload();

    public int getMaximumNumberOfEvents() {
        return this.maximumNumberOfEvents;
    }

    @Override
    public void handleMessage(Message message) {
        BacktraceHandlerInputEvents backtraceHandlerInputEvents = (BacktraceHandlerInputEvents) message.obj;
        EventsResult eventsResult = getEventsResult(backtraceHandlerInputEvents);
        if (backtraceHandlerInputEvents.eventsOnServerResponseEventListener != null) {
            BacktraceLogger.d(LOG_TAG, kNUgEaOjcPdX.iYeVBbZ);
            backtraceHandlerInputEvents.eventsOnServerResponseEventListener.onEvent(eventsResult);
        }
        retrySendEvents(backtraceHandlerInputEvents, eventsResult.getStatusCode());
    }

    protected void onMaximumAttemptsReached(ConcurrentLinkedDeque<T> concurrentLinkedDeque) {
    }

    public void send() {
        ConcurrentLinkedDeque<T> concurrentLinkedDeque = this.events;
        if (concurrentLinkedDeque == null || concurrentLinkedDeque.size() == 0) {
            return;
        }
        sendEvents(this.events);
    }

    protected abstract void sendEvents(ConcurrentLinkedDeque<T> concurrentLinkedDeque);

    protected abstract void sendEventsPayload(EventsPayload<T> eventsPayload);

    public void setMaximumNumberOfEvents(int i7) {
        this.maximumNumberOfEvents = i7;
    }
}
