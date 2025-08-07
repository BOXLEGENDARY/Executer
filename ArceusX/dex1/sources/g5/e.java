package g5;

import java.util.concurrent.TimeUnit;

class e {

    private static final long f20987d = TimeUnit.HOURS.toMillis(24);

    private static final long f20988e = TimeUnit.MINUTES.toMillis(30);

    private final com.google.firebase.installations.f f20989a = com.google.firebase.installations.f.c();

    private long f20990b;

    private int f20991c;

    e() {
    }

    private synchronized long a(int i7) {
        if (c(i7)) {
            return (long) Math.min(Math.pow(2.0d, this.f20991c) + this.f20989a.e(), f20988e);
        }
        return f20987d;
    }

    private static boolean c(int i7) {
        return i7 == 429 || (i7 >= 500 && i7 < 600);
    }

    private static boolean d(int i7) {
        return (i7 >= 200 && i7 < 300) || i7 == 401 || i7 == 404;
    }

    private synchronized void e() {
        this.f20991c = 0;
    }

    public synchronized boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: g5.e.b():boolean");
    }

    public synchronized void f(int i7) {
        if (d(i7)) {
            e();
            return;
        }
        this.f20991c++;
        this.f20990b = this.f20989a.a() + a(i7);
    }
}
