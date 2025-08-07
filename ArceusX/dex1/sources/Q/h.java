package Q;

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
import M.C0523t;
import M.N;
import M.W;
import N.o;
import N.r;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import z.AbstractC3056k;
import z.C3041c0;
import z.F;
import z.G0;

public class h extends G0 {

    private N f3745A;

    X0.b f3746B;

    X0.b f3747C;

    private X0.c f3748D;

    private final j f3749q;

    private final l f3750r;

    private final C3041c0 f3751s;

    private final C3041c0 f3752t;

    private W f3753u;

    private W f3754v;

    private N.r f3755w;

    private N f3756x;

    private N f3757y;

    private N f3758z;

    interface a {
        com.google.common.util.concurrent.p<Void> a(int i7, int i8);
    }

    public h(J j7, J j8, C3041c0 c3041c0, C3041c0 c3041c02, Set<G0> set, p1 p1Var) {
        super(n0(set));
        this.f3749q = n0(set);
        this.f3751s = c3041c0;
        this.f3752t = c3041c02;
        this.f3750r = new l(j7, j8, set, p1Var, new a() {
            @Override
            public final com.google.common.util.concurrent.p a(int i7, int i8) {
                return this.f3738a.v0(i7, i8);
            }
        });
    }

    private void c0(X0.b bVar, final String str, final String str2, final o1<?> o1Var, final c1 c1Var, final c1 c1Var2) {
        X0.c cVar = this.f3748D;
        if (cVar != null) {
            cVar.b();
        }
        X0.c cVar2 = new X0.c(new X0.d() {
            @Override
            public final void a(X0 x02, X0.g gVar) {
                this.f3739a.u0(str, str2, o1Var, c1Var, c1Var2, x02, gVar);
            }
        });
        this.f3748D = cVar2;
        bVar.t(cVar2);
    }

    private void d0() {
        X0.c cVar = this.f3748D;
        if (cVar != null) {
            cVar.b();
            this.f3748D = null;
        }
        N n7 = this.f3756x;
        if (n7 != null) {
            n7.i();
            this.f3756x = null;
        }
        N n8 = this.f3757y;
        if (n8 != null) {
            n8.i();
            this.f3757y = null;
        }
        N n9 = this.f3758z;
        if (n9 != null) {
            n9.i();
            this.f3758z = null;
        }
        N n10 = this.f3745A;
        if (n10 != null) {
            n10.i();
            this.f3745A = null;
        }
        W w8 = this.f3754v;
        if (w8 != null) {
            w8.i();
            this.f3754v = null;
        }
        N.r rVar = this.f3755w;
        if (rVar != null) {
            rVar.f();
            this.f3755w = null;
        }
        W w9 = this.f3753u;
        if (w9 != null) {
            w9.i();
            this.f3753u = null;
        }
    }

    private List<X0> e0(String str, String str2, o1<?> o1Var, c1 c1Var, c1 c1Var2) {
        E.p.a();
        if (c1Var2 != null) {
            f0(str, str2, o1Var, c1Var, c1Var2);
            g0(str, str2, o1Var, c1Var, c1Var2);
            this.f3755w = o0(g(), s(), c1Var, this.f3751s, this.f3752t);
            Map<G0, N.d> mapB = this.f3750r.B(this.f3758z, this.f3745A, y(), A() != null);
            r.c cVarI = this.f3755w.i(r.b.d(this.f3758z, this.f3745A, new ArrayList(mapB.values())));
            HashMap map = new HashMap();
            for (Map.Entry<G0, N.d> entry : mapB.entrySet()) {
                map.put(entry.getKey(), cVarI.get(entry.getValue()));
            }
            this.f3750r.L(map);
            return F.a(new Object[]{this.f3746B.o(), this.f3747C.o()});
        }
        f0(str, str2, o1Var, c1Var, null);
        J jG = g();
        Objects.requireNonNull(jG);
        this.f3754v = s0(jG, c1Var);
        Map<G0, O.f> mapA = this.f3750r.A(this.f3758z, y(), A() != null);
        W.c cVarM = this.f3754v.m(W.b.c(this.f3758z, new ArrayList(mapA.values())));
        HashMap map2 = new HashMap();
        for (Map.Entry<G0, O.f> entry2 : mapA.entrySet()) {
            map2.put(entry2.getKey(), cVarM.get(entry2.getValue()));
        }
        this.f3750r.L(map2);
        return F.a(new Object[]{this.f3746B.o()});
    }

