package h1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a {

    private static long f21017a;

    private static Method f21018b;

    private static Method f21019c;

    public static void a(String str) {
        b.a(h(str));
    }

    public static void b() {
        b.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29 ? c.a() : e();
    }

    private static boolean e() {
        try {
            if (f21018b == null) {
                f21017a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f21018b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f21018b.invoke(null, Long.valueOf(f21017a))).booleanValue();
        } catch (Exception e7) {
            c("isTagEnabled", e7);
            return false;
        }
    }

    public static void f(String str, int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(h(str), i7);
        } else {
            g(h(str), i7);
        }
    }

    private static void g(String str, int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f21019c == null) {
                f21019c = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f21019c.invoke(null, Long.valueOf(f21017a), str, Integer.valueOf(i7));
        } catch (Exception e7) {
            c("traceCounter", e7);
        }
    }

    private static String h(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
