package U;

import C.InterfaceC0334j0;
import C.InterfaceC0336k0;
import S.C1227i;
import S.C1230l;
import X.i0;
import X.k0;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import n.InterfaceC2621a;
import z.C3070z;

public class f implements InterfaceC0334j0 {

    private final InterfaceC0334j0 f7488c;

    private final Set<C1230l> f7489d;

    private final Set<Size> f7490e;

    private final Set<C3070z> f7491f;

    private final InterfaceC2621a<i0, k0> f7492g;

    private final Map<Integer, InterfaceC0336k0> f7493h = new HashMap();

    private final Map<C3070z, C1227i> f7494i = new HashMap();

    public f(InterfaceC0334j0 interfaceC0334j0, Collection<C1230l> collection, Collection<C3070z> collection2, Collection<Size> collection3, InterfaceC2621a<i0, k0> interfaceC2621a) {
        c(collection2);
        this.f7488c = interfaceC0334j0;
        this.f7489d = new HashSet(collection);
        this.f7491f = new HashSet(collection2);
        this.f7490e = new HashSet(collection3);
        this.f7492g = interfaceC2621a;
    }

    private static void c(Collection<C3070z> collection) {
        for (C3070z c3070z : collection) {
            if (!c3070z.e()) {
                throw new IllegalArgumentException("Contains non-fully specified DynamicRange: " + c3070z);
            }
        }
    }

    private InterfaceC0336k0 d(C1230l.b bVar) {
        g gVarB;
        x0.g.a(this.f7489d.contains(bVar));
        InterfaceC0336k0 interfaceC0336k0B = this.f7488c.b(bVar.e());
        for (Size size : bVar.d()) {
            if (this.f7490e.contains(size)) {
                TreeMap treeMap = new TreeMap(new E.d());
                ArrayList arrayList = new ArrayList();
                for (C3070z c3070z : this.f7491f) {
                    if (!i(interfaceC0336k0B, c3070z) && (gVarB = f(c3070z).b(size)) != null) {
                        InterfaceC0336k0.c cVarK = gVarB.k();
                        k0 k0VarApply = this.f7492g.apply(W.c.f(cVarK));
                        if (k0VarApply != null && k0VarApply.a(size.getWidth(), size.getHeight())) {
                            treeMap.put(new Size(cVarK.k(), cVarK.h()), gVarB);
                            arrayList.add(Y.c.a(cVarK, size, k0VarApply.c()));
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    InterfaceC0336k0 interfaceC0336k0 = (InterfaceC0336k0) L.d.a(size, treeMap);
                    Objects.requireNonNull(interfaceC0336k0);
                    InterfaceC0336k0 interfaceC0336k02 = interfaceC0336k0;
                    return InterfaceC0336k0.b.h(interfaceC0336k02.a(), interfaceC0336k02.b(), interfaceC0336k02.c(), arrayList);
                }
            }
        }
        return null;
    }

    private C1230l.b e(int i7) {
        Iterator<C1230l> it = this.f7489d.iterator();
        while (it.hasNext()) {
            C1230l.b bVar = (C1230l.b) it.next();
            if (bVar.e() == i7) {
                return bVar;
            }
        }
        return null;
    }

    private C1227i f(C3070z c3070z) {
        if (this.f7494i.containsKey(c3070z)) {
            C1227i c1227i = this.f7494i.get(c3070z);
            Objects.requireNonNull(c1227i);
            return c1227i;
        }
        C1227i c1227i2 = new C1227i(new e(this.f7488c, c3070z));
        this.f7494i.put(c3070z, c1227i2);
        return c1227i2;
    }

    private InterfaceC0336k0 g(int i7) {
        if (this.f7493h.containsKey(Integer.valueOf(i7))) {
            return this.f7493h.get(Integer.valueOf(i7));
        }
        InterfaceC0336k0 interfaceC0336k0B = this.f7488c.b(i7);
        C1230l.b bVarE = e(i7);
        if (bVarE != null && !h(interfaceC0336k0B)) {
            interfaceC0336k0B = j(interfaceC0336k0B, d(bVarE));
        }
        this.f7493h.put(Integer.valueOf(i7), interfaceC0336k0B);
        return interfaceC0336k0B;
    }

    private boolean h(InterfaceC0336k0 interfaceC0336k0) {
        if (interfaceC0336k0 == null) {
            return false;
        }
        Iterator<C3070z> it = this.f7491f.iterator();
        while (it.hasNext()) {
            if (!i(interfaceC0336k0, it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean i(InterfaceC0336k0 interfaceC0336k0, C3070z c3070z) {
        if (interfaceC0336k0 == null) {
            return false;
        }
        Iterator<InterfaceC0336k0.c> it = interfaceC0336k0.d().iterator();
        while (it.hasNext()) {
            if (Y.b.f(it.next(), c3070z)) {
                return true;
            }
        }
        return false;
    }

    private static InterfaceC0336k0 j(InterfaceC0336k0 interfaceC0336k0, InterfaceC0336k0 interfaceC0336k02) {
        if (interfaceC0336k0 == null && interfaceC0336k02 == null) {
            return null;
        }
        int iA = interfaceC0336k0 != null ? interfaceC0336k0.a() : interfaceC0336k02.a();
        int iB = interfaceC0336k0 != null ? interfaceC0336k0.b() : interfaceC0336k02.b();
        List<InterfaceC0336k0.a> listC = interfaceC0336k0 != null ? interfaceC0336k0.c() : interfaceC0336k02.c();
        ArrayList arrayList = new ArrayList();
        if (interfaceC0336k0 != null) {
            arrayList.addAll(interfaceC0336k0.d());
        }
        if (interfaceC0336k02 != null) {
            arrayList.addAll(interfaceC0336k02.d());
        }
        return InterfaceC0336k0.b.h(iA, iB, listC, arrayList);
    }

    @Override
    public boolean a(int i7) {
        return g(i7) != null;
    }

    @Override
    public InterfaceC0336k0 b(int i7) {
        return g(i7);
    }
}
