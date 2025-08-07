package G;

import G.o;
import androidx.appcompat.app.FN.krlBPZZeK;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n.InterfaceC2621a;

public final class n {

    private static final InterfaceC2621a<?, ?> f1295a = new b();

    class a<I, O> implements G.a<I, O> {

        final InterfaceC2621a f1296a;

        a(InterfaceC2621a interfaceC2621a) {
            this.f1296a = interfaceC2621a;
        }

        @Override
        public com.google.common.util.concurrent.p<O> apply(I i7) {
            return n.p(this.f1296a.apply(i7));
        }
    }

    class b implements InterfaceC2621a<Object, Object> {
        b() {
        }

        @Override
        public Object apply(Object obj) {
            return obj;
        }
    }

    class c<I> implements G.c<I> {

        final c.a f1297a;

        final InterfaceC2621a f1298b;

        c(c.a aVar, InterfaceC2621a interfaceC2621a) {
            this.f1297a = aVar;
            this.f1298b = interfaceC2621a;
        }

        @Override
        public void onFailure(Throwable th) {
            this.f1297a.f(th);
        }

        @Override
        public void onSuccess(I i7) {
            try {
                this.f1297a.c(this.f1298b.apply(i7));
            } catch (Throwable th) {
                this.f1297a.f(th);
            }
        }
    }

    class d implements Runnable {

        final com.google.common.util.concurrent.p f1299d;

        d(com.google.common.util.concurrent.p pVar) {
            this.f1299d = pVar;
        }

        @Override
        public void run() {
            this.f1299d.cancel(true);
        }
    }

    private static final class e<V> implements Runnable {

        final Future<V> f1300d;

        final G.c<? super V> f1301e;

        e(Future<V> future, G.c<? super V> cVar) {
            this.f1300d = future;
            this.f1301e = cVar;
        }

