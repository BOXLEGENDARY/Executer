package Z1;

import W1.r;
import a2.c;
import java.io.IOException;

class L {
    private static final c.a a = c.a.a("s", "e", "o", "nm", "m", "hd");

    static W1.r a(a2.c cVar, P1.d dVar) throws IOException {
        String strU = null;
        r.a aVarC = null;
        V1.b bVarF = null;
        V1.b bVarF2 = null;
        V1.b bVarF3 = null;
        boolean zY = false;
        while (cVar.u()) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                bVarF = C0432d.f(cVar, dVar, false);
            } else if (iN0 == 1) {
                bVarF2 = C0432d.f(cVar, dVar, false);
            } else if (iN0 == 2) {
                bVarF3 = C0432d.f(cVar, dVar, false);
            } else if (iN0 == 3) {
                strU = cVar.U();
            } else if (iN0 == 4) {
                aVarC = r.a.c(cVar.K());
            } else if (iN0 != 5) {
                cVar.H0();
            } else {
                zY = cVar.y();
            }
        }
        return new W1.r(strU, aVarC, bVarF, bVarF2, bVarF3, zY);
    }
}
