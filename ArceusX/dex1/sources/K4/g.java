package K4;

public final class g {
    private static String a(int i7, int i8, String str) {
        if (i7 < 0) {
            return i.c("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return i.c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String b(int i7, int i8, String str) {
        if (i7 < 0) {
            return i.c("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return i.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String c(int i7, int i8, int i9) {
        return (i7 < 0 || i7 > i9) ? b(i7, i9, "start index") : (i8 < 0 || i8 > i9) ? b(i8, i9, "end index") : i.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
    }

    public static void d(boolean z7, String str, int i7, int i8) {
        if (!z7) {
            throw new IllegalArgumentException(i.c(str, Integer.valueOf(i7), Integer.valueOf(i8)));
        }
    }

    public static int e(int i7, int i8) {
        return f(i7, i8, "index");
    }

    public static int f(int i7, int i8, String str) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(a(i7, i8, str));
        }
        return i7;
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

    public static <T> T i(T t7, String str, Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(i.c(str, obj));
    }

    public static int j(int i7, int i8) {
        return k(i7, i8, "index");
    }

    public static int k(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(b(i7, i8, str));
        }
        return i7;
    }

    public static void l(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException(c(i7, i8, i9));
        }
    }

    public static void m(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void n(boolean z7, String str, Object obj) {
        if (!z7) {
            throw new IllegalStateException(i.c(str, obj));
        }
    }
}
