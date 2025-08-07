package androidx.camera.core;

import C.AbstractC0324e0;
import C.C0346p0;
import C.C0355u0;
import C.D0;
import C.E0;
import C.I;
import C.InterfaceC0349r0;
import C.InterfaceC0351s0;
import C.J;
import C.J0;
import C.X;
import C.X0;
import C.c1;
import C.o1;
import C.p1;
import P.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import z.C3070z;
import z.F;
import z.G0;

public final class f extends G0 {

    public static final d f9429w = new d();

    private static final Boolean f9430x = null;

    final i f9431q;

    private final Object f9432r;

    private a f9433s;

    X0.b f9434t;

    private AbstractC0324e0 f9435u;

    private X0.c f9436v;

    public interface a {
        default void b(Matrix matrix) {
        }

        default Size h() {
            return null;
        }

        default int i() {
            return 0;
        }

        void k(n nVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements InterfaceC0351s0.a<c>, o1.a<f, C0346p0, c> {

        private final E0 f9437a;

        public c() {
            this(E0.d0());
        }

        static c g(X x7) {
            return new c(E0.e0(x7));
        }

        @Override
        public D0 c() {
            return this.f9437a;
        }

        public f f() {
            C0346p0 c0346p0D = d();
            InterfaceC0351s0.Y(c0346p0D);
            return new f(c0346p0D);
        }

        @Override
        public C0346p0 d() {
            return new C0346p0(J0.b0(this.f9437a));
        }

        public c i(Executor executor) {
            c().l(H.n.f1525H, executor);
            return this;
        }

        public c j(int i7) {
            c().l(C0346p0.f673J, Integer.valueOf(i7));
            return this;
        }

        public c k(p1.b bVar) {
            c().l(o1.f663B, bVar);
            return this;
        }

        public c l(Size size) {
            c().l(InterfaceC0351s0.f721o, size);
            return this;
        }

        public c m(C3070z c3070z) {
            if (!Objects.equals(C3070z.f24773d, c3070z)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            c().l(InterfaceC0349r0.f707i, c3070z);
            return this;
        }

        public c n(int i7) {
            c().l(C0346p0.f674K, Integer.valueOf(i7));
            return this;
        }

        public c o(int i7) {
            c().l(C0346p0.f676M, Integer.valueOf(i7));
            return this;
        }

        @Override
        public c a(P.c cVar) {
            c().l(InterfaceC0351s0.f724r, cVar);
            return this;
        }

        public c q(int i7) {
            c().l(o1.f670x, Integer.valueOf(i7));
            return this;
        }

        @Deprecated
        public c r(int i7) {
            if (i7 == -1) {
                i7 = 0;
            }
            c().l(InterfaceC0351s0.f716j, Integer.valueOf(i7));
            return this;
        }

        public c s(Class<f> cls) {
            c().l(H.m.f1524G, cls);
            if (c().a(H.m.f1523F, null) == null) {
                t(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c t(String str) {
            c().l(H.m.f1523F, str);
            return this;
        }

        @Override
        @Deprecated
        public c b(Size size) {
            c().l(InterfaceC0351s0.f720n, size);
            return this;
        }

        @Override
        public c e(int i7) {
            c().l(InterfaceC0351s0.f717k, Integer.valueOf(i7));
            return this;
        }

        private c(E0 e02) {
            this.f9437a = e02;
            Class cls = (Class) e02.a(H.m.f1524G, null);
            if (cls == null || cls.equals(f.class)) {
                k(p1.b.IMAGE_ANALYSIS);
                s(f.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class d {

        private static final Size f9438a;

        private static final C3070z f9439b;

        private static final P.c f9440c;

        private static final C0346p0 f9441d;

        static {
            Size size = new Size(640, 480);
            f9438a = size;
            C3070z c3070z = C3070z.f24773d;
            f9439b = c3070z;
            P.c cVarA = new c.a().d(P.a.f3707c).f(new P.d(L.d.f1939c, 1)).a();
            f9440c = cVarA;
            f9441d = new c().l(size).q(1).r(0).a(cVarA).m(c3070z).d();
        }

        public C0346p0 a() {
            return f9441d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    f(C0346p0 c0346p0) {
        super(c0346p0);
        this.f9432r = new Object();
        if (((C0346p0) j()).Z(0) == 1) {
            this.f9431q = new j();
        } else {
            this.f9431q = new k(c0346p0.V(F.a.b()));
        }
        this.f9431q.t(j0());
        this.f9431q.u(l0());
    }

    private boolean k0(J j7) {
        return l0() && q(j7) % 180 != 0;
    }

    public static void m0(q qVar, q qVar2) {
        qVar.m();
        if (qVar2 != null) {
            qVar2.m();
        }
    }

    public void n0(X0 x02, X0.g gVar) {
        if (g() == null) {
            return;
        }
        e0();
        this.f9431q.g();
        X0.b bVarF0 = f0(i(), (C0346p0) j(), (c1) x0.g.g(e()));
        this.f9434t = bVarF0;
        X(F.a(new Object[]{bVarF0.o()}));
        G();
    }

    public static List o0(Size size, List list, int i7) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    private void s0() {
        J jG = g();
        if (jG != null) {
            this.f9431q.w(q(jG));
        }
    }

    @Override
    public void J() {
        this.f9431q.f();
    }

    @Override
    protected o1<?> L(I i7, o1.a<?, ?, ?> aVar) {
        final Size sizeH;
        Boolean boolI0 = i0();
        boolean zA = i7.o().a(OnePixelShiftQuirk.class);
        i iVar = this.f9431q;
        if (boolI0 != null) {
            zA = boolI0.booleanValue();
        }
        iVar.s(zA);
        synchronized (this.f9432r) {
            try {
                a aVar2 = this.f9433s;
                sizeH = aVar2 != null ? aVar2.h() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sizeH == null) {
            return aVar.d();
        }
        if (i7.l(((Integer) aVar.c().a(InterfaceC0351s0.f717k, 0)).intValue()) % 180 == 90) {
            sizeH = new Size(sizeH.getHeight(), sizeH.getWidth());
        }
        o1 o1VarD = aVar.d();
        X.a<Size> aVar3 = InterfaceC0351s0.f720n;
        if (!o1VarD.b(aVar3)) {
            aVar.c().l(aVar3, sizeH);
        }
        o1 o1VarD2 = aVar.d();
        X.a aVar4 = InterfaceC0351s0.f724r;
        if (o1VarD2.b(aVar4)) {
            P.c cVar = (P.c) c().a(aVar4, null);
            c.a aVar5 = cVar == null ? new c.a() : c.a.b(cVar);
            if (cVar == null || cVar.d() == null) {
                aVar5.f(new P.d(sizeH, 1));
            }
            if (cVar == null) {
                aVar5.e(new P.b() {
                    @Override
                    public final List a(List list, int i8) {
                        return androidx.camera.core.f.o0(sizeH, list, i8);
                    }
                });
            }
            aVar.c().l(aVar4, aVar5.a());
        }
        return aVar.d();
    }

    @Override
    protected c1 O(X x7) {
        this.f9434t.g(x7);
        X(F.a(new Object[]{this.f9434t.o()}));
        return e().g().d(x7).a();
    }

    @Override
    protected c1 P(c1 c1Var, c1 c1Var2) {
        X0.b bVarF0 = f0(i(), (C0346p0) j(), c1Var);
        this.f9434t = bVarF0;
        X(F.a(new Object[]{bVarF0.o()}));
        return c1Var;
    }

    @Override
    public void Q() {
        e0();
        this.f9431q.j();
    }

    @Override
    public void T(Matrix matrix) {
        super.T(matrix);
        this.f9431q.x(matrix);
    }

    @Override
    public void V(Rect rect) {
        super.V(rect);
        this.f9431q.y(rect);
    }

    void e0() {
        E.p.a();
        X0.c cVar = this.f9436v;
        if (cVar != null) {
            cVar.b();
            this.f9436v = null;
        }
        AbstractC0324e0 abstractC0324e0 = this.f9435u;
        if (abstractC0324e0 != null) {
            abstractC0324e0.d();
            this.f9435u = null;
        }
    }

    X0.b f0(String str, C0346p0 c0346p0, c1 c1Var) {
        E.p.a();
        Size sizeE = c1Var.e();
        Executor executor = (Executor) x0.g.g(c0346p0.V(F.a.b()));
        boolean z7 = true;
        int iH0 = g0() == 1 ? h0() : 4;
        final q qVar = c0346p0.b0() != null ? new q(c0346p0.b0().a(sizeE.getWidth(), sizeE.getHeight(), m(), iH0, 0L)) : new q(o.a(sizeE.getWidth(), sizeE.getHeight(), m(), iH0));
        boolean zK0 = g() != null ? k0(g()) : false;
        int height = zK0 ? sizeE.getHeight() : sizeE.getWidth();
        int width = zK0 ? sizeE.getWidth() : sizeE.getHeight();
        int i7 = j0() == 2 ? 1 : 35;
        boolean z8 = m() == 35 && j0() == 2;
        if (m() != 35 || ((g() == null || q(g()) == 0) && !Boolean.TRUE.equals(i0()))) {
            z7 = false;
        }
        final q qVar2 = (z8 || z7) ? new q(o.a(height, width, i7, qVar.g())) : null;
        if (qVar2 != null) {
            this.f9431q.v(qVar2);
        }
        s0();
        qVar.e(this.f9431q, executor);
        X0.b bVarQ = X0.b.q(c0346p0, c1Var.e());
        if (c1Var.d() != null) {
            bVarQ.g(c1Var.d());
        }
        AbstractC0324e0 abstractC0324e0 = this.f9435u;
        if (abstractC0324e0 != null) {
            abstractC0324e0.d();
        }
        C0355u0 c0355u0 = new C0355u0(qVar.a(), sizeE, m());
        this.f9435u = c0355u0;
        c0355u0.k().c(new Runnable() {
            @Override
            public final void run() {
                androidx.camera.core.f.m0(qVar, qVar2);
            }
        }, F.a.d());
        bVarQ.u(c1Var.c());
        bVarQ.m(this.f9435u, c1Var.b(), null, -1);
        X0.c cVar = this.f9436v;
        if (cVar != null) {
            cVar.b();
        }
        X0.c cVar2 = new X0.c(new X0.d() {
            @Override
            public final void a(X0 x02, X0.g gVar) {
                this.f24562a.n0(x02, gVar);
            }
        });
        this.f9436v = cVar2;
        bVarQ.t(cVar2);
        return bVarQ;
    }

    public int g0() {
        return ((C0346p0) j()).Z(0);
    }

    public int h0() {
        return ((C0346p0) j()).a0(6);
    }

    public Boolean i0() {
        return ((C0346p0) j()).c0(f9430x);
    }

    public int j0() {
        return ((C0346p0) j()).d0(1);
    }

    @Override
    public o1<?> k(boolean z7, p1 p1Var) {
        d dVar = f9429w;
        X xA = p1Var.a(dVar.a().F(), 1);
        if (z7) {
            xA = X.Q(xA, dVar.a());
        }
        if (xA == null) {
            return null;
        }
        return z(xA).d();
    }

    public boolean l0() {
        return ((C0346p0) j()).e0(Boolean.FALSE).booleanValue();
    }

    public void q0(Executor executor, final a aVar) {
        synchronized (this.f9432r) {
            try {
                this.f9431q.r(executor, new a() {
                    @Override
                    public final void k(androidx.camera.core.n nVar) {
                        aVar.k(nVar);
                    }
                });
                if (this.f9433s == null) {
                    E();
                }
                this.f9433s = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r0(int i7) {
        if (U(i7)) {
            s0();
        }
    }

    public String toString() {
        return "ImageAnalysis:" + o();
    }

    @Override
    public o1.a<?, ?, ?> z(X x7) {
        return c.g(x7);
    }
}
