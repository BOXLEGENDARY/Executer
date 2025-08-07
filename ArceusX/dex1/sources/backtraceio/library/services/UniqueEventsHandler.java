package backtraceio.library.services;

import android.os.Message;
import backtraceio.library.common.BacktraceTimeHelper;
import backtraceio.library.interfaces.Api;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.UniqueEvent;
import backtraceio.library.models.metrics.UniqueEventsPayload;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

public class UniqueEventsHandler extends BacktraceEventsHandler<UniqueEvent> {
    private static final transient String LOG_TAG = "UniqueEventsHandler";
    private static final String urlPrefix = "unique-events";

    public UniqueEventsHandler(BacktraceMetrics backtraceMetrics, Api api, BacktraceHandlerThread backtraceHandlerThread) {
        super(backtraceMetrics, api, backtraceHandlerThread, urlPrefix);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public int getMaximumNumberOfEvents() {
        return super.getMaximumNumberOfEvents();
    }

    @Override
    public void handleMessage(Message message) {
        super.handleMessage(message);
    }

    @Override
    public void send() {
        super.send();
    }

    @Override
    protected void sendEvents(ConcurrentLinkedDeque<UniqueEvent> concurrentLinkedDeque) {
        this.api.sendEventsPayload(getEventsPayload());
    }

    @Override
    protected void sendEventsPayload(EventsPayload<UniqueEvent> eventsPayload) {
        this.api.sendEventsPayload((UniqueEventsPayload) eventsPayload);
    }

    @Override
    public void setMaximumNumberOfEvents(int i7) {
        super.setMaximumNumberOfEvents(i7);
    }

    @Override
    public UniqueEventsPayload getEventsPayload() {
        Map<String, String> mapCreateLocalAttributes = this.backtraceMetrics.createLocalAttributes(null);
        Iterator it = this.events.iterator();
        while (it.hasNext()) {
            ((UniqueEvent) it.next()).update(BacktraceTimeHelper.getTimestampSeconds(), mapCreateLocalAttributes);
        }
        return new UniqueEventsPayload(this.events, this.backtraceMetrics.getApplicationName(), this.backtraceMetrics.getApplicationVersion());
    }
}
