package x0;

import java.util.Objects;

public class C2985b {
    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(Object... objArr) {
        return Objects.hash(objArr);
    }

    public static <T> T c(T t7) {
        t7.getClass();
        return t7;
    }

    public static <T> T d(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(str);
    }

    public static String e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
