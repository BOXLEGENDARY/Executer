package E;

import C.Z0;
import java.util.ArrayList;
import z.C3032B;

public final class o {
    public static C3032B a(Z0 z02, C3032B c3032b) {
        boolean z7;
        if (z02 == null) {
            return c3032b;
        }
        C3032B.a aVar = new C3032B.a(c3032b);
        boolean z8 = true;
        if (c3032b.c().isEmpty() || b(z02, 1, 2)) {
            z7 = false;
        } else {
            aVar.c(1);
            z7 = true;
        }
        if (!c3032b.b().isEmpty() && !b(z02, 3)) {
            aVar.c(2);
            z7 = true;
        }
        if (c3032b.d().isEmpty() || b(z02, 4)) {
            z8 = z7;
        } else {
            aVar.c(4);
        }
        if (!z8) {
            return c3032b;
        }
        C3032B c3032bB = aVar.b();
        if (c3032bB.c().isEmpty() && c3032bB.b().isEmpty() && c3032bB.d().isEmpty()) {
            return null;
        }
        return aVar.b();
    }

    public static boolean b(Z0 z02, int... iArr) {
        if (z02 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i7 : iArr) {
            arrayList.add(Integer.valueOf(i7));
        }
        return z02.h().containsAll(arrayList);
    }
}
