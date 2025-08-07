package K3;

import S5.Cg.XjqcfAbdbc;

public final class C0485q {
    public static int a(int i7, int i8, String str) {
        String strA;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 < 0) {
            strA = r.a("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i8 < 0) {
                throw new IllegalArgumentException("negative size: " + i8);
            }
            strA = r.a(XjqcfAbdbc.GYJxjtSFM, "index", Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException(strA);
    }

    public static int b(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(f(i7, i8, "index"));
        }
        return i7;
    }

    public static void c(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(boolean z7, String str, char c2) {
        if (!z7) {
            throw new IllegalArgumentException(r.a(str, Character.valueOf(c2)));
        }
    }

    public static void e(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i9) ? f(i7, i9, "start index") : (i8 < 0 || i8 > i9) ? f(i8, i9, "end index") : r.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7)));
        }
    }

    private static String f(int i7, int i8, String str) {
        if (i7 < 0) {
            return r.a("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return r.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException("negative size: " + i8);
    }
}
