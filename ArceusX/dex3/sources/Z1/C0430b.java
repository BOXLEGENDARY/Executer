package Z1;

import a2.c;
import java.io.IOException;

public class C0430b {
    private static final c.a a = c.a.a("a");
    private static final c.a b = c.a.a("fc", "sc", "sw", "t");

    public static V1.k a(a2.c cVar, P1.d dVar) throws IOException {
        cVar.f();
        V1.k kVarB = null;
        while (cVar.u()) {
            if (cVar.n0(a) != 0) {
                cVar.t0();
                cVar.H0();
            } else {
                kVarB = b(cVar, dVar);
            }
        }
        cVar.m();
        return kVarB == null ? new V1.k(null, null, null, null) : kVarB;
    }

    private static V1.k b(a2.c cVar, P1.d dVar) throws IOException {
        cVar.f();
        V1.a aVarC = null;
        V1.a aVarC2 = null;
        V1.b bVarE = null;
        V1.b bVarE2 = null;
        while (cVar.u()) {
            int iN0 = cVar.n0(b);
            if (iN0 == 0) {
                aVarC = C0432d.c(cVar, dVar);
            } else if (iN0 == 1) {
                aVarC2 = C0432d.c(cVar, dVar);
            } else if (iN0 == 2) {
                bVarE = C0432d.e(cVar, dVar);
            } else if (iN0 != 3) {
                cVar.t0();
                cVar.H0();
            } else {
                bVarE2 = C0432d.e(cVar, dVar);
            }
        }
        cVar.m();
        return new V1.k(aVarC, aVarC2, bVarE, bVarE2);
    }
}
