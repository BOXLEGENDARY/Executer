package H;

import C.I;
import C.InterfaceC0351s0;
import C.o1;
import E.a;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class l {

    private final int f1519a;

    private final int f1520b;

    private final Rational f1521c;

    private final boolean f1522d;

    l(I i7, Rational rational) {
        this.f1519a = i7.a();
        this.f1520b = i7.h();
        this.f1521c = rational;
        boolean z7 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z7 = false;
        }
        this.f1522d = z7;
    }

    private static Size a(Size size, int i7, int i8, int i9) {
        return (size == null || !e(i7, i8, i9)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private static Rational b(Size size, List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : k.k(list)) {
            if (E.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational c(InterfaceC0351s0 interfaceC0351s0, List<Size> list) {
        if (interfaceC0351s0.J()) {
            return k.n(interfaceC0351s0.L(), this.f1522d);
        }
        Size sizeD = d(interfaceC0351s0);
        if (sizeD != null) {
            return b(sizeD, list);
        }
        return null;
    }

    private Size d(InterfaceC0351s0 interfaceC0351s0) {
        return a(interfaceC0351s0.B(null), interfaceC0351s0.W(0), this.f1520b, this.f1519a);
    }

    private static boolean e(int i7, int i8, int i9) {
        int iA = E.c.a(E.c.b(i7), i9, 1 == i8);
        return iA == 90 || iA == 270;
    }

    List<Size> f(List<Size> list, o1<?> o1Var) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new E.d(true));
        ArrayList arrayList2 = new ArrayList();
        InterfaceC0351s0 interfaceC0351s0 = (InterfaceC0351s0) o1Var;
        Size sizeJ = interfaceC0351s0.j(null);
        Size size = (Size) arrayList.get(0);
        if (sizeJ == null || L.d.c(size) < L.d.c(sizeJ)) {
            sizeJ = size;
        }
        Size sizeD = d(interfaceC0351s0);
        Size size2 = L.d.f1939c;
        int iC = L.d.c(size2);
        if (L.d.c(sizeJ) < iC) {
            size2 = L.d.f1937a;
        } else if (sizeD != null && L.d.c(sizeD) < iC) {
            size2 = sizeD;
        }
        for (Size size3 : arrayList) {
            if (L.d.c(size3) <= L.d.c(sizeJ) && L.d.c(size3) >= L.d.c(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeJ + "\ninitial size list: " + arrayList);
        }
        Rational rationalC = c(interfaceC0351s0, arrayList2);
        if (sizeD == null) {
            sizeD = interfaceC0351s0.v(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (rationalC == null) {
            arrayList3.addAll(arrayList2);
            if (sizeD != null) {
                k.q(arrayList3, sizeD, true);
            }
        } else {
            Map<Rational, List<Size>> mapO = k.o(arrayList2);
            if (sizeD != null) {
                Iterator<Rational> it = mapO.keySet().iterator();
                while (it.hasNext()) {
                    k.q(mapO.get(it.next()), sizeD, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(mapO.keySet());
            Collections.sort(arrayList4, new a.C0009a(rationalC, this.f1521c));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                for (Size size4 : mapO.get((Rational) it2.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
