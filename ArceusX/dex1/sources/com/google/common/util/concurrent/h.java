package com.google.common.util.concurrent;

import com.google.common.util.concurrent.e;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class h<V> extends e<Object, V> {

    private h<V>.b<?> f18959I;

    private final class a extends h<V>.b<V> {

        private final Callable<V> f18960w;

        a(Callable<V> callable, Executor executor) {
            super(executor);
            this.f18960w = (Callable) K4.g.g(callable);
        }

        @Override
        V e() throws Exception {
            return this.f18960w.call();
        }

        @Override
        String f() {
            return this.f18960w.toString();
        }

        @Override
        void i(V v7) {
            h.this.D(v7);
        }
    }

    private abstract class b<T> extends o<T> {

        private final Executor f18962i;

        b(Executor executor) {
            this.f18962i = (Executor) K4.g.g(executor);
        }

        @Override
        final void a(Throwable th) {
            h.this.f18959I = null;
            if (th instanceof ExecutionException) {
                h.this.E(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                h.this.cancel(false);
            } else {
                h.this.E(th);
            }
        }

        @Override
        final void b(T t7) {
            h.this.f18959I = null;
            i(t7);
        }

        @Override
        final boolean d() {
            return h.this.isDone();
        }

        final void h() {
            try {
                this.f18962i.execute(this);
            } catch (RejectedExecutionException e7) {
                h.this.E(e7);
            }
        }

        abstract void i(T t7);
    }

    h(L4.b<? extends p<?>> bVar, boolean z7, Executor executor, Callable<V> callable) {
        super(bVar, z7, false);
        this.f18959I = new a(callable, executor);
        W();
    }

    @Override
    void R(int i7, Object obj) {
    }

    @Override
    void U() {
        h<V>.b<?> bVar = this.f18959I;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override
    void b0(e.a aVar) {
        super.b0(aVar);
        if (aVar == e.a.OUTPUT_FUTURE_DONE) {
            this.f18959I = null;
        }
    }

    @Override
    protected void y() {
        h<V>.b<?> bVar = this.f18959I;
        if (bVar != null) {
            bVar.c();
        }
    }
}
