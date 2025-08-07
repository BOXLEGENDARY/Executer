package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

public abstract class AbstractC2106m1 extends AbstractFutureC2094k1 implements InterfaceFutureC2177y1 {
    protected AbstractC2106m1() {
    }

    @Override
    public final void f(Runnable runnable, Executor executor) {
        h().f(runnable, executor);
    }

    protected abstract InterfaceFutureC2177y1 h();
}
