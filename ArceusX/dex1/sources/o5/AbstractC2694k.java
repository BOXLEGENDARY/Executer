package o5;

import a4.AbstractC1564a;
import a4.C1565b;
import a4.C1574k;
import a4.C1576m;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k5.C2518a;
import n3.C2651i;

public abstract class AbstractC2694k {

    protected final o f22446a;

    private final AtomicInteger f22447b;

    private final AtomicBoolean f22448c;

    public AbstractC2694k() {
        this.f22447b = new AtomicInteger(0);
        this.f22448c = new AtomicBoolean(false);
        this.f22446a = new o();
    }

    public <T> Task<T> a(final Executor executor, final Callable<T> callable, final AbstractC1564a abstractC1564a) {
        C2651i.p(this.f22447b.get() > 0);
        if (abstractC1564a.a()) {
            return C1576m.d();
        }
        final C1565b c1565b = new C1565b();
        final C1574k c1574k = new C1574k(c1565b.b());
        this.f22446a.a(new Executor() {
            @Override
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e7) {
                    if (abstractC1564a.a()) {
                        c1565b.a();
                    } else {
                        c1574k.b(e7);
                    }
                    throw e7;
                }
            }
        }, new Runnable() {
            @Override
            public final void run() throws Exception {
                this.f22420d.g(abstractC1564a, c1565b, callable, c1574k);
            }
        });
        return c1574k.a();
    }

    public abstract void b() throws C2518a;

    public void c() {
        this.f22447b.incrementAndGet();
    }

    protected abstract void d();

    public void e(Executor executor) {
        f(executor);
    }

    public Task<Void> f(Executor executor) {
        C2651i.p(this.f22447b.get() > 0);
        final C1574k c1574k = new C1574k();
        this.f22446a.a(executor, new Runnable() {
            @Override
            public final void run() {
                this.f22504d.h(c1574k);
            }
        });
        return c1574k.a();
    }

    final void g(AbstractC1564a abstractC1564a, C1565b c1565b, Callable callable, C1574k c1574k) throws Exception {
        try {
            if (abstractC1564a.a()) {
                c1565b.a();
                return;
            }
            try {
                if (!this.f22448c.get()) {
                    b();
                    this.f22448c.set(true);
                }
                if (abstractC1564a.a()) {
                    c1565b.a();
                    return;
                }
                Object objCall = callable.call();
                if (abstractC1564a.a()) {
                    c1565b.a();
                } else {
                    c1574k.c(objCall);
                }
            } catch (RuntimeException e7) {
                throw new C2518a("Internal error has occurred when executing ML Kit tasks", 13, e7);
            }
        } catch (Exception e8) {
            if (abstractC1564a.a()) {
                c1565b.a();
            } else {
                c1574k.b(e8);
            }
        }
    }

    final void h(C1574k c1574k) {
        int iDecrementAndGet = this.f22447b.decrementAndGet();
        C2651i.p(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            d();
            this.f22448c.set(false);
        }
        N3.B.a();
        c1574k.c(null);
    }

    protected AbstractC2694k(o oVar) {
        this.f22447b = new AtomicInteger(0);
        this.f22448c = new AtomicBoolean(false);
        this.f22446a = oVar;
    }
}
