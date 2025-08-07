package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class H1 implements Runnable {

    K1 f15814d;

    H1(K1 k1) {
        this.f15814d = k1;
    }

    @Override
    public final void run() {
        InterfaceFutureC2177y1 interfaceFutureC2177y1;
        K1 k1 = this.f15814d;
        if (k1 == null || (interfaceFutureC2177y1 = k1.f15884A) == null) {
            return;
        }
        this.f15814d = null;
        if (interfaceFutureC2177y1.isDone()) {
            k1.q(interfaceFutureC2177y1);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = k1.f15885B;
            k1.f15885B = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    k1.p(new I1(str, null));
                    throw th;
                }
            }
            k1.p(new I1(str + ": " + interfaceFutureC2177y1.toString(), null));
        } finally {
            interfaceFutureC2177y1.cancel(true);
        }
    }
}
