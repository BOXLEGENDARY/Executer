package n3;

import android.util.Log;

public final class C2645c {

    private final String f22274a;

    private final String f22275b;

    public C2645c(String str) {
        this(str, null);
    }

    private final String g(String str) {
        String str2 = this.f22275b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i7) {
        return Log.isLoggable(this.f22274a, i7);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, g(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, g(str2));
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, g(str2), th);
        }
    }

    public void e(String str, String str2) {
        if (a(2)) {
            Log.v(str, g(str2));
        }
    }

    public void f(String str, String str2) {
        if (a(5)) {
            Log.w(str, g(str2));
        }
    }

    public C2645c(String str, String str2) {
        C2651i.m(str, "log tag cannot be null");
        C2651i.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f22274a = str;
        this.f22275b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
