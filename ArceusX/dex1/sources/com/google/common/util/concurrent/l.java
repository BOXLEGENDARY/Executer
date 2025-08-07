package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class l extends n {

    public static final class a<V> {

        private final boolean f18966a;

        private final L4.c<p<? extends V>> f18967b;

        a(boolean z7, L4.c cVar, k kVar) {
            this(z7, cVar);
        }

        public <C> p<C> a(Callable<C> callable, Executor executor) {
            return new h(this.f18967b, this.f18966a, executor, callable);
        }

        private a(boolean z7, L4.c<p<? extends V>> cVar) {
            this.f18966a = z7;
            this.f18967b = cVar;
        }
    }

    public static <V> V a(Future<V> future) throws ExecutionException {
        K4.g.n(future.isDone(), "Future was expected to be done: %s", future);
        return (V) v.a(future);
    }

    public static <I, O> p<O> b(p<I> pVar, g<? super I, ? extends O> gVar, Executor executor) {
        return b.H(pVar, gVar, executor);
    }

    @SafeVarargs
    public static <V> a<V> c(p<? extends V>... pVarArr) {
        return new a<>(false, L4.c.o(pVarArr), null);
    }
}
