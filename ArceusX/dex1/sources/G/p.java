package G;

import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

class p<V> implements com.google.common.util.concurrent.p<List<V>> {

    List<? extends com.google.common.util.concurrent.p<? extends V>> f1305d;

    List<V> f1306e;

    private final boolean f1307i;

    private final AtomicInteger f1308v;

    private final com.google.common.util.concurrent.p<List<V>> f1309w = androidx.concurrent.futures.c.a(new a());

    c.a<List<V>> f1310y;

    class a implements c.InterfaceC0078c<List<V>> {
        a() {
        }

        @Override
        public Object a(c.a<List<V>> aVar) {
            x0.g.j(p.this.f1310y == null, "The result can only set once!");
            p.this.f1310y = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override
        public void run() {
            p pVar = p.this;
            pVar.f1306e = null;
            pVar.f1305d = null;
        }
    }

    class c implements Runnable {

        final int f1313d;

        final com.google.common.util.concurrent.p f1314e;

        c(int i7, com.google.common.util.concurrent.p pVar) {
            this.f1313d = i7;
            this.f1314e = pVar;
        }

        @Override
        public void run() {
            p.this.g(this.f1313d, this.f1314e);
        }
    }

    p(List<? extends com.google.common.util.concurrent.p<? extends V>> list, boolean z7, Executor executor) {
        this.f1305d = (List) x0.g.g(list);
        this.f1306e = new ArrayList(list.size());
        this.f1307i = z7;
        this.f1308v = new AtomicInteger(list.size());
        e(executor);
    }

    private void a() throws InterruptedException {
        List<? extends com.google.common.util.concurrent.p<? extends V>> list = this.f1305d;
        if (list == null || isDone()) {
            return;
        }
        for (com.google.common.util.concurrent.p<? extends V> pVar : list) {
            while (!pVar.isDone()) {
                try {
                    pVar.get();
                } catch (Error e7) {
                    throw e7;
                } catch (InterruptedException e8) {
                    throw e8;
                } catch (Throwable unused) {
                    if (this.f1307i) {
                        return;
                    }
                }
            }
        }
    }

    private void e(Executor executor) {
        c(new b(), F.a.a());
        if (this.f1305d.isEmpty()) {
            this.f1310y.c(new ArrayList(this.f1306e));
            return;
        }
        for (int i7 = 0; i7 < this.f1305d.size(); i7++) {
            this.f1306e.add(null);
        }
        List<? extends com.google.common.util.concurrent.p<? extends V>> list = this.f1305d;
        for (int i8 = 0; i8 < list.size(); i8++) {
            com.google.common.util.concurrent.p<? extends V> pVar = list.get(i8);
            pVar.c(new c(i8, pVar), executor);
        }
    }

    @Override
    public List<V> get() throws ExecutionException, InterruptedException {
        a();
        return this.f1309w.get();
    }

    @Override
    public void c(Runnable runnable, Executor executor) {
        this.f1309w.c(runnable, executor);
    }

    @Override
    public boolean cancel(boolean z7) {
        List<? extends com.google.common.util.concurrent.p<? extends V>> list = this.f1305d;
        if (list != null) {
            Iterator<? extends com.google.common.util.concurrent.p<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z7);
            }
        }
        return this.f1309w.cancel(z7);
    }

    @Override
    public List<V> get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f1309w.get(j7, timeUnit);
    }

    void g(int i7, Future<? extends V> future) {
        c.a<List<V>> aVar;
        ArrayList arrayList;
        int iDecrementAndGet;
        List<V> list = this.f1306e;
        if (isDone() || list == null) {
            x0.g.j(this.f1307i, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        x0.g.j(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i7, n.m(future));
                        iDecrementAndGet = this.f1308v.decrementAndGet();
                        x0.g.j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                    } catch (RuntimeException e7) {
                        if (this.f1307i) {
                            this.f1310y.f(e7);
                        }
                        int iDecrementAndGet2 = this.f1308v.decrementAndGet();
                        x0.g.j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet2 != 0) {
                            return;
                        }
                        List<V> list2 = this.f1306e;
                        if (list2 != null) {
                            aVar = this.f1310y;
                            arrayList = new ArrayList(list2);
                        }
                    }
                } catch (ExecutionException e8) {
                    if (this.f1307i) {
                        this.f1310y.f(e8.getCause());
                    }
                    int iDecrementAndGet3 = this.f1308v.decrementAndGet();
                    x0.g.j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet3 != 0) {
                        return;
                    }
                    List<V> list3 = this.f1306e;
                    if (list3 != null) {
                        aVar = this.f1310y;
                        arrayList = new ArrayList(list3);
                    }
                }
            } catch (Error e9) {
                this.f1310y.f(e9);
                int iDecrementAndGet4 = this.f1308v.decrementAndGet();
                x0.g.j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet4 != 0) {
                    return;
                }
                List<V> list4 = this.f1306e;
                if (list4 != null) {
                    aVar = this.f1310y;
                    arrayList = new ArrayList(list4);
                }
            } catch (CancellationException unused) {
                if (this.f1307i) {
                    cancel(false);
                }
                int iDecrementAndGet5 = this.f1308v.decrementAndGet();
                x0.g.j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 != 0) {
                    return;
                }
                List<V> list5 = this.f1306e;
                if (list5 != null) {
                    aVar = this.f1310y;
                    arrayList = new ArrayList(list5);
                }
            }
            if (iDecrementAndGet == 0) {
                List<V> list6 = this.f1306e;
                if (list6 != null) {
                    aVar = this.f1310y;
                    arrayList = new ArrayList(list6);
                    aVar.c(arrayList);
                    return;
                }
                x0.g.i(isDone());
            }
        } catch (Throwable th) {
            int iDecrementAndGet6 = this.f1308v.decrementAndGet();
            x0.g.j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List<V> list7 = this.f1306e;
                if (list7 != null) {
                    this.f1310y.c(new ArrayList(list7));
                } else {
                    x0.g.i(isDone());
                }
            }
            throw th;
        }
    }

    @Override
    public boolean isCancelled() {
        return this.f1309w.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.f1309w.isDone();
    }
}
