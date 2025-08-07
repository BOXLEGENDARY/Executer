package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AbstractFutureC2094k1 extends V implements Future {
    protected AbstractFutureC2094k1() {
    }

    protected abstract Future g();

    @Override
    public final Object get() throws ExecutionException, InterruptedException {
        return g().get();
    }

    @Override
    public final boolean isCancelled() {
        return g().isCancelled();
    }

    @Override
    public final boolean isDone() {
        return g().isDone();
    }

    @Override
    public final Object get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return g().get(j7, timeUnit);
    }
}
