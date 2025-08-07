package backtraceio.library.models;

import backtraceio.library.logger.BacktraceLogger;
import com.google.gson.annotations.SerializedName;
import java.util.UUID;

public class BacktraceStackFrame {
    private static final transient String LOG_TAG = "BacktraceStackFrame";

    @SerializedName("funcName")
    public String functionName;

    @SerializedName("line")
    public Integer line;

    @SerializedName("sourceCode")
    public String sourceCode;
    public transient String sourceCodeFileName;

    public BacktraceStackFrame() {
        this.line = null;
    }

    public BacktraceStackFrame(StackTraceElement stackTraceElement) {
        this.line = null;
        if (stackTraceElement != null && stackTraceElement.getMethodName() != null) {
            this.functionName = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            this.sourceCodeFileName = stackTraceElement.getFileName();
            this.sourceCode = UUID.randomUUID().toString();
            this.line = stackTraceElement.getLineNumber() > 0 ? Integer.valueOf(stackTraceElement.getLineNumber()) : null;
            return;
        }
        BacktraceLogger.w(LOG_TAG, "Frame or method name is null");
    }
}
