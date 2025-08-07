package s;

import C.X0;
import android.util.Size;
import r.C2739a;

final class J0 implements X0.e {

    static final J0 f22988a = new J0();

    J0() {
    }

    @Override
    public void a(Size size, C.o1<?> o1Var, X0.b bVar) {
        C.X0 x0N = o1Var.n(null);
        C.X xA0 = C.J0.a0();
        int iP = C.X0.b().p();
        if (x0N != null) {
            iP = x0N.p();
            bVar.b(x0N.c());
            bVar.d(x0N.l());
            bVar.c(x0N.j());
            xA0 = x0N.f();
        }
        bVar.v(xA0);
        if (o1Var instanceof C.M0) {
            w.o.b(size, bVar);
        }
        C2739a c2739a = new C2739a(o1Var);
        bVar.z(c2739a.b0(iP));
        bVar.f(c2739a.c0(N0.b()));
        bVar.k(c2739a.f0(M0.b()));
        bVar.e(T0.e(c2739a.e0(C2786U.c())));
        bVar.A(o1Var.G());
        bVar.y(o1Var.M());
        C.E0 e0D0 = C.E0.d0();
        e0D0.l(C2739a.f22727P, c2739a.d0(null));
        e0D0.l(C2739a.f22722K, Long.valueOf(c2739a.g0(-1L)));
        bVar.g(e0D0);
        bVar.g(c2739a.a0());
    }
}
