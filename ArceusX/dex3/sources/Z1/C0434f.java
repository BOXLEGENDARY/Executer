package Z1;

import a2.c;
import android.graphics.PointF;
import java.io.IOException;

class C0434f {
    private static final c.a a = c.a.a("nm", "p", "s", "hd", "d");

    static W1.b a(a2.c cVar, P1.d dVar, int i) throws IOException {
        boolean z = i == 3;
        boolean zY = false;
        String strU = null;
        V1.m<PointF, PointF> mVarB = null;
        V1.f fVarI = null;
        while (cVar.u()) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                strU = cVar.U();
            } else if (iN0 == 1) {
                mVarB = C0429a.b(cVar, dVar);
            } else if (iN0 == 2) {
                fVarI = C0432d.i(cVar, dVar);
            } else if (iN0 == 3) {
                zY = cVar.y();
            } else if (iN0 != 4) {
                cVar.t0();
                cVar.H0();
            } else {
                z = cVar.K() == 3;
            }
        }
        return new W1.b(strU, mVarB, fVarI, z, zY);
    }
}
