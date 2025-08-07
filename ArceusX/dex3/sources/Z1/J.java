package Z1;

import a2.c;
import java.io.IOException;

class J {
    static c.a a = c.a.a("nm", "ind", "ks", "hd");

    static W1.p a(a2.c cVar, P1.d dVar) throws IOException {
        String strU = null;
        int iK = 0;
        boolean zY = false;
        V1.h hVarK = null;
        while (cVar.u()) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                strU = cVar.U();
            } else if (iN0 == 1) {
                iK = cVar.K();
            } else if (iN0 == 2) {
                hVarK = C0432d.k(cVar, dVar);
            } else if (iN0 != 3) {
                cVar.H0();
            } else {
                zY = cVar.y();
            }
        }
        return new W1.p(strU, iK, hVarK, zY);
    }
}
