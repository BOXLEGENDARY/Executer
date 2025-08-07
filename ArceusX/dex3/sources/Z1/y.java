package Z1;

import W1.i;
import a2.c;
import java.io.IOException;

class y {
    private static final c.a a = c.a.a("nm", "mm", "hd");

    static W1.i a(a2.c cVar) throws IOException {
        String strU = null;
        boolean zY = false;
        i.a aVarC = null;
        while (cVar.u()) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                strU = cVar.U();
            } else if (iN0 == 1) {
                aVarC = i.a.c(cVar.K());
            } else if (iN0 != 2) {
                cVar.t0();
                cVar.H0();
            } else {
                zY = cVar.y();
            }
        }
        return new W1.i(strU, aVarC, zY);
    }
}
