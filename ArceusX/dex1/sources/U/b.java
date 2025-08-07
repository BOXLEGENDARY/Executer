package U;

import C.InterfaceC0334j0;
import C.InterfaceC0336k0;
import X.i0;
import X.k0;
import android.util.Rational;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n.InterfaceC2621a;
import z.C3043d0;

public class b implements InterfaceC0334j0 {

    private final InterfaceC0334j0 f7479c;

    private final InterfaceC2621a<i0, k0> f7480d;

    private final Map<Integer, InterfaceC0336k0> f7481e = new HashMap();

    public b(InterfaceC0334j0 interfaceC0334j0, InterfaceC2621a<i0, k0> interfaceC2621a) {
        this.f7479c = interfaceC0334j0;
        this.f7480d = interfaceC2621a;
    }

    private InterfaceC0336k0 c(InterfaceC0336k0 interfaceC0336k0, int i7, int i8) {
        InterfaceC0336k0.c next;
        if (interfaceC0336k0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(interfaceC0336k0.d());
        Iterator<InterfaceC0336k0.c> it = interfaceC0336k0.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.g() == 0) {
                break;
            }
        }
        InterfaceC0336k0.c cVarK = k(g(next, i7, i8), this.f7480d);
        if (cVarK != null) {
            arrayList.add(cVarK);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC0336k0.b.h(interfaceC0336k0.a(), interfaceC0336k0.b(), interfaceC0336k0.c(), arrayList);
    }

    private static int d(int i7) {
        if (i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i7);
    }

    private static String e(int i7) {
        return InterfaceC0336k0.g(i7);
    }

    private static int f(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 == 2) {
            return 4096;
        }
        if (i7 == 3) {
            return 8192;
        }
        if (i7 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i7);
    }

    private static InterfaceC0336k0.c g(InterfaceC0336k0.c cVar, int i7, int i8) {
        if (cVar == null) {
            return null;
        }
        int iE = cVar.e();
        String strI = cVar.i();
        int iJ = cVar.j();
        if (i7 != cVar.g()) {
            iE = d(i7);
            strI = e(iE);
            iJ = f(i7);
        }
        return InterfaceC0336k0.c.a(iE, strI, j(cVar.c(), i8, cVar.b()), cVar.f(), cVar.k(), cVar.h(), iJ, i8, cVar.d(), i7);
    }

    private InterfaceC0336k0 h(int i7) {
        if (this.f7481e.containsKey(Integer.valueOf(i7))) {
            return this.f7481e.get(Integer.valueOf(i7));
        }
        if (!this.f7479c.a(i7)) {
            return null;
        }
        InterfaceC0336k0 interfaceC0336k0C = c(this.f7479c.b(i7), 1, 10);
        this.f7481e.put(Integer.valueOf(i7), interfaceC0336k0C);
        return interfaceC0336k0C;
    }

    private static InterfaceC0336k0.c i(InterfaceC0336k0.c cVar, int i7) {
        return InterfaceC0336k0.c.a(cVar.e(), cVar.i(), i7, cVar.f(), cVar.k(), cVar.h(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private static int j(int i7, int i8, int i9) {
        if (i8 == i9) {
            return i7;
        }
        int iDoubleValue = (int) (i7 * new Rational(i8, i9).doubleValue());
        if (C3043d0.f("BackupHdrProfileEncoderProfilesProvider")) {
            C3043d0.a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iDoubleValue)));
        }
        return iDoubleValue;
    }

    static InterfaceC0336k0.c k(InterfaceC0336k0.c cVar, InterfaceC2621a<i0, k0> interfaceC2621a) {
        i0 i0VarF;
        k0 k0VarApply;
        if (cVar == null || (k0VarApply = interfaceC2621a.apply((i0VarF = W.c.f(cVar)))) == null || !k0VarApply.a(cVar.k(), cVar.h())) {
            return null;
        }
        int iE = i0VarF.e();
        int iIntValue = ((Integer) k0VarApply.c().clamp(Integer.valueOf(iE))).intValue();
        return iIntValue == iE ? cVar : i(cVar, iIntValue);
    }

    @Override
    public boolean a(int i7) {
        return this.f7479c.a(i7) && h(i7) != null;
    }

    @Override
    public InterfaceC0336k0 b(int i7) {
        return h(i7);
    }
}
