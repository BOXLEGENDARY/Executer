package H;

import C.I;
import C.InterfaceC0351s0;
import C.o1;
import E.a;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t2.Dbl.hgESaf;
import z.C3043d0;

public class k {

    private final I f1514a;

    private final int f1515b;

    private final int f1516c;

    private final Rational f1517d;

    private final l f1518e;

    public k(I i7, Size size) {
        this.f1514a = i7;
        this.f1515b = i7.a();
        this.f1516c = i7.h();
        Rational rationalH = size != null ? h(size) : i(i7);
        this.f1517d = rationalH;
        this.f1518e = new l(i7, rationalH);
    }

    private static LinkedHashMap<Rational, List<Size>> a(List<Size> list, P.a aVar, Rational rational) {
        return b(o(list), aVar, rational);
    }

    private static LinkedHashMap<Rational, List<Size>> b(Map<Rational, List<Size>> map, P.a aVar, Rational rational) {
        boolean z7 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z7 = false;
        }
        Rational rationalN = n(aVar.b(), z7);
        if (aVar.a() == 0) {
            Rational rationalN2 = n(aVar.b(), z7);
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Rational rational2 = (Rational) it.next();
                if (!rational2.equals(rationalN2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new a.C0009a(rationalN, rational));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    private List<Size> c(List<Size> list, P.c cVar, int i7) {
        if (cVar.a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f1514a.k(i7));
        Collections.sort(arrayList, new E.d(true));
        return arrayList;
    }

    private static void d(LinkedHashMap<Rational, List<Size>> linkedHashMap, Size size) {
        int iC = L.d.c(size);
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = linkedHashMap.get(it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (L.d.c(size2) <= iC) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    private static List<Size> e(List<Size> list, P.b bVar, int i7, int i8, int i9) {
        if (bVar == null) {
            return list;
        }
        List<Size> listA = bVar.a(new ArrayList(list), E.c.a(E.c.b(i7), i8, i9 == 1));
        if (list.containsAll(listA)) {
            return listA;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void f(LinkedHashMap<Rational, List<Size>> linkedHashMap, P.d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            g(linkedHashMap.get(it.next()), dVar);
        }
    }

    private static void g(List<Size> list, P.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        int iB = dVar.b();
        if (dVar.equals(P.d.f3719c)) {
            return;
        }
        Size sizeA = dVar.a();
        if (iB == 0) {
            s(list, sizeA);
            return;
        }
        if (iB == 1) {
            q(list, sizeA, true);
            return;
        }
        if (iB == 2) {
            q(list, sizeA, false);
        } else if (iB == 3) {
            r(list, sizeA, true);
        } else {
            if (iB != 4) {
                return;
            }
            r(list, sizeA, false);
        }
    }

    private Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational i(I i7) {
        List<Size> listP = i7.p(256);
        if (listP.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(listP, new E.d());
        return new Rational(size.getWidth(), size.getHeight());
    }

    private List<Size> j(List<Pair<Integer, Size[]>> list, int i7) {
        List<Size> listL = l(list, i7);
        if (listL == null) {
            listL = this.f1514a.p(i7);
        }
        ArrayList arrayList = new ArrayList(listL);
        Collections.sort(arrayList, new E.d(true));
        if (arrayList.isEmpty()) {
            C3043d0.l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i7 + ".");
        }
        return arrayList;
    }

    static List<Rational> k(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(E.a.f999a);
        arrayList.add(E.a.f1001c);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                    if (E.a.a(size, (Rational) it.next())) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Size> l(List<Pair<Integer, Size[]>> list, int i7) {
        Size[] sizeArr;
        if (list != null) {
            for (Pair<Integer, Size[]> pair : list) {
                if (((Integer) pair.first).intValue() == i7) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    static Rational n(int i7, boolean z7) {
        if (i7 != -1) {
            if (i7 == 0) {
                return z7 ? E.a.f999a : E.a.f1000b;
            }
            if (i7 == 1) {
                return z7 ? E.a.f1001c : E.a.f1002d;
            }
            C3043d0.c("SupportedOutputSizesCollector", hgESaf.MrZErJEG + i7);
        }
        return null;
    }

    static Map<Rational, List<Size>> o(List<Size> list) {
        HashMap map = new HashMap();
        Iterator<Rational> it = k(list).iterator();
        while (it.hasNext()) {
            map.put(it.next(), new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational : map.keySet()) {
                if (E.a.a(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static List<Size> p(P.c cVar, List<Size> list, Size size, int i7, Rational rational, int i8, int i9) {
        LinkedHashMap<Rational, List<Size>> linkedHashMapA = a(list, cVar.b(), rational);
        if (size != null) {
            d(linkedHashMapA, size);
        }
        f(linkedHashMapA, cVar.d());
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMapA.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return e(arrayList, cVar.c(), i7, i8, i9);
    }

    static void q(List<Size> list, Size size, boolean z7) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z7) {
            list.addAll(arrayList);
        }
    }

    private static void r(List<Size> list, Size size, boolean z7) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            Size size2 = list.get(i7);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z7) {
            list.addAll(arrayList);
        }
    }

    private static void s(List<Size> list, Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }

    public List<Size> m(o1<?> o1Var) {
        InterfaceC0351s0 interfaceC0351s0 = (InterfaceC0351s0) o1Var;
        List<Size> listS = interfaceC0351s0.s(null);
        if (listS != null) {
            return listS;
        }
        P.c cVarU = interfaceC0351s0.U(null);
        List<Size> listJ = j(interfaceC0351s0.p(null), o1Var.t());
        if (cVarU == null) {
            return this.f1518e.f(listJ, o1Var);
        }
        Size sizeJ = ((InterfaceC0351s0) o1Var).j(null);
        int iW = interfaceC0351s0.W(0);
        if (!o1Var.R(false)) {
            listJ = c(listJ, cVarU, o1Var.t());
        }
        return p(interfaceC0351s0.q(), listJ, sizeJ, iW, this.f1517d, this.f1515b, this.f1516c);
    }
}
