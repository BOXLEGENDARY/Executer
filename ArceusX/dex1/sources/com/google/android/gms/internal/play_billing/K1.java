package com.google.android.gms.internal.play_billing;

import androidx.room.kU.HguUe;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class K1 extends C2082i1 {

    private InterfaceFutureC2177y1 f15884A;

    private ScheduledFuture f15885B;

    private K1(InterfaceFutureC2177y1 interfaceFutureC2177y1) {
        this.f15884A = interfaceFutureC2177y1;
    }

    static InterfaceFutureC2177y1 C(InterfaceFutureC2177y1 interfaceFutureC2177y1, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        K1 k1 = new K1(interfaceFutureC2177y1);
        H1 h12 = new H1(k1);
        k1.f15885B = scheduledExecutorService.schedule(h12, 28500L, timeUnit);
        interfaceFutureC2177y1.f(h12, EnumC2076h1.INSTANCE);
        return k1;
    }

    @Override
    protected final String i() {
        InterfaceFutureC2177y1 interfaceFutureC2177y1 = this.f15884A;
        ScheduledFuture scheduledFuture = this.f15885B;
        if (interfaceFutureC2177y1 == null) {
            return null;
        }
        String str = "inputFuture=[" + interfaceFutureC2177y1.toString() + HguUe.GByYOLpD;
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override
    protected final void n() {
        InterfaceFutureC2177y1 interfaceFutureC2177y1 = this.f15884A;
        if ((interfaceFutureC2177y1 != null) & isCancelled()) {
            interfaceFutureC2177y1.cancel(r());
        }
        ScheduledFuture scheduledFuture = this.f15885B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f15884A = null;
        this.f15885B = null;
    }
}
