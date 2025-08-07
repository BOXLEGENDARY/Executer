package X;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class g0 implements h0 {
    @Override
    public long a() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    @Override
    public long b() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }
}
