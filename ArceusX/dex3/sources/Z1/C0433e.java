package Z1;

import a2.c;
import java.io.IOException;

class C0433e {
    private static final c.a a = c.a.a("ef");
    private static final c.a b = c.a.a("ty", "v");

    private static W1.a a(a2.c cVar, P1.d dVar) throws IOException {
        cVar.f();
        W1.a aVar = null;
        while (true) {
            boolean z = false;
            while (cVar.u()) {
                int iN0 = cVar.n0(b);
                if (iN0 != 0) {
                    if (iN0 != 1) {
                        cVar.t0();
                        cVar.H0();
                    } else if (z) {
                        aVar = new W1.a(C0432d.e(cVar, dVar));
                    } else {
                        cVar.H0();
                    }
                } else if (cVar.K() == 0) {
                    z = true;
                }
            }
            cVar.m();
            return aVar;
        }
    }

    static W1.a b(a2.c cVar, P1.d dVar) throws IOException {
        W1.a aVar = null;
        while (cVar.u()) {
            if (cVar.n0(a) != 0) {
                cVar.t0();
                cVar.H0();
            } else {
                cVar.e();
                while (cVar.u()) {
                    W1.a aVarA = a(cVar, dVar);
                    if (aVarA != null) {
                        aVar = aVarA;
                    }
                }
                cVar.j();
            }
        }
        return aVar;
    }
}
