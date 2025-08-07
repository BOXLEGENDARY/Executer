package Z1;

import a2.c;
import java.io.IOException;
import java.util.ArrayList;

class I {
    private static final c.a a = c.a.a("nm", "hd", "it");

    static W1.o a(a2.c cVar, P1.d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strU = null;
        boolean zY = false;
        while (cVar.u()) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                strU = cVar.U();
            } else if (iN0 == 1) {
                zY = cVar.y();
            } else if (iN0 != 2) {
                cVar.H0();
            } else {
                cVar.e();
                while (cVar.u()) {
                    W1.c cVarA = C0436h.a(cVar, dVar);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                cVar.j();
            }
        }
        return new W1.o(strU, arrayList, zY);
    }
}
