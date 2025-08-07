package backtraceio.library.events;

import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.EventsResult;

public interface EventsRequestHandler {
    EventsResult onRequest(EventsPayload eventsPayload);
}
