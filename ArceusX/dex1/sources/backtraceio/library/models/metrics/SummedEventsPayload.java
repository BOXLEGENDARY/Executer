package backtraceio.library.models.metrics;

import com.google.gson.annotations.SerializedName;
import java.util.concurrent.ConcurrentLinkedDeque;

public class SummedEventsPayload extends EventsPayload<SummedEvent> {

    @SerializedName("summed_events")
    private final ConcurrentLinkedDeque<SummedEvent> summedEvents;

    public SummedEventsPayload(ConcurrentLinkedDeque<SummedEvent> concurrentLinkedDeque, String str, String str2) {
        super(str, str2);
        this.summedEvents = concurrentLinkedDeque;
    }

    @Override
    public ConcurrentLinkedDeque<SummedEvent> getEvents() {
        return this.summedEvents;
    }
}
