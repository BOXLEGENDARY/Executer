package com.google.android.gms.internal.play_billing;

public final class C2145t {
    public static int a(int i7, int i8, String str) {
        String strA;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 < 0) {
            strA = C2151u.a("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i8 < 0) {
                throw new IllegalArgumentException("negative size: " + i8);
            }
            strA = C2151u.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException(strA);
    }

    public static int b(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(f(i7, i8, "index"));
        }
        return i7;
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void d(boolean z7, String str, Object obj, Object obj2) {
        if (!z7) {
            throw new IllegalArgumentException(C2151u.a(str, obj, obj2));
        }
    }

    public static void e(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i9) ? f(i7, i9, "start index") : (i8 < 0 || i8 > i9) ? f(i8, i9, "end index") : C2151u.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7)));
        }
    }

    private static String f(int i7, int i8, String str) {
        if (i7 < 0) {
            return C2151u.a("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return C2151u.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException("negative size: " + i8);
    }
}
