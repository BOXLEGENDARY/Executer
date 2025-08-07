package z;

import C.AbstractC0324e0;
import C.c1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import x0.InterfaceC2984a;

public final class F0 {

    public static final Range<Integer> f24495p = c1.f534a;

    private final Object f24496a = new Object();

    private final Size f24497b;

    private final C3070z f24498c;

    private final Range<Integer> f24499d;

    private final C.J f24500e;

    private final boolean f24501f;

    final com.google.common.util.concurrent.p<Surface> f24502g;

    private final c.a<Surface> f24503h;

    private final com.google.common.util.concurrent.p<Void> f24504i;

    private final c.a<Void> f24505j;

    private final c.a<Void> f24506k;

    private final AbstractC0324e0 f24507l;

    private h f24508m;

    private i f24509n;

    private Executor f24510o;

    class a implements G.c<Void> {

        final c.a f24511a;

        final com.google.common.util.concurrent.p f24512b;

        a(c.a aVar, com.google.common.util.concurrent.p pVar) {
            this.f24511a = aVar;
            this.f24512b = pVar;
        }

        @Override
        public void onSuccess(Void r22) {
            x0.g.i(this.f24511a.c(null));
        }

        @Override
        public void onFailure(Throwable th) {
            if (th instanceof f) {
                x0.g.i(this.f24512b.cancel(false));
            } else {
                x0.g.i(this.f24511a.c(null));
            }
        }
    }

    class b extends AbstractC0324e0 {
        b(Size size, int i7) {
            super(size, i7);
        }

        @Override
        protected com.google.common.util.concurrent.p<Surface> r() {
            return F0.this.f24502g;
        }
    }

    class c implements G.c<Surface> {

        final com.google.common.util.concurrent.p f24515a;

        final c.a f24516b;

        final String f24517c;

        c(com.google.common.util.concurrent.p pVar, c.a aVar, String str) {
            this.f24515a = pVar;
            this.f24516b = aVar;
            this.f24517c = str;
        }

        @Override
        public void onSuccess(Surface surface) {
            G.n.C(this.f24515a, this.f24516b);
        }

        @Override
        public void onFailure(Throwable th) {
            if (!(th instanceof CancellationException)) {
                this.f24516b.c(null);
                return;
            }
            x0.g.i(this.f24516b.f(new f(this.f24517c + " cancelled.", th)));
        }
    }

    class d implements G.c<Void> {

        final InterfaceC2984a f24519a;

        final Surface f24520b;

        d(InterfaceC2984a interfaceC2984a, Surface surface) {
            this.f24519a = interfaceC2984a;
            this.f24520b = surface;
        }

        @Override
        public void onSuccess(Void r32) {
            this.f24519a.accept(g.c(0, this.f24520b));
        }

        @Override
        public void onFailure(Throwable th) {
            x0.g.j(th instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f24519a.accept(g.c(1, this.f24520b));
        }
    }

    class e implements G.c<Void> {

        final Runnable f24522a;

        e(Runnable runnable) {
            this.f24522a = runnable;
        }

        @Override
        public void onSuccess(Void r1) {
            this.f24522a.run();
        }

        @Override
        public void onFailure(Throwable th) {
        }
    }

    private static final class f extends RuntimeException {
        f(String str, Throwable th) {
            super(str, th);
        }
    }

    public static abstract class g {
        g() {
        }

