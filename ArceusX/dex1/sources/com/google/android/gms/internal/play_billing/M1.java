package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

final class M1 extends C2082i1 implements RunnableFuture {

    private volatile AbstractRunnableC2165w1 f15903A;

    M1(Callable callable) {
        this.f15903A = new L1(this, callable);
    }

    static M1 B(Runnable runnable, Object obj) {
        return new M1(Executors.callable(runnable, obj));
    }

    @Override
    protected final String i() {
        AbstractRunnableC2165w1 abstractRunnableC2165w1 = this.f15903A;
        if (abstractRunnableC2165w1 == null) {
            return super.i();
        }
        return "task=[" + abstractRunnableC2165w1.toString() + "]";
    }

    @Override
    protected final void n() {
        AbstractRunnableC2165w1 abstractRunnableC2165w1;
        if (r() && (abstractRunnableC2165w1 = this.f15903A) != null) {
            abstractRunnableC2165w1.e();
        }
        this.f15903A = null;
    }

    @Override
    public final void run() {
        AbstractRunnableC2165w1 abstractRunnableC2165w1 = this.f15903A;
        if (abstractRunnableC2165w1 != null) {
            abstractRunnableC2165w1.run();
        }
        this.f15903A = null;
    }
}
