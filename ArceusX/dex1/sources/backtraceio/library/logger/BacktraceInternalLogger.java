package backtraceio.library.logger;

import android.util.Log;

public class BacktraceInternalLogger implements Logger {
    private static final String BASE_TAG = "BacktraceLogger: ";
    private int logLevel;

    public BacktraceInternalLogger() {
        this(LogLevel.OFF);
    }

    private String getTag(String str) {
        return BASE_TAG + str;
    }

    @Override
    public int d(String str, String str2) {
        if (this.logLevel <= LogLevel.DEBUG.ordinal()) {
            return Log.d(getTag(str), str2);
        }
        return 0;
    }

    @Override
    public int e(String str, String str2) {
        if (this.logLevel <= LogLevel.ERROR.ordinal()) {
            return Log.e(getTag(str), str2);
        }
        return 0;
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    public void setLevel(LogLevel logLevel) {
        this.logLevel = logLevel.ordinal();
    }

    @Override
    public int w(String str, String str2) {
        if (this.logLevel <= LogLevel.WARN.ordinal()) {
            return Log.w(getTag(str), str2);
        }
        return 0;
    }

    public BacktraceInternalLogger(LogLevel logLevel) {
        this.logLevel = logLevel.ordinal();
    }

    @Override
    public int e(String str, String str2, Throwable th) {
        if (this.logLevel <= LogLevel.ERROR.ordinal()) {
            return Log.e(getTag(str), str2, th);
        }
        return 0;
    }
}
