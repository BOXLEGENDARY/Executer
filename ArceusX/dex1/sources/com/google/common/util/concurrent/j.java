package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class j<V> extends m<V> {

    static abstract class a<V> extends j<V> implements a.i<V> {
        a() {
        }

        @Override
        public final void c(Runnable runnable, Executor executor) {
            super.c(runnable, executor);
        }

        @Override
        public final boolean cancel(boolean z7) {
            return super.cancel(z7);
        }

        @Override
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override
        public final boolean isDone() {
            return super.isDone();
        }

        @Override
        public final V get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j7, timeUnit);
        }
    }

    j() {
    }
}
