package Z1;

import a2.c;
import android.graphics.Path;
import java.io.IOException;
import java.util.Collections;

class H {
    private static final c.a a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static W1.n a(a2.c cVar, P1.d dVar) throws IOException {
        V1.d dVar2 = null;
        String strU = null;
        V1.a aVarC = null;
        boolean zY = false;
        boolean zY2 = false;
        int iK = 1;
        while (cVar.u()) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                strU = cVar.U();
            } else if (iN0 == 1) {
                aVarC = C0432d.c(cVar, dVar);
            } else if (iN0 == 2) {
                dVar2 = C0432d.h(cVar, dVar);
            } else if (iN0 == 3) {
                zY = cVar.y();
            } else if (iN0 == 4) {
                iK = cVar.K();
            } else if (iN0 != 5) {
                cVar.t0();
                cVar.H0();
            } else {
                zY2 = cVar.y();
            }
        }
        if (dVar2 == null) {
            dVar2 = new V1.d(Collections.singletonList(new c2.a(100)));
        }
        return new W1.n(strU, zY, iK == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarC, dVar2, zY2);
    }
}
