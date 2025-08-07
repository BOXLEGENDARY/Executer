package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class f {

    public static final long f19118b = TimeUnit.HOURS.toSeconds(1);

    private static final Pattern f19119c = Pattern.compile("\\AA[\\w-]{38}\\z");

    private static f f19120d;

    private final h5.a f19121a;

    private f(h5.a aVar) {
        this.f19121a = aVar;
    }

    public static f c() {
        return d(h5.b.b());
    }

    public static f d(h5.a aVar) {
        if (f19120d == null) {
            f19120d = new f(aVar);
        }
        return f19120d;
    }

    static boolean g(String str) {
        return f19119c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f19121a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(f5.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f19118b;
    }
}
