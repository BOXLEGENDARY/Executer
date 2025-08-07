package B;

import B.O;
import B.Z;
import C.AbstractC0324e0;
import C.AbstractC0345p;
import C.C0347q;
import C.C0355u0;
import C.InterfaceC0353t0;
import H3.QdLC.QcdySgfdST;
import M.C0524u;
import U.Gw.oeVkjmfPcLbWm;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.e;
import java.util.Objects;
import x0.InterfaceC2984a;
import z.C3043d0;

class C0284u {

    androidx.camera.core.q f254b;

    androidx.camera.core.q f255c;

    private O.a f256d;

    private c f257e;

    P f253a = null;

    private E f258f = null;

    class a extends AbstractC0345p {
        a() {
        }

        public void f() {
            P p7 = C0284u.this.f253a;
            if (p7 != null) {
                p7.n();
            }
        }

        @Override
        public void d(int i7) {
            F.a.d().execute(new Runnable() {
                @Override
                public final void run() {
                    this.f252d.f();
                }
            });
        }
    }

    class b implements G.c<Void> {

        final P f260a;

        b(P p7) {
            this.f260a = p7;
        }

        @Override
        public void onSuccess(Void r1) {
        }

        @Override
        public void onFailure(Throwable th) {
            E.p.a();
            if (this.f260a == C0284u.this.f253a) {
                C3043d0.l("CaptureNode", "request aborted, id=" + C0284u.this.f253a.e());
                if (C0284u.this.f258f != null) {
                    C0284u.this.f258f.j();
                }
                C0284u.this.f253a = null;
            }
        }
    }

    static abstract class c {

        private AbstractC0324e0 f263b;

        private AbstractC0345p f262a = new a();

        private AbstractC0324e0 f264c = null;

        class a extends AbstractC0345p {
            a() {
            }
        }

        c() {
        }

        static c m(Size size, int i7, int i8, boolean z7, z.Z z8, Size size2, int i9) {
            return new C0266b(size, i7, i8, z7, z8, size2, i9, new C0524u(), new C0524u());
        }

        AbstractC0345p a() {
            return this.f262a;
        }

        abstract C0524u<Z.b> b();

        abstract z.Z c();

        abstract int d();

        abstract int e();

        abstract int f();

        abstract Size g();

        AbstractC0324e0 h() {
            return this.f264c;
        }

        abstract C0524u<P> i();

        abstract Size j();

        AbstractC0324e0 k() {
            AbstractC0324e0 abstractC0324e0 = this.f263b;
            Objects.requireNonNull(abstractC0324e0);
            return abstractC0324e0;
        }

        abstract boolean l();

        void n(AbstractC0345p abstractC0345p) {
            this.f262a = abstractC0345p;
        }

        void o(Surface surface, Size size, int i7) {
            this.f264c = new C0355u0(surface, size, i7);
        }

        void p(Surface surface) {
            x0.g.j(this.f263b == null, "The surface is already set.");
            this.f263b = new C0355u0(surface, j(), d());
        }
    }

    C0284u() {
    }

    private static InterfaceC0353t0 g(z.Z z7, int i7, int i8, int i9) {
        return z7 != null ? z7.a(i7, i8, i9, 4, 0L) : androidx.camera.core.o.a(i7, i8, i9, 4);
    }

    public static void j(androidx.camera.core.q qVar) {
        if (qVar != null) {
            qVar.m();
        }
    }

    public void k(P p7) {
        p(p7);
        this.f258f.i(p7);
    }

    public void l(InterfaceC0353t0 interfaceC0353t0) {
        try {
            androidx.camera.core.n nVarC = interfaceC0353t0.c();
            if (nVarC != null) {
                o(nVarC);
            } else {
                P p7 = this.f253a;
                if (p7 != null) {
                    t(Z.b.c(p7.e(), new z.U(2, "Failed to acquire latest image", null)));
                }
            }
        } catch (IllegalStateException e7) {
            P p8 = this.f253a;
            if (p8 != null) {
                t(Z.b.c(p8.e(), new z.U(2, "Failed to acquire latest image", e7)));
            }
        }
    }

    public void m(InterfaceC0353t0 interfaceC0353t0) {
        try {
            androidx.camera.core.n nVarC = interfaceC0353t0.c();
            if (nVarC != null) {
                q(nVarC);
            }
        } catch (IllegalStateException e7) {
            C3043d0.d("CaptureNode", "Failed to acquire latest image of postview", e7);
        }
    }

    private void n(androidx.camera.core.n nVar) {
        E.p.a();
        O.a aVar = this.f256d;
        Objects.requireNonNull(aVar);
        aVar.a().accept(O.b.c(this.f253a, nVar));
        P p7 = this.f253a;
        this.f253a = null;
        p7.q();
    }

