package Z1;

import a2.c;
import java.io.IOException;

class n {
    private static final c.a a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    static U1.c a(a2.c cVar) throws IOException {
        cVar.f();
        String strU = null;
        String strU2 = null;
        float fA = 0.0f;
        String strU3 = null;
        while (cVar.u()) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                strU = cVar.U();
            } else if (iN0 == 1) {
                strU3 = cVar.U();
            } else if (iN0 == 2) {
                strU2 = cVar.U();
            } else if (iN0 != 3) {
                cVar.t0();
                cVar.H0();
            } else {
                fA = (float) cVar.A();
            }
        }
        cVar.m();
        return new U1.c(strU, strU3, strU2, fA);
    }
}
