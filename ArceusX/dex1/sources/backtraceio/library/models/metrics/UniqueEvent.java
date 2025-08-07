package backtraceio.library.models.metrics;

import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.BacktraceTimeHelper;
import backtraceio.library.logger.BacktraceLogger;
import com.github.luben.zstd.BuildConfig;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UniqueEvent extends Event {
    private static final transient String LOG_TAG = "UniqueEvent";

    @SerializedName("unique")
    private final List<String> name;

    public UniqueEvent(String str) {
        this(str, null);
    }

    @Override
    public String getName() {
        List<String> list = this.name;
        if (list != null && list.size() > 0 && !BacktraceStringHelper.isNullOrEmpty(this.name.get(0))) {
            return this.name.get(0);
        }
        BacktraceLogger.e(LOG_TAG, "Unique Event name must not be null or empty");
        return BuildConfig.FLAVOR;
    }

    public void update(long j7, Map<String, String> map) {
        this.timestamp = j7;
        addAttributesImpl(map);
    }

    public UniqueEvent(String str, Map<String, String> map) {
        this(str, BacktraceTimeHelper.getTimestampSeconds(), map);
    }

    public UniqueEvent(String str, long j7, Map<String, String> map) {
        super(j7);
        this.name = new ArrayList<String>(str) {
            final String val$name;

            {
                this.val$name = str;
                add(str);
            }
        };
        addAttributesImpl(map);
    }
}
