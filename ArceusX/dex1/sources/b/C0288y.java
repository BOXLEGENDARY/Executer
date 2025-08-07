package B;

import B.C0284u;
import B.Z;
import C.C0348q0;
import C.InterfaceC0349r0;
import C.V;
import C.X0;
import M.C0528y;
import android.util.Size;
import androidx.camera.core.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import x0.C2986c;
import z.AbstractC3056k;
import z.C3068x;

public class C0288y {

    private static int f267f;

    static final K.b f268g = new K.b();

    private final C0348q0 f269a;

    private final C.V f270b;

    private final C0284u f271c;

    private final O f272d;

    private final C0284u.c f273e;

    public C0288y(C0348q0 c0348q0, Size size, AbstractC3056k abstractC3056k, boolean z7, Size size2, int i7) {
        E.p.a();
        this.f269a = c0348q0;
        this.f270b = V.a.j(c0348q0).h();
        C0284u c0284u = new C0284u();
        this.f271c = c0284u;
        Executor executorE0 = c0348q0.e0(F.a.c());
        Objects.requireNonNull(executorE0);
        O o2 = new O(executorE0, abstractC3056k != null ? new C0528y(abstractC3056k) : null);
        this.f272d = o2;
        C0284u.c cVarM = C0284u.c.m(size, c0348q0.t(), i(), z7, c0348q0.d0(), size2, i7);
        this.f273e = cVarM;
        o2.x(c0284u.v(cVarM));
    }

    private C0276l b(int i7, C.U u7, f0 f0Var, V v7) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(u7.hashCode());
        List<C.W> listA = u7.a();
        Objects.requireNonNull(listA);
        for (C.W w8 : listA) {
            V.a aVar = new V.a();
            aVar.v(this.f270b.k());
            aVar.e(this.f270b.g());
            aVar.a(f0Var.p());
            aVar.f(this.f273e.k());
            aVar.t(l());
            if (L.b.j(this.f273e.d())) {
                if (f268g.a()) {
                    aVar.d(C.V.f441i, Integer.valueOf(f0Var.n()));
                }
                aVar.d(C.V.f442j, Integer.valueOf(g(f0Var)));
            }
            aVar.e(w8.a0().g());
            aVar.g(strValueOf, Integer.valueOf(w8.Z()));
            aVar.r(i7);
            aVar.c(this.f273e.a());
            arrayList.add(aVar.h());
        }
        return new C0276l(arrayList, v7);
    }

    private C.U c() {
        C.U uZ = this.f269a.Z(C3068x.b());
        Objects.requireNonNull(uZ);
        return uZ;
    }

    private P d(int i7, C.U u7, f0 f0Var, V v7, com.google.common.util.concurrent.p<Void> pVar) {
        return new P(u7, f0Var.m(), f0Var.i(), f0Var.n(), f0Var.k(), f0Var.o(), v7, pVar, i7);
    }

    private int i() {
        Integer num = (Integer) this.f269a.a(C0348q0.f692M, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f269a.a(InterfaceC0349r0.f706h, null);
        return (num2 == null || num2.intValue() != 4101) ? 256 : 4101;
    }

    private boolean l() {
        return this.f273e.h() != null;
    }

    public void a() {
        E.p.a();
        this.f271c.r();
        this.f272d.v();
    }

    C2986c<C0276l, P> e(f0 f0Var, V v7, com.google.common.util.concurrent.p<Void> pVar) {
        E.p.a();
        C.U uC = c();
        int i7 = f267f;
        f267f = i7 + 1;
        return new C2986c<>(b(i7, uC, f0Var, v7), d(i7, uC, f0Var, v7, pVar));
    }

    public X0.b f(Size size) {
        X0.b bVarQ = X0.b.q(this.f269a, size);
        bVarQ.h(this.f273e.k());
        if (this.f273e.h() != null) {
            bVarQ.x(this.f273e.h());
        }
        return bVarQ;
    }

    int g(f0 f0Var) {
        return ((f0Var.l() != null) && E.q.h(f0Var.i(), this.f273e.j())) ? f0Var.h() == 0 ? 100 : 95 : f0Var.k();
    }

    public int h() {
        E.p.a();
        return this.f271c.h();
    }

    void j(Z.b bVar) {
        E.p.a();
        this.f273e.b().accept(bVar);
    }

    public void k(e.a aVar) {
        E.p.a();
        this.f271c.u(aVar);
    }

    void m(P p7) {
        E.p.a();
        this.f273e.i().accept(p7);
    }
}
