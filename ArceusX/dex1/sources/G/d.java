package G;

import androidx.concurrent.futures.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n.InterfaceC2621a;
import ya.HnSi.PLHvHoayk;

public class d<V> implements com.google.common.util.concurrent.p<V> {

    private final com.google.common.util.concurrent.p<V> f1272d;

    c.a<V> f1273e;

    class a implements c.InterfaceC0078c<V> {
        a() {
        }

        @Override
        public Object a(c.a<V> aVar) {
            x0.g.j(d.this.f1273e == null, PLHvHoayk.rwLiazCIOWOLwp);
            d.this.f1273e = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    d(com.google.common.util.concurrent.p<V> pVar) {
        this.f1272d = (com.google.common.util.concurrent.p) x0.g.g(pVar);
    }

    public static <V> d<V> a(com.google.common.util.concurrent.p<V> pVar) {
        return pVar instanceof d ? (d) pVar : new d<>(pVar);
    }

    boolean b(V v7) {
        c.a<V> aVar = this.f1273e;
        if (aVar != null) {
            return aVar.c(v7);
        }
        return false;
    }

    @Override
    public void c(Runnable runnable, Executor executor) {
        this.f1272d.c(runnable, executor);
    }

    @Override
    public boolean cancel(boolean z7) {
        return this.f1272d.cancel(z7);
    }

    boolean d(Throwable th) {
        c.a<V> aVar = this.f1273e;
        if (aVar != null) {
            return aVar.f(th);
        }
        return false;
    }

    public final <T> d<T> e(InterfaceC2621a<? super V, T> interfaceC2621a, Executor executor) {
        return (d) n.G(this, interfaceC2621a, executor);
    }

    public final <T> d<T> g(G.a<? super V, T> aVar, Executor executor) {
        return (d) n.H(this, aVar, executor);
    }

    @Override
    public V get() throws ExecutionException, InterruptedException {
        return this.f1272d.get();
    }

    @Override
    public boolean isCancelled() {
        return this.f1272d.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.f1272d.isDone();
    }

    @Override
    public V get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f1272d.get(j7, timeUnit);
    }

    d() {
        this.f1272d = androidx.concurrent.futures.c.a(new a());
    }
}
