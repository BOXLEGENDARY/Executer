package backtraceio.library.models.metrics;

import backtraceio.library.common.BacktraceTimeHelper;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

public final class SummedEvent extends Event {

    @SerializedName("metric_group")
    private final String name;

    public SummedEvent(String str) {
        this(str, null);
    }

    public void addAttributes(Map<String, String> map) {
        addAttributesImpl(map);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public SummedEvent(String str, Map<String, String> map) {
        this(str, BacktraceTimeHelper.getTimestampSeconds(), map);
    }

    public SummedEvent(String str, long j7, Map<String, String> map) {
        super(j7);
        this.name = str;
        addAttributesImpl(map);
    }

    public SummedEvent(SummedEvent summedEvent) {
        this(summedEvent.name, summedEvent.timestamp, summedEvent.attributes);
    }
}
