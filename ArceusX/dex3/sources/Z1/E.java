package Z1;

import a2.c;
import java.io.IOException;

class E {
    private static final c.a a = c.a.a("nm", "c", "o", "tr", "hd");

    static W1.l a(a2.c cVar, P1.d dVar) throws IOException {
        String strU = null;
        V1.b bVarF = null;
        V1.b bVarF2 = null;
        V1.l lVarG = null;
        boolean zY = false;
        while (cVar.u()) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                strU = cVar.U();
            } else if (iN0 == 1) {
                bVarF = C0432d.f(cVar, dVar, false);
            } else if (iN0 == 2) {
                bVarF2 = C0432d.f(cVar, dVar, false);
            } else if (iN0 == 3) {
                lVarG = C0431c.g(cVar, dVar);
            } else if (iN0 != 4) {
                cVar.H0();
            } else {
                zY = cVar.y();
            }
        }
        return new W1.l(strU, bVarF, bVarF2, lVarG, zY);
    }
}
