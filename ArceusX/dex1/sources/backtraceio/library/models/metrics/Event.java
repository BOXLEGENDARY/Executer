package backtraceio.library.models.metrics;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

public abstract class Event {

    @SerializedName("attributes")
    protected Map<String, String> attributes = new HashMap();

    @SerializedName("timestamp")
    protected long timestamp;

    public Event(long j7) {
        this.timestamp = j7;
    }

    protected void addAttributesImpl(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.attributes.putAll(map);
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public abstract String getName();

    public long getTimestamp() {
        return this.timestamp;
    }
}
