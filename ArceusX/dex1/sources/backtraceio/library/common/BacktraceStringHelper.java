package backtraceio.library.common;

public class BacktraceStringHelper {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isObjectNotNullOrNotEmptyString(Object obj) {
        return obj instanceof String ? (obj == null || obj.toString().trim().isEmpty()) ? false : true : obj != null;
    }
}
