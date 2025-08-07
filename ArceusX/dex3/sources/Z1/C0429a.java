package Z1;

import a2.c;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;

public class C0429a {
    private static final c.a a = c.a.a("k", "x", "y");

    public static V1.e a(a2.c cVar, P1.d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.h0() == c.b.BEGIN_ARRAY) {
            cVar.e();
            while (cVar.u()) {
                arrayList.add(z.a(cVar, dVar));
            }
            cVar.j();
            u.b(arrayList);
        } else {
            arrayList.add(new c2.a(s.e(cVar, b2.h.e())));
        }
        return new V1.e(arrayList);
    }

    static V1.m<PointF, PointF> b(a2.c cVar, P1.d dVar) throws IOException {
        cVar.f();
        V1.e eVarA = null;
        V1.b bVarE = null;
        boolean z = false;
        V1.b bVarE2 = null;
        while (cVar.h0() != c.b.END_OBJECT) {
            int iN0 = cVar.n0(a);
            if (iN0 == 0) {
                eVarA = a(cVar, dVar);
            } else if (iN0 != 1) {
                if (iN0 != 2) {
                    cVar.t0();
                    cVar.H0();
                } else if (cVar.h0() == c.b.STRING) {
                    cVar.H0();
                    z = true;
                } else {
                    bVarE = C0432d.e(cVar, dVar);
                }
            } else if (cVar.h0() == c.b.STRING) {
                cVar.H0();
                z = true;
            } else {
                bVarE2 = C0432d.e(cVar, dVar);
            }
        }
        cVar.m();
        if (z) {
            dVar.a("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new V1.i(bVarE2, bVarE);
    }
}
