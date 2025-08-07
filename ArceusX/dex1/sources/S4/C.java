package S4;

public final class C {
    public static void a(boolean z7, String str) {
        if (!z7) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T b(T t7) {
        t7.getClass();
        return t7;
    }

    public static <T> T c(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z7, String str) {
        if (!z7) {
            throw new IllegalStateException(str);
        }
    }
}
