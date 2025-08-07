package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

final class C2141s1 implements InterfaceFutureC2177y1 {

    private static final C2171x1 f16147e = new C2171x1(C2141s1.class);

    private final Object f16148d;

    C2141s1(Object obj) {
        this.f16148d = obj;
    }

    @Override
    public final boolean cancel(boolean z7) {
        return false;
    }

    @Override
    public final void f(Runnable runnable, Executor executor) {
        C2145t.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            f16147e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e7);
        }
    }

    @Override
    public final Object get() {
        return this.f16148d;
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f16148d;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override
    public final Object get(long j7, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f16148d;
    }
}
