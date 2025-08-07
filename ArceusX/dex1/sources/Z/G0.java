package z;

import C.AbstractC0324e0;
import C.InterfaceC0351s0;
import C.X;
import C.X0;
import C.c1;
import C.o1;
import C.p1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class G0 {

    private o1<?> f24527d;

    private o1<?> f24528e;

    private o1<?> f24529f;

    private c1 f24530g;

    private o1<?> f24531h;

    private Rect f24532i;

    private C.J f24534k;

    private C.J f24535l;

    private AbstractC3056k f24536m;

    private String f24537n;

    private final Set<b> f24524a = new HashSet();

    private final Object f24525b = new Object();

    private a f24526c = a.INACTIVE;

    private Matrix f24533j = new Matrix();

    private X0 f24538o = X0.b();

    private X0 f24539p = X0.b();

    enum a {
        ACTIVE,
        INACTIVE
    }

    public interface b {
        void d(G0 g02);

        void e(G0 g02);

        void j(G0 g02);

        void m(G0 g02);
    }

    protected G0(o1<?> o1Var) {
        this.f24528e = o1Var;
        this.f24529f = o1Var;
    }

    private void R(b bVar) {
        this.f24524a.remove(bVar);
    }

    private void a(b bVar) {
        this.f24524a.add(bVar);
    }

    public Rect A() {
        return this.f24532i;
    }

    public boolean B(int i7) {
        Iterator<Integer> it = x().iterator();
        while (it.hasNext()) {
            if (M.a0.e(i7, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean C(C.J j7) {
        int iN = n();
        if (iN == -1 || iN == 0) {
            return false;
        }
        if (iN == 1) {
            return true;
        }
        if (iN == 2) {
            return j7.g();
        }
        throw new AssertionError("Unknown mirrorMode: " + iN);
    }

    public o1<?> D(C.I i7, o1<?> o1Var, o1<?> o1Var2) {
        C.E0 e0D0;
        if (o1Var2 != null) {
            e0D0 = C.E0.e0(o1Var2);
            e0D0.f0(H.m.f1523F);
        } else {
            e0D0 = C.E0.d0();
        }
        if (this.f24528e.b(InterfaceC0351s0.f716j) || this.f24528e.b(InterfaceC0351s0.f720n)) {
            X.a<P.c> aVar = InterfaceC0351s0.f724r;
            if (e0D0.b(aVar)) {
                e0D0.f0(aVar);
            }
        }
        o1<?> o1Var3 = this.f24528e;
        X.a<P.c> aVar2 = InterfaceC0351s0.f724r;
        if (o1Var3.b(aVar2)) {
            X.a<Size> aVar3 = InterfaceC0351s0.f722p;
            if (e0D0.b(aVar3) && ((P.c) this.f24528e.f(aVar2)).d() != null) {
                e0D0.f0(aVar3);
            }
        }
        Iterator<X.a<?>> it = this.f24528e.c().iterator();
        while (it.hasNext()) {
            C.X.m(e0D0, e0D0, this.f24528e, it.next());
        }
        if (o1Var != null) {
            for (X.a<?> aVar4 : o1Var.c()) {
                if (!aVar4.c().equals(H.m.f1523F.c())) {
                    C.X.m(e0D0, e0D0, o1Var, aVar4);
                }
            }
        }
        if (e0D0.b(InterfaceC0351s0.f720n)) {
            X.a<Integer> aVar5 = InterfaceC0351s0.f716j;
            if (e0D0.b(aVar5)) {
                e0D0.f0(aVar5);
            }
        }
        X.a<P.c> aVar6 = InterfaceC0351s0.f724r;
        if (e0D0.b(aVar6) && ((P.c) e0D0.f(aVar6)).a() != 0) {
            e0D0.l(o1.f672z, Boolean.TRUE);
        }
        return L(i7, z(e0D0));
    }

    protected final void E() {
        this.f24526c = a.ACTIVE;
        H();
    }

    protected final void F() {
        this.f24526c = a.INACTIVE;
        H();
    }

    protected final void G() {
        Iterator<b> it = this.f24524a.iterator();
        while (it.hasNext()) {
            it.next().m(this);
        }
    }

    public final void H() {
        int iOrdinal = this.f24526c.ordinal();
        if (iOrdinal == 0) {
            Iterator<b> it = this.f24524a.iterator();
            while (it.hasNext()) {
                it.next().j(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator<b> it2 = this.f24524a.iterator();
            while (it2.hasNext()) {
                it2.next().e(this);
            }
        }
    }

    protected final void I() {
        Iterator<b> it = this.f24524a.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
    }

    public void J() {
    }

    public void K() {
    }

    protected o1<?> L(C.I i7, o1.a<?, ?, ?> aVar) {
        return aVar.d();
    }

    public void M() {
    }

    public void N() {
    }

    protected c1 O(C.X x7) {
        c1 c1Var = this.f24530g;
        if (c1Var != null) {
            return c1Var.g().d(x7).a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    protected c1 P(c1 c1Var, c1 c1Var2) {
        return c1Var;
    }

    public void Q() {
    }

    public void S(AbstractC3056k abstractC3056k) {
        x0.g.a(abstractC3056k == null || B(abstractC3056k.g()));
        this.f24536m = abstractC3056k;
    }

    public void T(Matrix matrix) {
        this.f24533j = new Matrix(matrix);
    }

    protected boolean U(int i7) {
        int iW = ((InterfaceC0351s0) j()).W(-1);
        if (iW != -1 && iW == i7) {
            return false;
        }
        o1.a<?, ?, ?> aVarZ = z(this.f24528e);
        L.e.a(aVarZ, i7);
        this.f24528e = aVarZ.d();
        C.J jG = g();
        if (jG == null) {
            this.f24529f = this.f24528e;
            return true;
        }
        this.f24529f = D(jG.q(), this.f24527d, this.f24531h);
        return true;
    }

    public void V(Rect rect) {
        this.f24532i = rect;
    }

    public final void W(C.J j7) {
        Q();
        synchronized (this.f24525b) {
            try {
                C.J j8 = this.f24534k;
                if (j7 == j8) {
                    R(j8);
                    this.f24534k = null;
                }
                C.J j9 = this.f24535l;
                if (j7 == j9) {
                    R(j9);
                    this.f24535l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f24530g = null;
        this.f24532i = null;
        this.f24529f = this.f24528e;
        this.f24527d = null;
        this.f24531h = null;
    }

    protected void X(List<X0> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f24538o = list.get(0);
        if (list.size() > 1) {
            this.f24539p = list.get(1);
        }
        Iterator<X0> it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC0324e0 abstractC0324e0 : it.next().o()) {
                if (abstractC0324e0.g() == null) {
                    abstractC0324e0.s(getClass());
                }
            }
        }
    }

    public void Y(c1 c1Var, c1 c1Var2) {
        this.f24530g = P(c1Var, c1Var2);
    }

    public void Z(C.X x7) {
        this.f24530g = O(x7);
    }

    public final void b(C.J j7, C.J j8, o1<?> o1Var, o1<?> o1Var2) {
        synchronized (this.f24525b) {
            try {
                this.f24534k = j7;
                this.f24535l = j8;
                a(j7);
                if (j8 != null) {
                    a(j8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f24527d = o1Var;
        this.f24531h = o1Var2;
        this.f24529f = D(j7.q(), this.f24527d, this.f24531h);
        J();
    }

    protected o1<?> c() {
        return this.f24528e;
    }

    protected int d() {
        return ((InterfaceC0351s0) this.f24529f).C(-1);
    }

    public c1 e() {
        return this.f24530g;
    }

    public Size f() {
        c1 c1Var = this.f24530g;
        if (c1Var != null) {
            return c1Var.e();
        }
        return null;
    }

    public C.J g() {
        C.J j7;
        synchronized (this.f24525b) {
            j7 = this.f24534k;
        }
        return j7;
    }

    protected C.F h() {
        synchronized (this.f24525b) {
            try {
                C.J j7 = this.f24534k;
                if (j7 == null) {
                    return C.F.f386a;
                }
                return j7.h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected String i() {
        return ((C.J) x0.g.h(g(), "No camera attached to use case: " + this)).q().d();
    }

    public o1<?> j() {
        return this.f24529f;
    }

    public abstract o1<?> k(boolean z7, p1 p1Var);

    public AbstractC3056k l() {
        return this.f24536m;
    }

    public int m() {
        return this.f24529f.t();
    }

    protected int n() {
        return ((InterfaceC0351s0) this.f24529f).X(-1);
    }

    public String o() {
        String strD = this.f24529f.D("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strD);
        return strD;
    }

    public String p() {
        return this.f24537n;
    }

    protected int q(C.J j7) {
        return r(j7, false);
    }

    protected int r(C.J j7, boolean z7) {
        int iL = j7.q().l(y());
        return (j7.o() || !z7) ? iL : E.q.w(-iL);
    }

    public C.J s() {
        C.J j7;
        synchronized (this.f24525b) {
            j7 = this.f24535l;
        }
        return j7;
    }

    protected String t() {
        if (s() == null) {
            return null;
        }
        return s().q().d();
    }

    public X0 u() {
        return this.f24539p;
    }

    public Matrix v() {
        return this.f24533j;
    }

    public X0 w() {
        return this.f24538o;
    }

    protected Set<Integer> x() {
        return Collections.emptySet();
    }

    protected int y() {
        return ((InterfaceC0351s0) this.f24529f).W(0);
    }

    public abstract o1.a<?, ?, ?> z(C.X x7);
}
