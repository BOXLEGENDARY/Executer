package backtraceio.library.models.metrics;

import com.google.gson.annotations.SerializedName;
import java.util.concurrent.ConcurrentLinkedDeque;

public final class UniqueEventsPayload extends EventsPayload<UniqueEvent> {

    @SerializedName("unique_events")
    private final ConcurrentLinkedDeque<UniqueEvent> uniqueEvents;

    public UniqueEventsPayload(ConcurrentLinkedDeque<UniqueEvent> concurrentLinkedDeque, String str, String str2) {
        super(str, str2);
        this.uniqueEvents = concurrentLinkedDeque;
    }

    @Override
    public ConcurrentLinkedDeque<UniqueEvent> getEvents() {
        return this.uniqueEvents;
    }
}
