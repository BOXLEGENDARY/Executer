package com.google.android.gms.internal.play_billing;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class AbstractC2070g1 extends AbstractExecutorService implements InterfaceExecutorServiceC2183z1 {
    @Override
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return M1.B(runnable, obj);
    }

    @Override
    public final Future submit(Runnable runnable) {
        return (InterfaceFutureC2177y1) super.submit(runnable);
    }

    @Override
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new M1(callable);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC2177y1) super.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return (InterfaceFutureC2177y1) super.submit(callable);
    }
}