        @Override
        public void run() {
            try {
                this.f1301e.onSuccess(n.l(this.f1300d));
            } catch (Error e7) {
                e = e7;
                this.f1301e.onFailure(e);
            } catch (RuntimeException e8) {
                e = e8;
                this.f1301e.onFailure(e);
            } catch (ExecutionException e9) {
                Throwable cause = e9.getCause();
                if (cause == null) {
                    this.f1301e.onFailure(e9);
                } else {
                    this.f1301e.onFailure(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f1301e;
        }
    }

    public static <V> com.google.common.util.concurrent.p<V> A(final long j7, final ScheduledExecutorService scheduledExecutorService, final V v7, final boolean z7, final com.google.common.util.concurrent.p<V> pVar) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return n.v(pVar, scheduledExecutorService, v7, z7, j7, aVar);
            }
        });
    }

    public static <V> com.google.common.util.concurrent.p<V> B(final com.google.common.util.concurrent.p<V> pVar) {
        x0.g.g(pVar);
        return pVar.isDone() ? pVar : androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return n.w(pVar, aVar);
            }
        });
    }

    public static <V> void C(com.google.common.util.concurrent.p<V> pVar, c.a<V> aVar) {
        D(pVar, f1295a, aVar, F.a.a());
    }

    public static <I, O> void D(com.google.common.util.concurrent.p<I> pVar, InterfaceC2621a<? super I, ? extends O> interfaceC2621a, c.a<O> aVar, Executor executor) {
        E(true, pVar, interfaceC2621a, aVar, executor);
    }

    private static <I, O> void E(boolean z7, com.google.common.util.concurrent.p<I> pVar, InterfaceC2621a<? super I, ? extends O> interfaceC2621a, c.a<O> aVar, Executor executor) {
        x0.g.g(pVar);
        x0.g.g(interfaceC2621a);
        x0.g.g(aVar);
        x0.g.g(executor);
        j(pVar, new c(aVar, interfaceC2621a), executor);
        if (z7) {
            aVar.a(new d(pVar), F.a.a());
        }
    }

    public static <V> com.google.common.util.concurrent.p<List<V>> F(Collection<? extends com.google.common.util.concurrent.p<? extends V>> collection) {
        return new p(new ArrayList(collection), false, F.a.a());
    }

    public static <I, O> com.google.common.util.concurrent.p<O> G(com.google.common.util.concurrent.p<I> pVar, InterfaceC2621a<? super I, ? extends O> interfaceC2621a, Executor executor) {
        x0.g.g(interfaceC2621a);
        return H(pVar, new a(interfaceC2621a), executor);
    }

    public static <I, O> com.google.common.util.concurrent.p<O> H(com.google.common.util.concurrent.p<I> pVar, G.a<? super I, ? extends O> aVar, Executor executor) {
        G.b bVar = new G.b(aVar, pVar);
        pVar.c(bVar, executor);
        return bVar;
    }

    public static <V> com.google.common.util.concurrent.p<Void> I(final com.google.common.util.concurrent.p<V> pVar) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return n.y(pVar, aVar);
            }
        });
    }

    public static <V> void j(com.google.common.util.concurrent.p<V> pVar, G.c<? super V> cVar, Executor executor) {
        x0.g.g(cVar);
        pVar.c(new e(pVar, cVar), executor);
    }

    public static <V> com.google.common.util.concurrent.p<List<V>> k(Collection<? extends com.google.common.util.concurrent.p<? extends V>> collection) {
        return new p(new ArrayList(collection), true, F.a.a());
    }

    public static <V> V l(Future<V> future) throws ExecutionException {
        x0.g.j(future.isDone(), "Future was expected to be done, " + future);
        return (V) m(future);
    }

    public static <V> V m(Future<V> future) throws ExecutionException {
        V v7;
        boolean z7 = false;
        while (true) {
            try {
                v7 = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return v7;
    }

    public static <V> com.google.common.util.concurrent.p<V> n(Throwable th) {
        return new o.a(th);
    }

    public static <V> ScheduledFuture<V> o(Throwable th) {
        return new o.b(th);
    }

    public static <V> com.google.common.util.concurrent.p<V> p(V v7) {
        return v7 == null ? o.e() : new o.c(v7);
    }

    public static Boolean q(c.a aVar, com.google.common.util.concurrent.p pVar, long j7) throws Exception {
        return Boolean.valueOf(aVar.f(new TimeoutException("Future[" + pVar + "] is not done within " + j7 + " ms.")));
    }

    public static Object s(final com.google.common.util.concurrent.p pVar, ScheduledExecutorService scheduledExecutorService, final long j7, final c.a aVar) throws Exception {
        C(pVar, aVar);
        if (!pVar.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() {
                @Override
                public final Object call() {
                    return n.q(aVar, pVar, j7);
                }
            }, j7, TimeUnit.MILLISECONDS);
            pVar.c(new Runnable() {
                @Override
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, F.a.a());
        }
        return "TimeoutFuture[" + pVar + krlBPZZeK.aWnJ;
    }

    public static void t(c.a aVar, Object obj, boolean z7, com.google.common.util.concurrent.p pVar) {
        aVar.c(obj);
        if (z7) {
            pVar.cancel(true);
        }
    }

    public static Object v(final com.google.common.util.concurrent.p pVar, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z7, long j7, final c.a aVar) throws Exception {
        C(pVar, aVar);
        if (!pVar.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() {
                @Override
                public final void run() {
                    n.t(aVar, obj, z7, pVar);
                }
            }, j7, TimeUnit.MILLISECONDS);
            pVar.c(new Runnable() {
                @Override
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, F.a.a());
        }
        return "TimeoutFuture[" + pVar + "]";
    }

    public static Object w(com.google.common.util.concurrent.p pVar, c.a aVar) throws Exception {
        E(false, pVar, f1295a, aVar, F.a.a());
        return "nonCancellationPropagating[" + pVar + "]";
    }

    public static Object y(com.google.common.util.concurrent.p pVar, final c.a aVar) throws Exception {
        pVar.c(new Runnable() {
            @Override
            public final void run() {
                aVar.c(null);
            }
        }, F.a.a());
        return "transformVoidFuture [" + pVar + "]";
    }

    public static <V> com.google.common.util.concurrent.p<V> z(final long j7, final ScheduledExecutorService scheduledExecutorService, final com.google.common.util.concurrent.p<V> pVar) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return n.s(pVar, scheduledExecutorService, j7, aVar);
            }
        });
    }
}
