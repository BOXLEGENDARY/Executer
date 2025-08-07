package z;

import android.util.Log;

public final class C3043d0 {

    private static int f24628a = 3;

    public static void a(String str, String str2) {
        String strK = k(str);
        if (g(strK, 3)) {
            Log.d(strK, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        String strK = k(str);
        if (g(strK, 3)) {
            Log.d(strK, str2, th);
        }
    }

    public static void c(String str, String str2) {
        String strK = k(str);
        if (g(strK, 6)) {
            Log.e(strK, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String strK = k(str);
        if (g(strK, 6)) {
            Log.e(strK, str2, th);
        }
    }

    public static void e(String str, String str2) {
        String strK = k(str);
        if (g(strK, 4)) {
            Log.i(strK, str2);
        }
    }

    public static boolean f(String str) {
        return g(k(str), 3);
    }

    private static boolean g(String str, int i7) {
        return f24628a <= i7 || Log.isLoggable(str, i7);
    }

    public static boolean h(String str) {
        return g(k(str), 2);
    }

    static void i() {
        f24628a = 3;
    }

    static void j(int i7) {
        f24628a = i7;
    }

    private static String k(String str) {
        return str;
    }

    public static void l(String str, String str2) {
        String strK = k(str);
        if (g(strK, 5)) {
            Log.w(strK, str2);
        }
    }

    public static void m(String str, String str2, Throwable th) {
        String strK = k(str);
        if (g(strK, 5)) {
            Log.w(strK, str2, th);
        }
    }
}
