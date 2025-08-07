package backtraceio.library.logger;

public class BacktraceLogger {
    private static Logger logger = new BacktraceInternalLogger();

    public static int d(String str, String str2) {
        return logger.d(str, str2);
    }

    public static int e(String str, String str2) {
        return logger.e(str, str2);
    }

    public static Logger getLogger() {
        return logger;
    }

    @Deprecated
    public static void setLevel(LogLevel logLevel) {
        Logger logger2 = logger;
        if (logger2 instanceof BacktraceInternalLogger) {
            ((BacktraceInternalLogger) logger2).setLevel(logLevel);
        }
    }

    public static void setLogger(Logger logger2) {
        if (logger2 == null) {
            throw new IllegalArgumentException("Passed custom logger implementation can`t be null");
        }
        logger = logger2;
    }

    public static int w(String str, String str2) {
        return logger.w(str, str2);
    }

    public static int e(String str, String str2, Throwable th) {
        return logger.e(str, str2, th);
    }
}
