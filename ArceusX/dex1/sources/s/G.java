package S;

import C.C0332i0;
import C.InterfaceC0334j0;
import C.R0;
import X.k0;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n.InterfaceC2621a;
import z.C3070z;

public final class G implements I {

    private final InterfaceC0334j0 f6193b;

    private final boolean f6194c;

    private final Map<C3070z, C1227i> f6195d = new HashMap();

    private final Map<C3070z, C1227i> f6196e = new HashMap();

    G(int i7, C.I i8, InterfaceC2621a<X.i0, k0> interfaceC2621a) {
        x0.g.b(i7 == 0 || i7 == 1, "Not a supported video capabilities source: " + i7);
        InterfaceC0334j0 interfaceC0334j0N = i8.n();
        R0 r0C = androidx.camera.video.internal.compat.quirk.a.c();
        InterfaceC0334j0 aVar = new Z.a(interfaceC0334j0N, r0C, i8, interfaceC2621a);
        InterfaceC0334j0 bVar = new Z.b(i7 == 1 ? new U.f(aVar, C1230l.b(), Collections.singleton(C3070z.f24773d), i8.p(34), interfaceC2621a) : aVar, r0C);
        this.f6193b = new Z.c(h(i8) ? new U.b(bVar, interfaceC2621a) : bVar, i8, r0C);
        for (C3070z c3070z : i8.b()) {
            C1227i c1227i = new C1227i(new U.e(this.f6193b, c3070z));
            if (!c1227i.f().isEmpty()) {
                this.f6195d.put(c3070z, c1227i);
            }
        }
        this.f6194c = i8.c();
    }

    private C1227i e(C3070z c3070z) {
        if (C0332i0.c(c3070z, g())) {
            return new C1227i(new U.e(this.f6193b, c3070z));
        }
        return null;
    }

    private C1227i f(C3070z c3070z) {
        if (c3070z.e()) {
            return this.f6195d.get(c3070z);
        }
        if (this.f6196e.containsKey(c3070z)) {
            return this.f6196e.get(c3070z);
        }
        C1227i c1227iE = e(c3070z);
        this.f6196e.put(c3070z, c1227iE);
        return c1227iE;
    }

    private static boolean h(C.I i7) {
        for (C3070z c3070z : i7.b()) {
            Integer numValueOf = Integer.valueOf(c3070z.b());
            int iA = c3070z.a();
            if (numValueOf.equals(3) && iA == 10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public U.g a(C1230l c1230l, C3070z c3070z) {
        C1227i c1227iF = f(c3070z);
        if (c1227iF == null) {
            return null;
        }
        return c1227iF.e(c1230l);
    }

    @Override
    public List<C1230l> b(C3070z c3070z) {
        C1227i c1227iF = f(c3070z);
        return c1227iF == null ? new ArrayList() : c1227iF.f();
    }

    @Override
    public C1230l c(Size size, C3070z c3070z) {
        C1227i c1227iF = f(c3070z);
        return c1227iF == null ? C1230l.f6342g : c1227iF.c(size);
    }

    @Override
    public U.g d(Size size, C3070z c3070z) {
        C1227i c1227iF = f(c3070z);
        if (c1227iF == null) {
            return null;
        }
        return c1227iF.b(size);
    }

    public Set<C3070z> g() {
        return this.f6195d.keySet();
    }
}
