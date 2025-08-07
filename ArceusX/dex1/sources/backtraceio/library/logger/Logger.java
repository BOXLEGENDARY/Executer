package backtraceio.library.logger;

public interface Logger {
    int d(String str, String str2);

    int e(String str, String str2);

    int e(String str, String str2, Throwable th);

    int w(String str, String str2);
}
