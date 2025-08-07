package backtraceio.library.services;

import android.os.Message;
import backtraceio.library.interfaces.Api;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.SummedEvent;
import backtraceio.library.models.metrics.SummedEventsPayload;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

public class SummedEventsHandler extends BacktraceEventsHandler<SummedEvent> {
    private static final transient String LOG_TAG = "SummedEventsHandler";
    private static final String urlPrefix = "summed-events";

    public SummedEventsHandler(BacktraceMetrics backtraceMetrics, Api api, BacktraceHandlerThread backtraceHandlerThread) {
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
    protected void onMaximumAttemptsReached(ConcurrentLinkedDeque<SummedEvent> concurrentLinkedDeque) {
        if (this.events.size() + concurrentLinkedDeque.size() < getMaximumNumberOfEvents()) {
            Iterator<SummedEvent> it = concurrentLinkedDeque.iterator();
            while (it.hasNext()) {
                this.events.addFirst(it.next());
            }
        }
    }

    @Override
    public void send() {
        super.send();
    }

    @Override
    protected void sendEvents(ConcurrentLinkedDeque<SummedEvent> concurrentLinkedDeque) {
        this.api.sendEventsPayload(getEventsPayload());
    }

    @Override
    protected void sendEventsPayload(EventsPayload<SummedEvent> eventsPayload) {
        this.api.sendEventsPayload((SummedEventsPayload) eventsPayload);
    }

    @Override
    public void setMaximumNumberOfEvents(int i7) {
        super.setMaximumNumberOfEvents(i7);
    }

    @Override
    public SummedEventsPayload getEventsPayload() {
        Map<String, String> mapCreateLocalAttributes = this.backtraceMetrics.createLocalAttributes(null);
        Iterator it = this.events.iterator();
        while (it.hasNext()) {
            ((SummedEvent) it.next()).addAttributes(mapCreateLocalAttributes);
        }
        SummedEventsPayload summedEventsPayload = new SummedEventsPayload(new ConcurrentLinkedDeque(this.events), this.backtraceMetrics.getApplicationName(), this.backtraceMetrics.getApplicationVersion());
        this.events.clear();
        return summedEventsPayload;
    }
}