    private void f0(String str, String str2, o1<?> o1Var, c1 c1Var, c1 c1Var2) {
        Matrix matrixV = v();
        J jG = g();
        Objects.requireNonNull(jG);
        boolean zO = jG.o();
        Rect rectL0 = l0(c1Var.e());
        Objects.requireNonNull(rectL0);
        J jG2 = g();
        Objects.requireNonNull(jG2);
        int iQ = q(jG2);
        J jG3 = g();
        Objects.requireNonNull(jG3);
        N n7 = new N(3, 34, c1Var, matrixV, zO, rectL0, iQ, -1, C(jG3));
        this.f3756x = n7;
        J jG4 = g();
        Objects.requireNonNull(jG4);
        this.f3758z = r0(n7, jG4);
        X0.b bVarH0 = h0(this.f3756x, o1Var, c1Var);
        this.f3746B = bVarH0;
        c0(bVarH0, str, str2, o1Var, c1Var, c1Var2);
    }

    private void g0(String str, String str2, o1<?> o1Var, c1 c1Var, c1 c1Var2) {
        Matrix matrixV = v();
        J jS = s();
        Objects.requireNonNull(jS);
        boolean zO = jS.o();
        Rect rectL0 = l0(c1Var2.e());
        Objects.requireNonNull(rectL0);
        J jS2 = s();
        Objects.requireNonNull(jS2);
        int iQ = q(jS2);
        J jS3 = s();
        Objects.requireNonNull(jS3);
        N n7 = new N(3, 34, c1Var2, matrixV, zO, rectL0, iQ, -1, C(jS3));
        this.f3757y = n7;
        J jS4 = s();
        Objects.requireNonNull(jS4);
        this.f3745A = r0(n7, jS4);
        X0.b bVarH0 = h0(this.f3757y, o1Var, c1Var2);
        this.f3747C = bVarH0;
        c0(bVarH0, str, str2, o1Var, c1Var, c1Var2);
    }

    private X0.b h0(N n7, o1<?> o1Var, c1 c1Var) {
        X0.b bVarQ = X0.b.q(o1Var, c1Var.e());
        x0(bVarQ);
        w0(c1Var.e(), bVarQ);
        bVarQ.m(n7.o(), c1Var.b(), null, -1);
        bVarQ.j(this.f3750r.D());
        if (c1Var.d() != null) {
            bVarQ.g(c1Var.d());
        }
        return bVarQ;
    }

