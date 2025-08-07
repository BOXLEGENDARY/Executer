package x0;

import java.util.Locale;

public final class g {
    public static void a(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i7, int i8, int i9, String str) {
        if (i7 < i8) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
        if (i7 <= i9) {
            return i7;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    public static int d(int i7) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException();
    }

    public static int e(int i7, String str) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException(str);
    }

    public static int f(int i7, int i8) {
        if ((i7 & i8) == i7) {
            return i7;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i7) + ", but only 0x" + Integer.toHexString(i8) + " are allowed");
    }

    public static <T> T g(T t7) {
        t7.getClass();
        return t7;
    }

    public static <T> T h(T t7, Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void i(boolean z7) {
        j(z7, null);
    }

    public static void j(boolean z7, String str) {
        if (!z7) {
            throw new IllegalStateException(str);
        }
    }
}
