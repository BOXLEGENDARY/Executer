package Q;

import C.AbstractC0324e0;
import C.AbstractC0345p;
import C.D0;
import C.InterfaceC0349r0;
import C.InterfaceC0351s0;
import C.InterfaceC0364z;
import C.J;
import C.X0;
import C.o1;
import C.p1;
import M.N;
import Q.h;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import z.C3070z;
import z.G0;
import z.T;
import z.o0;

class l implements G0.b {

    private final Set<o1<?>> f3767B;

    private final Map<G0, o1<?>> f3768C;

    private final b f3769D;

    private b f3770E;

    final Set<G0> f3771d;

    private final p1 f3775w;

    private final J f3776y;

    private final J f3777z;

    final Map<G0, N> f3772e = new HashMap();

    private final Map<G0, k> f3773i = new HashMap();

    final Map<G0, Boolean> f3774v = new HashMap();

    private final AbstractC0345p f3766A = t();

    class a extends AbstractC0345p {
        a() {
        }

        @Override
        public void b(int i7, InterfaceC0364z interfaceC0364z) {
            super.b(i7, interfaceC0364z);
            Iterator<G0> it = l.this.f3771d.iterator();
            while (it.hasNext()) {
                l.K(interfaceC0364z, it.next().w(), i7);
            }
        }
    }

    l(J j7, J j8, Set<G0> set, p1 p1Var, h.a aVar) {
        this.f3776y = j7;
        this.f3777z = j8;
        this.f3775w = p1Var;
        this.f3771d = set;
        Map<G0, o1<?>> mapM = M(j7, set, p1Var);
        this.f3768C = mapM;
        HashSet hashSet = new HashSet(mapM.values());
        this.f3767B = hashSet;
        this.f3769D = new b(j7, hashSet);
        if (j8 != null) {
            this.f3770E = new b(j8, hashSet);
        }
        for (G0 g02 : set) {
            this.f3774v.put(g02, Boolean.FALSE);
            this.f3773i.put(g02, new k(j7, this, aVar));
        }
    }

