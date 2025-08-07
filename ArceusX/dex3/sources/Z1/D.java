package Z1;

import a2.c;
import android.graphics.PointF;
import java.io.IOException;

class D {
    private static final c.a a = c.a.a("nm", "p", "s", "r", "hd");

    static W1.k a(a2.c cVar, P1.d dVar) throws IOException {
        String strU = null;
        V1.m<PointF, PointF> mVarB = null;
        V1.f fVarI = null;
        V1.b bVarE = null;
        boolean zY = false;
        while (cVar.u()) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                strU = cVar.U();
            } else if (iN0 == 1) {
                mVarB = C0429a.b(cVar, dVar);
            } else if (iN0 == 2) {
                fVarI = C0432d.i(cVar, dVar);
            } else if (iN0 == 3) {
                bVarE = C0432d.e(cVar, dVar);
            } else if (iN0 != 4) {
                cVar.H0();
            } else {
                zY = cVar.y();
            }
        }
        return new W1.k(strU, mVarB, fVarI, bVarE, zY);
    }
}
