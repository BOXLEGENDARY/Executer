package S;

import C.InterfaceC0334j0;
import C.InterfaceC0336k0;
import S.C1230l;
import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import z.C3043d0;

public class C1227i {

    private final Map<C1230l, U.g> f6328a = new LinkedHashMap();

    private final TreeMap<Size, C1230l> f6329b = new TreeMap<>(new E.d());

    private final U.g f6330c;

    private final U.g f6331d;

    public C1227i(InterfaceC0334j0 interfaceC0334j0) {
        for (C1230l c1230l : C1230l.b()) {
            InterfaceC0336k0 interfaceC0336k0D = d(c1230l, interfaceC0334j0);
            if (interfaceC0336k0D != null) {
                C3043d0.a("CapabilitiesByQuality", "profiles = " + interfaceC0336k0D);
                U.g gVarG = g(interfaceC0336k0D);
                if (gVarG == null) {
                    C3043d0.l("CapabilitiesByQuality", "EncoderProfiles of quality " + c1230l + " has no video validated profiles.");
                } else {
                    InterfaceC0336k0.c cVarK = gVarG.k();
                    this.f6329b.put(new Size(cVarK.k(), cVarK.h()), c1230l);
                    this.f6328a.put(c1230l, gVarG);
                }
            }
        }
        if (this.f6328a.isEmpty()) {
            C3043d0.c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f6331d = null;
            this.f6330c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f6328a.values());
            this.f6330c = (U.g) arrayDeque.peekFirst();
            this.f6331d = (U.g) arrayDeque.peekLast();
        }
    }

    private static void a(C1230l c1230l) {
        x0.g.b(C1230l.a(c1230l), "Unknown quality: " + c1230l);
    }

    private InterfaceC0336k0 d(C1230l c1230l, InterfaceC0334j0 interfaceC0334j0) {
        x0.g.j(c1230l instanceof C1230l.b, "Currently only support ConstantQuality");
        return interfaceC0334j0.b(((C1230l.b) c1230l).e());
    }

    private U.g g(InterfaceC0336k0 interfaceC0336k0) {
        if (interfaceC0336k0.d().isEmpty()) {
            return null;
        }
        return U.g.i(interfaceC0336k0);
    }

    public U.g b(Size size) {
        C1230l c1230lC = c(size);
        C3043d0.a("CapabilitiesByQuality", "Using supported quality of " + c1230lC + " for size " + size);
        if (c1230lC == C1230l.f6342g) {
            return null;
        }
        U.g gVarE = e(c1230lC);
        if (gVarE != null) {
            return gVarE;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public C1230l c(Size size) {
        C1230l c1230l = (C1230l) L.d.a(size, this.f6329b);
        return c1230l != null ? c1230l : C1230l.f6342g;
    }

    public U.g e(C1230l c1230l) {
        a(c1230l);
        return c1230l == C1230l.f6341f ? this.f6330c : c1230l == C1230l.f6340e ? this.f6331d : this.f6328a.get(c1230l);
    }

    public List<C1230l> f() {
        return new ArrayList(this.f6328a.keySet());
    }
}