        static g c(int i7, Surface surface) {
            return new C3048g(i7, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    public static abstract class h {
        h() {
        }

        public static h g(Rect rect, int i7, int i8, boolean z7, Matrix matrix, boolean z8) {
            return new C3050h(rect, i7, i8, z7, matrix, z8);
        }

        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public interface i {
        void a(h hVar);
    }

    public F0(Size size, C.J j7, boolean z7, C3070z c3070z, Range<Integer> range, Runnable runnable) {
        this.f24497b = size;
        this.f24500e = j7;
        this.f24501f = z7;
        this.f24498c = c3070z;
        this.f24499d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        com.google.common.util.concurrent.p pVarA = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return F0.v(atomicReference, str, aVar);
            }
        });
        c.a<Void> aVar = (c.a) x0.g.g((c.a) atomicReference.get());
        this.f24506k = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        com.google.common.util.concurrent.p<Void> pVarA2 = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar2) {
                return F0.w(atomicReference2, str, aVar2);
            }
        });
        this.f24504i = pVarA2;
        G.n.j(pVarA2, new a(aVar, pVarA), F.a.a());
        c.a aVar2 = (c.a) x0.g.g((c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        com.google.common.util.concurrent.p<Surface> pVarA3 = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar3) {
                return F0.x(atomicReference3, str, aVar3);
            }
        });
        this.f24502g = pVarA3;
        this.f24503h = (c.a) x0.g.g((c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f24507l = bVar;
        com.google.common.util.concurrent.p<Void> pVarK = bVar.k();
        G.n.j(pVarA3, new c(pVarK, aVar2, str), F.a.a());
        pVarK.c(new Runnable() {
            @Override
            public final void run() {
                this.f24477d.y();
            }
        }, F.a.a());
        this.f24505j = q(F.a.a(), runnable);
    }

    public static void A(InterfaceC2984a interfaceC2984a, Surface surface) {
        interfaceC2984a.accept(g.c(4, surface));
    }

    private c.a<Void> q(Executor executor, Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        G.n.j(androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return this.f24493a.u(atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (c.a) x0.g.g((c.a) atomicReference.get());
    }

    public Object u(AtomicReference atomicReference, c.a aVar) throws Exception {
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    public static Object v(AtomicReference atomicReference, String str, c.a aVar) throws Exception {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static Object w(AtomicReference atomicReference, String str, c.a aVar) throws Exception {
        atomicReference.set(aVar);
        return str + "-status";
    }

    public static Object x(AtomicReference atomicReference, String str, c.a aVar) throws Exception {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public void y() {
        this.f24502g.cancel(true);
    }

    public static void z(InterfaceC2984a interfaceC2984a, Surface surface) {
        interfaceC2984a.accept(g.c(3, surface));
    }

    public void D(final Surface surface, Executor executor, final InterfaceC2984a<g> interfaceC2984a) throws ExecutionException, InterruptedException {
        if (this.f24503h.c(surface) || this.f24502g.isCancelled()) {
            G.n.j(this.f24504i, new d(interfaceC2984a, surface), executor);
            return;
        }
        x0.g.i(this.f24502g.isDone());
        try {
            this.f24502g.get();
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    F0.z(interfaceC2984a, surface);
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    F0.A(interfaceC2984a, surface);
                }
            });
        }
    }

    public void E(Executor executor, final i iVar) {
        final h hVar;
        synchronized (this.f24496a) {
            this.f24509n = iVar;
            this.f24510o = executor;
            hVar = this.f24508m;
        }
        if (hVar != null) {
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    iVar.a(hVar);
                }
            });
        }
    }

    public void F(final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f24496a) {
            this.f24508m = hVar;
            iVar = this.f24509n;
            executor = this.f24510o;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() {
            @Override
            public final void run() {
                iVar.a(hVar);
            }
        });
    }

    public boolean G() {
        return this.f24503h.f(new AbstractC0324e0.b("Surface request will not complete."));
    }

    public void j(Executor executor, Runnable runnable) {
        this.f24506k.a(runnable, executor);
    }

    public void k() {
        synchronized (this.f24496a) {
            this.f24509n = null;
            this.f24510o = null;
        }
    }

    public C.J l() {
        return this.f24500e;
    }

    public AbstractC0324e0 m() {
        return this.f24507l;
    }

    public C3070z n() {
        return this.f24498c;
    }

    public Range<Integer> o() {
        return this.f24499d;
    }

    public Size p() {
        return this.f24497b;
    }

    public boolean r() {
        G();
        return this.f24505j.c(null);
    }

    public boolean s() {
        return this.f24501f;
    }

    public boolean t() {
        return this.f24502g.isDone();
    }
}
