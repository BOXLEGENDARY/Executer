package Z1;

import a2.c;
import java.io.IOException;
import java.util.ArrayList;

class C0441m {
    private static final c.a a = c.a.a("ch", "size", "w", "style", "fFamily", "data");
    private static final c.a b = c.a.a("shapes");

    static U1.d a(a2.c cVar, P1.d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.f();
        double dA = 0.0d;
        String strU = null;
        String strU2 = null;
        char cCharAt = 0;
        double dA2 = 0.0d;
        while (cVar.u()) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                cCharAt = cVar.U().charAt(0);
            } else if (iN0 == 1) {
                dA2 = cVar.A();
            } else if (iN0 == 2) {
                dA = cVar.A();
            } else if (iN0 == 3) {
                strU = cVar.U();
            } else if (iN0 == 4) {
                strU2 = cVar.U();
            } else if (iN0 != 5) {
                cVar.t0();
                cVar.H0();
            } else {
                cVar.f();
                while (cVar.u()) {
                    if (cVar.n0(b) != 0) {
                        cVar.t0();
                        cVar.H0();
                    } else {
                        cVar.e();
                        while (cVar.u()) {
                            arrayList.add((W1.o) C0436h.a(cVar, dVar));
                        }
                        cVar.j();
                    }
                }
                cVar.m();
            }
        }
        cVar.m();
        return new U1.d(arrayList, cCharAt, dA2, dA, strU, strU2);
    }
}
