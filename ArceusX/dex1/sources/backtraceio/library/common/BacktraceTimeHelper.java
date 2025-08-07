package backtraceio.library.common;

public class BacktraceTimeHelper {
    public static long getTimestampSeconds() {
        return System.currentTimeMillis() / 1000;
    }
}
