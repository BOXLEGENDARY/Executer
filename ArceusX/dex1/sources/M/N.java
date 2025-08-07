package M;

import C.AbstractC0324e0;
import C.c1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import x0.InterfaceC2984a;
import z.F0;
import z.u0;

public class N {

    private final int f2200a;

    private final Matrix f2201b;

    private final boolean f2202c;

    private final Rect f2203d;

    private final boolean f2204e;

    private final int f2205f;

    private final c1 f2206g;

    private int f2207h;

    private int f2208i;

    private F0 f2210k;

    private a f2211l;

    private boolean f2209j = false;

    private final Set<Runnable> f2212m = new HashSet();

    private boolean f2213n = false;

    private final List<InterfaceC2984a<F0.h>> f2214o = new ArrayList();

    static class a extends AbstractC0324e0 {

        final com.google.common.util.concurrent.p<Surface> f2215o;

        c.a<Surface> f2216p;

        private AbstractC0324e0 f2217q;

        private Q f2218r;

        a(Size size, int i7) {
            super(size, i7);
            this.f2215o = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
                @Override
                public final Object a(c.a aVar) {
                    return this.f2198a.n(aVar);
                }
            });
        }

        public Object n(c.a aVar) throws Exception {
            this.f2216p = aVar;
            return "SettableFuture hashCode: " + hashCode();
        }

        public void w() {
            Q q7 = this.f2218r;
            if (q7 != null) {
                q7.A();
            }
            if (this.f2217q == null) {
                this.f2216p.d();
            }
        }

        @Override
        public void d() {
            super.d();
            E.p.d(new Runnable() {
                @Override
                public final void run() {
                    this.f2197d.w();
                }
            });
        }

        @Override
        protected com.google.common.util.concurrent.p<Surface> r() {
            return this.f2215o;
        }

        boolean v() {
            E.p.a();
            return this.f2217q == null && !m();
        }

        public void x(Q q7) {
            x0.g.j(this.f2218r == null, "Consumer can only be linked once.");
            this.f2218r = q7;
        }

        public boolean y(final AbstractC0324e0 abstractC0324e0, Runnable runnable) throws AbstractC0324e0.a {
            E.p.a();
            x0.g.g(abstractC0324e0);
            AbstractC0324e0 abstractC0324e02 = this.f2217q;
            if (abstractC0324e02 == abstractC0324e0) {
                return false;
            }
            x0.g.j(abstractC0324e02 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            x0.g.b(h().equals(abstractC0324e0.h()), String.format("The provider's size(%s) must match the parent(%s)", h(), abstractC0324e0.h()));
            x0.g.b(i() == abstractC0324e0.i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i()), Integer.valueOf(abstractC0324e0.i())));
            x0.g.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f2217q = abstractC0324e0;
            G.n.C(abstractC0324e0.j(), this.f2216p);
            abstractC0324e0.l();
            k().c(new Runnable() {
                @Override
                public final void run() {
                    abstractC0324e0.e();
                }
            }, F.a.a());
            abstractC0324e0.f().c(runnable, F.a.d());
            return true;
        }
    }

    public N(int i7, int i8, c1 c1Var, Matrix matrix, boolean z7, Rect rect, int i9, int i10, boolean z8) {
        this.f2205f = i7;
        this.f2200a = i8;
        this.f2206g = c1Var;
        this.f2201b = matrix;
        this.f2202c = z7;
        this.f2203d = rect;
        this.f2208i = i9;
        this.f2207h = i10;
        this.f2204e = z8;
        this.f2211l = new a(c1Var.e(), i8);
    }

    public void A(int i7, int i8) {
        boolean z7;
        boolean z8 = true;
        if (this.f2208i != i7) {
            this.f2208i = i7;
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f2207h != i8) {
            this.f2207h = i8;
        } else {
            z8 = z7;
        }
        if (z8) {
            B();
        }
    }

    private void B() {
        E.p.a();
        F0.h hVarG = F0.h.g(this.f2203d, this.f2208i, this.f2207h, u(), this.f2201b, this.f2204e);
        F0 f02 = this.f2210k;
        if (f02 != null) {
            f02.F(hVarG);
        }
        Iterator<InterfaceC2984a<F0.h>> it = this.f2214o.iterator();
        while (it.hasNext()) {
            it.next().accept(hVarG);
        }
    }

    private void g() {
        x0.g.j(!this.f2209j, "Consumer can only be linked once.");
        this.f2209j = true;
    }

    private void h() {
        x0.g.j(!this.f2213n, "Edge is already closed.");
    }

    public com.google.common.util.concurrent.p x(final a aVar, int i7, u0.a aVar2, u0.a aVar3, Surface surface) throws Exception {
        x0.g.g(surface);
        try {
            aVar.l();
            Q q7 = new Q(surface, t(), i7, this.f2206g.e(), aVar2, aVar3, this.f2201b);
            q7.m().c(new Runnable() {
                @Override
                public final void run() {
                    aVar.e();
                }
            }, F.a.a());
            aVar.x(q7);
            return G.n.p(q7);
        } catch (AbstractC0324e0.a e7) {
            return G.n.n(e7);
        }
    }

    public void y() {
        if (this.f2213n) {
            return;
        }
        v();
    }

    public void z() {
        F.a.d().execute(new Runnable() {
            @Override
            public final void run() {
                this.f2195d.y();
            }
        });
    }

    public void C(AbstractC0324e0 abstractC0324e0) throws AbstractC0324e0.a {
        E.p.a();
        h();
        a aVar = this.f2211l;
        Objects.requireNonNull(aVar);
        aVar.y(abstractC0324e0, new E(aVar));
    }

    public void D(final int i7, final int i8) {
        E.p.d(new Runnable() {
            @Override
            public final void run() {
                this.f2187d.A(i7, i8);
            }
        });
    }

    public void e(Runnable runnable) {
        E.p.a();
        h();
        this.f2212m.add(runnable);
    }

    public void f(InterfaceC2984a<F0.h> interfaceC2984a) {
        x0.g.g(interfaceC2984a);
        this.f2214o.add(interfaceC2984a);
    }

    public final void i() {
        E.p.a();
        this.f2211l.d();
        this.f2213n = true;
    }

    public com.google.common.util.concurrent.p<u0> j(final int i7, final u0.a aVar, final u0.a aVar2) {
        E.p.a();
        h();
        g();
        final a aVar3 = this.f2211l;
        return G.n.H(aVar3.j(), new G.a() {
            @Override
            public final com.google.common.util.concurrent.p apply(Object obj) {
                return this.f2190a.x(aVar3, i7, aVar, aVar2, (Surface) obj);
            }
        }, F.a.d());
    }

    public F0 k(C.J j7) {
        return l(j7, true);
    }

    public F0 l(C.J j7, boolean z7) {
        E.p.a();
        h();
        F0 f02 = new F0(this.f2206g.e(), j7, z7, this.f2206g.b(), this.f2206g.c(), new Runnable() {
            @Override
            public final void run() {
                this.f2184d.z();
            }
        });
        try {
            final AbstractC0324e0 abstractC0324e0M = f02.m();
            a aVar = this.f2211l;
            Objects.requireNonNull(aVar);
            if (aVar.y(abstractC0324e0M, new E(aVar))) {
                com.google.common.util.concurrent.p<Void> pVarK = aVar.k();
                Objects.requireNonNull(abstractC0324e0M);
                pVarK.c(new Runnable() {
                    @Override
                    public final void run() {
                        abstractC0324e0M.d();
                    }
                }, F.a.a());
            }
            this.f2210k = f02;
            B();
            return f02;
        } catch (AbstractC0324e0.a e7) {
            throw new AssertionError("Surface is somehow already closed", e7);
        } catch (RuntimeException e8) {
            f02.G();
            throw e8;
        }
    }

    public final void m() {
        E.p.a();
        h();
        this.f2211l.d();
    }

    public Rect n() {
        return this.f2203d;
    }

    public AbstractC0324e0 o() {
        E.p.a();
        h();
        g();
        return this.f2211l;
    }

    public int p() {
        return this.f2200a;
    }

    public int q() {
        return this.f2208i;
    }

    public Matrix r() {
        return this.f2201b;
    }

    public c1 s() {
        return this.f2206g;
    }

    public int t() {
        return this.f2205f;
    }

    public boolean u() {
        return this.f2202c;
    }

    public void v() {
        E.p.a();
        h();
        if (this.f2211l.v()) {
            return;
        }
        this.f2209j = false;
        this.f2211l.d();
        this.f2211l = new a(this.f2206g.e(), this.f2200a);
        Iterator<Runnable> it = this.f2212m.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public boolean w() {
        return this.f2204e;
    }
}
