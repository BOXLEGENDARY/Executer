package n3;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

public final class C2651i {
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

    public static void c(boolean z7, String str, Object... objArr) {
        if (!z7) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void e(String str) {
        if (!v3.v.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static String g(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static void h() {
        i("Must not be called on GoogleApiHandler thread.");
    }

    public static void i(String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            String name = looperMyLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException(str);
            }
        }
    }

    public static void j() {
        k("Must not be called on the main application thread");
    }

    public static void k(String str) {
        if (v3.v.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T l(T t7) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException("null reference");
    }

    public static <T> T m(T t7, Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int n(int i7) {
        if (i7 != 0) {
            return i7;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static long o(long j7) {
        if (j7 != 0) {
            return j7;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    public static void p(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    public static void q(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
