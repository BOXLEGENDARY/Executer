package backtraceio.library.events;

import backtraceio.library.models.metrics.EventsResult;

public interface EventsOnServerResponseEventListener {
    void onEvent(EventsResult eventsResult);
}
