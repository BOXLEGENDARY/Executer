package S3;

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

public final class C1462t9 {

    private final InterfaceC2655m f7139a;

    private final AtomicLong f7140b = new AtomicLong(-1);

    C1462t9(Context context, String str) {
        this.f7139a = C2654l.b(context, C2656n.a().b("mlkit:vision").a());
    }

    public static C1462t9 a(Context context) {
        return new C1462t9(context, "mlkit:vision");
    }

    final void b(long j7, Exception exc) {
        this.f7140b.set(j7);
    }

    public final synchronized void c(int i7, int i8, long j7, long j8) {
        AtomicLong atomicLong = this.f7140b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f7140b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f7139a.c(new TelemetryData(0, Arrays.asList(new MethodInvocation(i7, i8, 0, j7, j8, null, null, 0, -1)))).c(new InterfaceC1569f() {
            @Override
            public final void onFailure(Exception exc) {
                this.f7129a.b(jElapsedRealtime, exc);
            }
        });
    }
}
