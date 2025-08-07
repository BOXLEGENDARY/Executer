package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class B1 extends AbstractC2070g1 {

    private final ExecutorService f15772d;

    B1(ExecutorService executorService) {
        executorService.getClass();
        this.f15772d = executorService;
    }

    @Override
    public final boolean awaitTermination(long j7, TimeUnit timeUnit) throws InterruptedException {
        return this.f15772d.awaitTermination(j7, timeUnit);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.f15772d.execute(runnable);
    }

    @Override
    public final boolean isShutdown() {
        return this.f15772d.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.f15772d.isTerminated();
    }

    @Override
    public final void shutdown() {
        this.f15772d.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return this.f15772d.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f15772d;
        return super.toString() + "[" + String.valueOf(executorService) + "]";
    }
}
