package com.google.android.gms.internal.play_billing;

final class D1 extends X0 implements Runnable {

    private final Runnable f15787A;

    public D1(Runnable runnable) {
        runnable.getClass();
        this.f15787A = runnable;
    }

    @Override
    protected final String i() {
        return "task=[" + this.f15787A.toString() + "]";
    }

    @Override
    public final void run() {
        try {
            this.f15787A.run();
        } catch (Throwable th) {
            p(th);
            throw th;
        }
    }
}