    public static List<p1.b> i0(G0 g02) {
        ArrayList arrayList = new ArrayList();
        if (t0(g02)) {
            Iterator<G0> it = ((h) g02).k0().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().j().F());
            }
        } else {
            arrayList.add(g02.j().F());
        }
        return arrayList;
    }

    private static int j0(G0 g02) {
        return g02.j().x().p();
    }

    private Rect l0(Size size) {
        return A() != null ? A() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    private Rect m0(N n7) {
        return ((AbstractC3056k) x0.g.g(l())).h() == 1 ? E.q.r(n7.s().e()) : n7.n();
    }

    private static j n0(Set<G0> set) {
        D0 d0C = new i().c();
        d0C.l(InterfaceC0349r0.f706h, 34);
        ArrayList arrayList = new ArrayList();
        for (G0 g02 : set) {
            if (g02.j().b(o1.f663B)) {
                arrayList.add(g02.j().F());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        d0C.l(j.f3760J, arrayList);
        d0C.l(InterfaceC0351s0.f719m, 2);
        return new j(J0.b0(d0C));
    }

    private N.r o0(J j7, J j8, c1 c1Var, C3041c0 c3041c0, C3041c0 c3041c02) {
        return new N.r(j7, j8, o.a.a(c1Var.b(), c3041c0, c3041c02));
    }

    private boolean p0() {
        if (((AbstractC3056k) x0.g.g(l())).h() != 1) {
            return false;
        }
        J j7 = (J) x0.g.g(g());
        return j7.g() && j7.o();
    }

    private int q0() {
        if (((AbstractC3056k) x0.g.g(l())).h() == 1) {
            return q((J) x0.g.g(g()));
        }
        return 0;
    }

    private N r0(N n7, J j7) {
        if (l() == null || l().h() == 2 || l().e() == 1) {
            return n7;
        }
        this.f3753u = new W(j7, l().a());
        int iQ0 = q0();
        Rect rectM0 = m0(n7);
        O.f fVarI = O.f.i(n7.t(), n7.p(), rectM0, E.q.f(rectM0, iQ0), iQ0, p0(), true);
        N n8 = this.f3753u.m(W.b.c(n7, Collections.singletonList(fVarI))).get(fVarI);
        Objects.requireNonNull(n8);
        return n8;
    }

    private W s0(J j7, c1 c1Var) {
        if (l() == null || l().e() != 1) {
            return new W(j7, C0523t.a.a(c1Var.b()));
        }
        W w8 = new W(j7, l().a());
        this.f3753u = w8;
        return w8;
    }

    public static boolean t0(G0 g02) {
        return g02 instanceof h;
    }

    public void u0(String str, String str2, o1 o1Var, c1 c1Var, c1 c1Var2, X0 x02, X0.g gVar) {
        if (g() == null) {
            return;
        }
        d0();
        X(e0(str, str2, o1Var, c1Var, c1Var2));
        G();
        this.f3750r.J();
    }

    public com.google.common.util.concurrent.p v0(int i7, int i8) {
        W w8 = this.f3754v;
        return w8 != null ? w8.e().d(i7, i8) : G.n.n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void w0(Size size, X0.b bVar) {
        Iterator<G0> it = k0().iterator();
        while (it.hasNext()) {
            X0 x0O = X0.b.q(it.next().j(), size).o();
            bVar.c(x0O.j());
            bVar.a(x0O.n());
            bVar.d(x0O.l());
            bVar.b(x0O.c());
            bVar.g(x0O.f());
        }
    }

    private void x0(X0.b bVar) {
        Iterator<G0> it = k0().iterator();
        int iE = -1;
        while (it.hasNext()) {
            iE = X0.e(iE, j0(it.next()));
        }
        if (iE != -1) {
            bVar.z(iE);
        }
    }

    @Override
    public void J() {
        super.J();
        this.f3750r.r();
    }

    @Override
    protected o1<?> L(I i7, o1.a<?, ?, ?> aVar) {
        this.f3750r.G(aVar.c());
        return aVar.d();
    }

    @Override
    public void M() {
        super.M();
        this.f3750r.H();
    }

    @Override
    public void N() {
        super.N();
        this.f3750r.I();
    }

    @Override
    protected c1 O(X x7) {
        this.f3746B.g(x7);
        X(F.a(new Object[]{this.f3746B.o()}));
        return e().g().d(x7).a();
    }

    @Override
    protected c1 P(c1 c1Var, c1 c1Var2) {
        X(e0(i(), t(), j(), c1Var, c1Var2));
        E();
        return c1Var;
    }

    @Override
    public void Q() {
        super.Q();
        d0();
        this.f3750r.N();
    }

    @Override
    public o1<?> k(boolean z7, p1 p1Var) {
        X xA = p1Var.a(this.f3749q.F(), 1);
        if (z7) {
            xA = X.Q(xA, this.f3749q.e());
        }
        if (xA == null) {
            return null;
        }
        return z(xA).d();
    }

    public Set<G0> k0() {
        return this.f3750r.z();
    }

    @Override
    public Set<Integer> x() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override
    public o1.a<?, ?, ?> z(X x7) {
        return new i(E0.e0(x7));
    }
}
