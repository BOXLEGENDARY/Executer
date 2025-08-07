package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class F1 extends B1 implements A1 {

    final ScheduledExecutorService f15801e;

    F1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f15801e = scheduledExecutorService;
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f15801e;
        M1 m1B = M1.B(runnable, null);
        return new C1(m1B, scheduledExecutorService.schedule(m1B, j7, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        D1 d12 = new D1(runnable);
        return new C1(d12, this.f15801e.scheduleAtFixedRate(d12, j7, j8, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
        D1 d12 = new D1(runnable);
        return new C1(d12, this.f15801e.scheduleWithFixedDelay(d12, j7, j8, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j7, TimeUnit timeUnit) {
        M1 m1 = new M1(callable);
        return new C1(m1, this.f15801e.schedule(m1, j7, timeUnit));
    }
}