    private static int C(Set<o1<?>> set) {
        Iterator<o1<?>> it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().K(0));
        }
        return iMax;
    }

    private N E(G0 g02) {
        N n7 = this.f3772e.get(g02);
        Objects.requireNonNull(n7);
        return n7;
    }

    private boolean F(G0 g02) {
        Boolean bool = this.f3774v.get(g02);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    static void K(InterfaceC0364z interfaceC0364z, X0 x02, int i7) {
        Iterator<AbstractC0345p> it = x02.j().iterator();
        while (it.hasNext()) {
            it.next().b(i7, new m(x02.k().j(), interfaceC0364z));
        }
    }

    private static Map<G0, o1<?>> M(J j7, Set<G0> set, p1 p1Var) {
        HashMap map = new HashMap();
        for (G0 g02 : set) {
            map.put(g02, g02.D(j7.q(), null, g02.k(true, p1Var)));
        }
        return map;
    }

    private O.f s(G0 g02, b bVar, J j7, N n7, int i7, boolean z7) {
        int iL = j7.c().l(i7);
        boolean zL = E.q.l(n7.r());
        o1<?> o1Var = this.f3768C.get(g02);
        Objects.requireNonNull(o1Var);
        Pair<Rect, Size> pairS = bVar.s(o1Var, n7.n(), E.q.g(n7.r()), z7);
        Rect rect = (Rect) pairS.first;
        Size size = (Size) pairS.second;
        int iW = w(g02, this.f3776y);
        k kVar = this.f3773i.get(g02);
        Objects.requireNonNull(kVar);
        kVar.r(iW);
        int iW2 = E.q.w((n7.q() + iW) - iL);
        return O.f.h(y(g02), v(g02), rect, E.q.q(size, iW2), iW2, g02.C(j7) ^ zL);
    }

    private static void u(N n7, AbstractC0324e0 abstractC0324e0, X0 x02) {
        n7.v();
        try {
            n7.C(abstractC0324e0);
        } catch (AbstractC0324e0.a unused) {
            if (x02.d() != null) {
                x02.d().a(x02, X0.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    private static int v(G0 g02) {
        return g02 instanceof T ? 256 : 34;
    }

    private int w(G0 g02, J j7) {
        return j7.c().l(((InterfaceC0351s0) g02.j()).W(0));
    }

    static AbstractC0324e0 x(G0 g02) {
        List<AbstractC0324e0> listO = g02 instanceof T ? g02.w().o() : g02.w().k().i();
        x0.g.i(listO.size() <= 1);
        if (listO.size() == 1) {
            return listO.get(0);
        }
        return null;
    }

    private static int y(G0 g02) {
        if (g02 instanceof o0) {
            return 1;
        }
        return g02 instanceof T ? 4 : 2;
    }

    Map<G0, O.f> A(N n7, int i7, boolean z7) {
        HashMap map = new HashMap();
        for (G0 g02 : this.f3771d) {
            map.put(g02, s(g02, this.f3769D, this.f3776y, n7, i7, z7));
        }
        return map;
    }

    Map<G0, N.d> B(N n7, N n8, int i7, boolean z7) {
        HashMap map = new HashMap();
        for (G0 g02 : this.f3771d) {
            O.f fVarS = s(g02, this.f3769D, this.f3776y, n7, i7, z7);
            b bVar = this.f3770E;
            J j7 = this.f3777z;
            Objects.requireNonNull(j7);
            map.put(g02, N.d.c(fVarS, s(g02, bVar, j7, n8, i7, z7)));
        }
        return map;
    }

    AbstractC0345p D() {
        return this.f3766A;
    }

    void G(D0 d02) {
        d02.l(InterfaceC0351s0.f725s, this.f3769D.o(d02));
        d02.l(o1.f670x, Integer.valueOf(C(this.f3767B)));
        C3070z c3070zD = Q.a.d(this.f3767B);
        if (c3070zD == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        d02.l(InterfaceC0349r0.f707i, c3070zD);
        for (G0 g02 : this.f3771d) {
            if (g02.j().G() != 0) {
                d02.l(o1.f665D, Integer.valueOf(g02.j().G()));
            }
            if (g02.j().M() != 0) {
                d02.l(o1.f664C, Integer.valueOf(g02.j().M()));
            }
        }
    }

    void H() {
        for (G0 g02 : this.f3771d) {
            g02.M();
            g02.K();
        }
    }

    void I() {
        Iterator<G0> it = this.f3771d.iterator();
        while (it.hasNext()) {
            it.next().N();
        }
    }

    void J() {
        E.p.a();
        Iterator<G0> it = this.f3771d.iterator();
        while (it.hasNext()) {
            m(it.next());
        }
    }

    void L(Map<G0, N> map) {
        this.f3772e.clear();
        this.f3772e.putAll(map);
        for (Map.Entry<G0, N> entry : this.f3772e.entrySet()) {
            G0 key = entry.getKey();
            N value = entry.getValue();
            key.V(value.n());
            key.T(value.r());
            key.Y(value.s(), null);
            key.H();
        }
    }

    void N() {
        for (G0 g02 : this.f3771d) {
            k kVar = this.f3773i.get(g02);
            Objects.requireNonNull(kVar);
            g02.W(kVar);
        }
    }

    @Override
    public void d(G0 g02) {
        E.p.a();
        if (F(g02)) {
            N nE = E(g02);
            AbstractC0324e0 abstractC0324e0X = x(g02);
            if (abstractC0324e0X != null) {
                u(nE, abstractC0324e0X, g02.w());
            } else {
                nE.m();
            }
        }
    }

    @Override
    public void e(G0 g02) {
        E.p.a();
        if (F(g02)) {
            this.f3774v.put(g02, Boolean.FALSE);
            E(g02).m();
        }
    }

    @Override
    public void j(G0 g02) {
        E.p.a();
        if (F(g02)) {
            return;
        }
        this.f3774v.put(g02, Boolean.TRUE);
        AbstractC0324e0 abstractC0324e0X = x(g02);
        if (abstractC0324e0X != null) {
            u(E(g02), abstractC0324e0X, g02.w());
        }
    }

    @Override
    public void m(G0 g02) {
        AbstractC0324e0 abstractC0324e0X;
        E.p.a();
        N nE = E(g02);
        if (F(g02) && (abstractC0324e0X = x(g02)) != null) {
            u(nE, abstractC0324e0X, g02.w());
        }
    }

    void r() {
        for (G0 g02 : this.f3771d) {
            k kVar = this.f3773i.get(g02);
            Objects.requireNonNull(kVar);
            g02.b(kVar, null, null, g02.k(true, this.f3775w));
        }
    }

    AbstractC0345p t() {
        return new a();
    }

    Set<G0> z() {
        return this.f3771d;
    }
}
