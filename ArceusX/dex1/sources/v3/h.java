package v3;

import android.os.SystemClock;

public class h implements e {

    private static final h f24139a = new h();

    private h() {
    }

    public static e c() {
        return f24139a;
    }

    @Override
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public final long nanoTime() {
        return System.nanoTime();
    }
}
