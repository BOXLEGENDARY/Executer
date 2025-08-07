package s;

import C.C0348q0;
import C.V;
import r.C2739a;

final class A1 extends C2787V {

    static final A1 f22931c = new A1(new w.j());

    private final w.j f22932b;

    private A1(w.j jVar) {
        this.f22932b = jVar;
    }

    @Override
    public void a(C.o1<?> o1Var, V.a aVar) {
        super.a(o1Var, aVar);
        if (!(o1Var instanceof C0348q0)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C0348q0 c0348q0 = (C0348q0) o1Var;
        C2739a.C0218a c0218a = new C2739a.C0218a();
        if (c0348q0.h0()) {
            this.f22932b.a(c0348q0.a0(), c0218a);
        }
        aVar.e(c0218a.a());
    }
}
