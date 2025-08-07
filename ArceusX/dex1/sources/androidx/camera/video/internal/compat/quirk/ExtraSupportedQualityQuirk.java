package androidx.camera.video.internal.compat.quirk;

import C.I;
import C.InterfaceC0334j0;
import C.InterfaceC0336k0;
import C.N0;
import L.d;
import X.i0;
import X.k0;
import Y.c;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import n.InterfaceC2621a;

public class ExtraSupportedQualityQuirk implements N0 {
    private Map<Integer, InterfaceC0336k0> g(I i7, InterfaceC0334j0 interfaceC0334j0, InterfaceC2621a<i0, k0> interfaceC2621a) {
        InterfaceC0336k0 interfaceC0336k0B;
        InterfaceC0336k0.c cVarB;
        if (!"1".equals(i7.d()) || interfaceC0334j0.a(4) || (cVarB = c.b((interfaceC0336k0B = interfaceC0334j0.b(1)))) == null) {
            return null;
        }
        Range<Integer> rangeH = h(cVarB, interfaceC2621a);
        Size size = d.f1940d;
        InterfaceC0336k0.b bVarH = InterfaceC0336k0.b.h(interfaceC0336k0B.a(), interfaceC0336k0B.b(), interfaceC0336k0B.c(), Collections.singletonList(c.a(cVarB, size, rangeH)));
        HashMap map = new HashMap();
        map.put(4, bVarH);
        if (d.c(size) > d.c(new Size(cVarB.k(), cVarB.h()))) {
            map.put(1, bVarH);
        }
        return map;
    }

    private static Range<Integer> h(InterfaceC0336k0.c cVar, InterfaceC2621a<i0, k0> interfaceC2621a) {
        k0 k0VarApply = interfaceC2621a.apply(W.c.f(cVar));
        return k0VarApply != null ? k0VarApply.c() : S.i0.f6333b;
    }

    private static boolean i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean j() {
        return i();
    }

    public Map<Integer, InterfaceC0336k0> f(I i7, InterfaceC0334j0 interfaceC0334j0, InterfaceC2621a<i0, k0> interfaceC2621a) {
        return i() ? g(i7, interfaceC0334j0, interfaceC2621a) : Collections.emptyMap();
    }
}
