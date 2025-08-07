package Q3;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class C0916k5 implements Closeable {

    private static final Map f4447A = new HashMap();

    private final String f4448d;

    private int f4449e;

    private double f4450i;

    private long f4451v;

    private long f4452w;

    private long f4453y;

    private long f4454z;

    private C0916k5(String str) {
        this.f4453y = 2147483647L;
        this.f4454z = -2147483648L;
        this.f4448d = str;
    }

    private final void b() {
        this.f4449e = 0;
        this.f4450i = 0.0d;
        this.f4451v = 0L;
        this.f4453y = 2147483647L;
        this.f4454z = -2147483648L;
    }

    public static C0916k5 m(String str) {
        K5.a();
        if (!K5.b()) {
            return C0902i5.f4416B;
        }
        Map map = f4447A;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C0916k5("detectorTaskWithResource#run"));
        }
        return (C0916k5) map.get("detectorTaskWithResource#run");
    }

    @Override
    public void close() {
        long j7 = this.f4451v;
        if (j7 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        j(j7);
    }

    public C0916k5 e() {
        this.f4451v = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void f(long j7) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j8 = this.f4452w;
        if (j8 != 0 && jElapsedRealtimeNanos - j8 >= 1000000) {
            b();
        }
        this.f4452w = jElapsedRealtimeNanos;
        this.f4449e++;
        this.f4450i += j7;
        this.f4453y = Math.min(this.f4453y, j7);
        this.f4454z = Math.max(this.f4454z, j7);
        if (this.f4449e % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f4448d, Long.valueOf(j7), Integer.valueOf(this.f4449e), Long.valueOf(this.f4453y), Long.valueOf(this.f4454z), Integer.valueOf((int) (this.f4450i / this.f4449e)));
            K5.a();
        }
        if (this.f4449e % 500 == 0) {
            b();
        }
    }

    public void j(long j7) {
        f((SystemClock.elapsedRealtimeNanos() / 1000) - j7);
    }
}
