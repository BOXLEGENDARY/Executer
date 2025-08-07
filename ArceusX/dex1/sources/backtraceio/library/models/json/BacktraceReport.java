package backtraceio.library.models.json;

import android.content.Context;
import backtraceio.library.common.BacktraceTimeHelper;
import backtraceio.library.common.CollectionUtils;
import backtraceio.library.models.BacktraceAttributeConsts;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceStackFrame;
import backtraceio.library.models.BacktraceStackTrace;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BacktraceReport {
    public List<String> attachmentPaths;
    public Map<String, Object> attributes;
    public String classifier;
    public ArrayList<BacktraceStackFrame> diagnosticStack;
    public Exception exception;
    public Boolean exceptionTypeReport;
    public String message;
    private final transient Throwable originalException;
    public long timestamp;
    public UUID uuid;

    public BacktraceReport(String str) {
        this((Throwable) null, (Map<String, Object>) null, (List<String>) null);
        this.message = str;
    }

    public static Map<String, Object> concatAttributes(BacktraceReport backtraceReport, Map<String, Object> map) {
        Map<String, Object> map2 = backtraceReport.attributes;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        if (map == null) {
            return map2;
        }
        map2.putAll(map);
        return map2;
    }

    private String getExceptionClassifier(Throwable th) {
        return th.getClass().getCanonicalName();
    }

    private Exception prepareException(Throwable th) {
        if (th == null) {
            return null;
        }
        Exception exc = new Exception(th.getMessage());
        exc.setStackTrace(th.getStackTrace());
        return exc;
    }

    private void setDefaultErrorTypeAttribute() {
        if (this.attributes.containsKey(BacktraceAttributeConsts.ErrorType)) {
            return;
        }
        this.attributes.put(BacktraceAttributeConsts.ErrorType, this.exceptionTypeReport.booleanValue() ? BacktraceAttributeConsts.HandledExceptionAttributeType : BacktraceAttributeConsts.MessageAttributeType);
    }

    public Throwable getException() {
        Throwable th = this.originalException;
        return th != null ? th : this.exception;
    }

    public BacktraceData toBacktraceData(Context context, Map<String, Object> map) {
        return toBacktraceData(context, map, false);
    }

    public BacktraceData toBacktraceData(Context context, Map<String, Object> map, boolean z7) {
        BacktraceData backtraceData = new BacktraceData(context, this, map);
        backtraceData.symbolication = z7 ? "proguard" : null;
        return backtraceData;
    }

    public BacktraceReport(String str, Map<String, Object> map) {
        this((Throwable) null, map, (List<String>) null);
        this.message = str;
    }

    public BacktraceReport(String str, List<String> list) {
        this(str, (Map<String, Object>) null, list);
    }

    public BacktraceReport(String str, Map<String, Object> map, List<String> list) {
        this((Throwable) null, map, list);
        this.message = str;
    }

    public BacktraceReport(Throwable th) {
        this(th, (Map<String, Object>) null, (List<String>) null);
    }

    public BacktraceReport(Throwable th, Map<String, Object> map) {
        this(th, map, (List<String>) null);
    }

    public BacktraceReport(Exception exc, List<String> list) {
        this(exc, (Map<String, Object>) null, list);
    }

    public BacktraceReport(Throwable th, Map<String, Object> map, List<String> list) {
        this.uuid = UUID.randomUUID();
        this.timestamp = BacktraceTimeHelper.getTimestampSeconds();
        this.exceptionTypeReport = Boolean.FALSE;
        this.classifier = BuildConfig.FLAVOR;
        this.attributes = new HashMap();
        this.attachmentPaths = new ArrayList();
        this.attributes = CollectionUtils.copyMap(map);
        this.attachmentPaths = CollectionUtils.copyList(list);
        this.originalException = th;
        if (th != null) {
            this.exception = prepareException(th);
            this.classifier = getExceptionClassifier(th);
            this.exceptionTypeReport = Boolean.TRUE;
        }
        this.diagnosticStack = new BacktraceStackTrace(this.exception).getStackFrames();
        setDefaultErrorTypeAttribute();
    }
}
