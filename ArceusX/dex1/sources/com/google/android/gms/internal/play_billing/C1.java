package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class C1 extends C2100l1 implements ScheduledFuture, InterfaceFutureC2177y1 {

    private final ScheduledFuture f15776e;

    public C1(InterfaceFutureC2177y1 interfaceFutureC2177y1, ScheduledFuture scheduledFuture) {
        super(interfaceFutureC2177y1);
        this.f15776e = scheduledFuture;
    }

    @Override
    public final boolean cancel(boolean z7) {
        boolean zCancel = g().cancel(z7);
        if (zCancel) {
            this.f15776e.cancel(z7);
        }
        return zCancel;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f15776e.compareTo(delayed);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f15776e.getDelay(timeUnit);
    }
}