    private void q(androidx.camera.core.n nVar) {
        if (this.f253a == null) {
            C3043d0.l("CaptureNode", "Postview image is closed due to request completed or aborted");
            nVar.close();
        } else {
            O.a aVar = this.f256d;
            Objects.requireNonNull(aVar);
            aVar.d().accept(O.b.c(this.f253a, nVar));
        }
    }

    private void s(c cVar, final androidx.camera.core.q qVar, final androidx.camera.core.q qVar2) {
        cVar.k().d();
        cVar.k().k().c(new Runnable() {
            @Override
            public final void run() {
                qVar.m();
            }
        }, F.a.d());
        if (cVar.h() != null) {
            cVar.h().d();
            cVar.h().k().c(new Runnable() {
                @Override
                public final void run() {
                    C0284u.j(qVar2);
                }
            }, F.a.d());
        }
    }

    public int h() {
        E.p.a();
        x0.g.j(this.f254b != null, QcdySgfdST.cWZRXJg);
        return this.f254b.j();
    }

    void o(androidx.camera.core.n nVar) {
        E.p.a();
        if (this.f253a == null) {
            C3043d0.l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + nVar);
            nVar.close();
            return;
        }
        if (((Integer) nVar.D0().b().d(this.f253a.i())) != null) {
            n(nVar);
        } else {
            C3043d0.l("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            nVar.close();
        }
    }

    void p(P p7) {
        E.p.a();
        x0.g.j(p7.h().size() == 1, "only one capture stage is supported.");
        x0.g.j(h() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f253a = p7;
        G.n.j(p7.a(), new b(p7), F.a.a());
    }

    public void r() {
        E.p.a();
        c cVar = this.f257e;
        Objects.requireNonNull(cVar);
        androidx.camera.core.q qVar = this.f254b;
        Objects.requireNonNull(qVar);
        s(cVar, qVar, this.f255c);
    }

    void t(Z.b bVar) {
        E.p.a();
        P p7 = this.f253a;
        if (p7 == null || p7.e() != bVar.b()) {
            return;
        }
        this.f253a.l(bVar.a());
    }

    public void u(e.a aVar) {
        E.p.a();
        x0.g.j(this.f254b != null, "The ImageReader is not initialized.");
        this.f254b.n(aVar);
    }

    public O.a v(c cVar) {
        InterfaceC2984a<P> interfaceC2984a;
        E e7;
        x0.g.j(this.f257e == null && this.f254b == null, oeVkjmfPcLbWm.rtvA);
        this.f257e = cVar;
        Size sizeJ = cVar.j();
        int iD = cVar.d();
        boolean zL = cVar.l();
        AbstractC0345p aVar = new a();
        if (zL || cVar.c() != null) {
            E e8 = new E(g(cVar.c(), sizeJ.getWidth(), sizeJ.getHeight(), iD));
            this.f258f = e8;
            interfaceC2984a = new InterfaceC2984a() {
                @Override
                public final void accept(Object obj) {
                    this.f246a.k((P) obj);
                }
            };
            e7 = e8;
        } else {
            androidx.camera.core.p pVar = new androidx.camera.core.p(sizeJ.getWidth(), sizeJ.getHeight(), iD, 4);
            aVar = C0347q.b(aVar, pVar.n());
            interfaceC2984a = new InterfaceC2984a() {
                @Override
                public final void accept(Object obj) {
                    this.f245a.p((P) obj);
                }
            };
            e7 = pVar;
        }
        cVar.n(aVar);
        Surface surfaceA = e7.a();
        Objects.requireNonNull(surfaceA);
        cVar.p(surfaceA);
        this.f254b = new androidx.camera.core.q(e7);
        e7.e(new InterfaceC0353t0.a() {
            @Override
            public final void a(InterfaceC0353t0 interfaceC0353t0) {
                this.f247a.l(interfaceC0353t0);
            }
        }, F.a.d());
        if (cVar.g() != null) {
            InterfaceC0353t0 interfaceC0353t0G = g(cVar.c(), cVar.g().getWidth(), cVar.g().getHeight(), cVar.f());
            interfaceC0353t0G.e(new InterfaceC0353t0.a() {
                @Override
                public final void a(InterfaceC0353t0 interfaceC0353t0) {
                    this.f248a.m(interfaceC0353t0);
                }
            }, F.a.d());
            this.f255c = new androidx.camera.core.q(interfaceC0353t0G);
            cVar.o(interfaceC0353t0G.a(), cVar.g(), cVar.f());
        }
        cVar.i().a(interfaceC2984a);
        cVar.b().a(new InterfaceC2984a() {
            @Override
            public final void accept(Object obj) {
                this.f249a.t((Z.b) obj);
            }
        });
        O.a aVarE = O.a.e(cVar.d(), cVar.e());
        this.f256d = aVarE;
        return aVarE;
    }
}
