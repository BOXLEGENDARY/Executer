package backtraceio.library.models.metrics;

import com.google.gson.annotations.SerializedName;

public class EventsMetadata {

    @SerializedName("dropped_events")
    private int droppedEvents;

    public EventsMetadata(int i7) {
        this.droppedEvents = i7;
    }

    public int getDroppedEvents() {
        return this.droppedEvents;
    }

    public void setDroppedEvents(int i7) {
        this.droppedEvents = i7;
    }
}
