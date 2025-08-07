package z;

import C.AbstractC0324e0;
import C.InterfaceC0349r0;
import C.InterfaceC0351s0;
import C.M0;
import C.X;
import C.X0;
import C.c1;
import C.o1;
import C.p1;
import M.W;
import P.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class o0 extends G0 {

    public static final b f24671y = new b();

    private static final Executor f24672z = F.a.d();

    private c f24673q;

    private Executor f24674r;

    X0.b f24675s;

    private AbstractC0324e0 f24676t;

    private M.N f24677u;

    F0 f24678v;

    private M.W f24679w;

    private X0.c f24680x;

    public static final class a implements o1.a<o0, M0, a>, InterfaceC0351s0.a<a> {

        private final C.E0 f24681a;

        public a() {
            this(C.E0.d0());
        }

        static a g(C.X x7) {
            return new a(C.E0.e0(x7));
        }

        @Override
        public C.D0 c() {
            return this.f24681a;
        }

        public o0 f() {
            M0 m0D = d();
            InterfaceC0351s0.Y(m0D);
            return new o0(m0D);
        }

        @Override
        public M0 d() {
            return new M0(C.J0.b0(this.f24681a));
        }

        public a i(p1.b bVar) {
            c().l(o1.f663B, bVar);
            return this;
        }

        public a j(C3070z c3070z) {
            c().l(InterfaceC0349r0.f707i, c3070z);
            return this;
        }

        @Override
        public a a(P.c cVar) {
            c().l(InterfaceC0351s0.f724r, cVar);
            return this;
        }

        public a l(int i7) {
            c().l(o1.f670x, Integer.valueOf(i7));
            return this;
        }

        @Deprecated
        public a m(int i7) {
            if (i7 == -1) {
                i7 = 0;
            }
            c().l(InterfaceC0351s0.f716j, Integer.valueOf(i7));
            return this;
        }

        public a n(Class<o0> cls) {
            c().l(H.m.f1524G, cls);
            if (c().a(H.m.f1523F, null) == null) {
                o(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a o(String str) {
            c().l(H.m.f1523F, str);
            return this;
        }

        @Override
        @Deprecated
        public a b(Size size) {
            c().l(InterfaceC0351s0.f720n, size);
            return this;
        }

        @Override
        public a e(int i7) {
            c().l(InterfaceC0351s0.f717k, Integer.valueOf(i7));
            c().l(InterfaceC0351s0.f718l, Integer.valueOf(i7));
            return this;
        }

        private a(C.E0 e02) {
            this.f24681a = e02;
            Class cls = (Class) e02.a(H.m.f1524G, null);
            if (cls != null && !cls.equals(o0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            i(p1.b.PREVIEW);
            n(o0.class);
            X.a<Integer> aVar = InterfaceC0351s0.f719m;
            if (((Integer) e02.a(aVar, -1)).intValue() == -1) {
                e02.l(aVar, 2);
            }
        }
    }

    public static final class b {

        private static final P.c f24682a;

        private static final M0 f24683b;

        private static final C3070z f24684c;

        static {
            P.c cVarA = new c.a().d(P.a.f3707c).f(P.d.f3719c).a();
            f24682a = cVarA;
            C3070z c3070z = C3070z.f24772c;
            f24684c = c3070z;
            f24683b = new a().l(2).m(0).a(cVarA).j(c3070z).d();
        }

        public M0 a() {
            return f24683b;
        }
    }

    public interface c {
        void a(F0 f02);
    }

    o0(M0 m02) {
        super(m02);
        this.f24674r = f24672z;
    }

    private void d0(X0.b bVar, c1 c1Var) {
        if (this.f24673q != null) {
            bVar.m(this.f24676t, c1Var.b(), p(), n());
        }
        X0.c cVar = this.f24680x;
        if (cVar != null) {
            cVar.b();
        }
        X0.c cVar2 = new X0.c(new X0.d() {
            @Override
            public final void a(X0 x02, X0.g gVar) {
                this.f24670a.h0(x02, gVar);
            }
        });
        this.f24680x = cVar2;
        bVar.t(cVar2);
    }

    private void e0() {
        X0.c cVar = this.f24680x;
        if (cVar != null) {
            cVar.b();
            this.f24680x = null;
        }
        AbstractC0324e0 abstractC0324e0 = this.f24676t;
        if (abstractC0324e0 != null) {
            abstractC0324e0.d();
            this.f24676t = null;
        }
        M.W w8 = this.f24679w;
        if (w8 != null) {
            w8.i();
            this.f24679w = null;
        }
        M.N n7 = this.f24677u;
        if (n7 != null) {
            n7.i();
            this.f24677u = null;
        }
        this.f24678v = null;
    }

    private X0.b f0(M0 m02, c1 c1Var) {
        E.p.a();
        C.J jG = g();
        Objects.requireNonNull(jG);
        final C.J j7 = jG;
        e0();
        x0.g.i(this.f24677u == null);
        Matrix matrixV = v();
        boolean zO = j7.o();
        Rect rectG0 = g0(c1Var.e());
        Objects.requireNonNull(rectG0);
        this.f24677u = new M.N(1, 34, c1Var, matrixV, zO, rectG0, r(j7, C(j7)), d(), p0(j7));
        AbstractC3056k abstractC3056kL = l();
        if (abstractC3056kL != null) {
            this.f24679w = new M.W(j7, abstractC3056kL.a());
            this.f24677u.e(new Runnable() {
                @Override
                public final void run() {
                    this.f24660d.G();
                }
            });
            O.f fVarJ = O.f.j(this.f24677u);
            M.N n7 = this.f24679w.m(W.b.c(this.f24677u, Collections.singletonList(fVarJ))).get(fVarJ);
            Objects.requireNonNull(n7);
            n7.e(new Runnable() {
                @Override
                public final void run() {
                    this.f24661d.i0(j7);
                }
            });
            this.f24678v = n7.k(j7);
            this.f24676t = this.f24677u.o();
        } else {
            this.f24677u.e(new Runnable() {
                @Override
                public final void run() {
                    this.f24660d.G();
                }
            });
            F0 f0K = this.f24677u.k(j7);
            this.f24678v = f0K;
            this.f24676t = f0K.m();
        }
        if (this.f24673q != null) {
            l0();
        }
        X0.b bVarQ = X0.b.q(m02, c1Var.e());
        bVarQ.u(c1Var.c());
        bVarQ.y(m02.M());
        if (c1Var.d() != null) {
            bVarQ.g(c1Var.d());
        }
        d0(bVarQ, c1Var);
        return bVarQ;
    }

    private Rect g0(Size size) {
        if (A() != null) {
            return A();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    public void h0(X0 x02, X0.g gVar) {
        if (g() == null) {
            return;
        }
        q0((M0) j(), e());
        G();
    }

    public void i0(C.J j7) {
        k0(this.f24677u, j7);
    }

    private void k0(M.N n7, C.J j7) {
        E.p.a();
        if (j7 == g()) {
            n7.v();
        }
    }

    private void l0() {
        m0();
        final c cVar = (c) x0.g.g(this.f24673q);
        final F0 f02 = (F0) x0.g.g(this.f24678v);
        this.f24674r.execute(new Runnable() {
            @Override
            public final void run() {
                cVar.a(f02);
            }
        });
    }

    private void m0() {
        C.J jG = g();
        M.N n7 = this.f24677u;
        if (jG == null || n7 == null) {
            return;
        }
        n7.D(r(jG, C(jG)), d());
    }

    private boolean p0(C.J j7) {
        return j7.o() && C(j7);
    }

    private void q0(M0 m02, c1 c1Var) {
        X0.b bVarF0 = f0(m02, c1Var);
        this.f24675s = bVarF0;
        X(F.a(new Object[]{bVarF0.o()}));
    }

    @Override
    protected o1<?> L(C.I i7, o1.a<?, ?, ?> aVar) {
        aVar.c().l(InterfaceC0349r0.f706h, 34);
        return aVar.d();
    }

    @Override
    protected c1 O(C.X x7) {
        this.f24675s.g(x7);
        X(F.a(new Object[]{this.f24675s.o()}));
        return e().g().d(x7).a();
    }

    @Override
    protected c1 P(c1 c1Var, c1 c1Var2) {
        q0((M0) j(), c1Var);
        return c1Var;
    }

    @Override
    public void Q() {
        e0();
    }

    @Override
    public void V(Rect rect) {
        super.V(rect);
        m0();
    }

    @Override
    public o1<?> k(boolean z7, p1 p1Var) {
        b bVar = f24671y;
        C.X xA = p1Var.a(bVar.a().F(), 1);
        if (z7) {
            xA = C.X.Q(xA, bVar.a());
        }
        if (xA == null) {
            return null;
        }
        return z(xA).d();
    }

    public void n0(Executor executor, c cVar) {
        E.p.a();
        if (cVar == null) {
            this.f24673q = null;
            F();
            return;
        }
        this.f24673q = cVar;
        this.f24674r = executor;
        if (f() != null) {
            q0((M0) j(), e());
            G();
        }
        E();
    }

    public void o0(c cVar) {
        n0(f24672z, cVar);
    }

    public String toString() {
        return "Preview:" + o();
    }

    @Override
    public Set<Integer> x() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override
    public o1.a<?, ?, ?> z(C.X x7) {
        return a.g(x7);
    }
}
