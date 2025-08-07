package O3;

import a4.InterfaceC1569f;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import n3.C2654l;
import n3.C2656n;
import n3.InterfaceC2655m;

public final class A9 {

    private final InterfaceC2655m f2719a;

    private final AtomicLong f2720b = new AtomicLong(-1);

    A9(Context context, String str) {
        this.f2719a = C2654l.b(context, C2656n.a().b("mlkit:vision").a());
    }

    public static A9 a(Context context) {
        return new A9(context, "mlkit:vision");
    }

    final void b(long j7, Exception exc) {
        this.f2720b.set(j7);
    }

    public final synchronized void c(int i7, int i8, long j7, long j8) {
        AtomicLong atomicLong = this.f2720b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f2720b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f2719a.c(new TelemetryData(0, Arrays.asList(new MethodInvocation(i7, i8, 0, j7, j8, null, null, 0, -1)))).c(new InterfaceC1569f() {
            @Override
            public final void onFailure(Exception exc) {
                this.f3694a.b(jElapsedRealtime, exc);
            }
        });
    }
}
