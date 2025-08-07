package S;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class C1232n {

    private static final Map<C1230l, Range<Integer>> f6346b;

    private static final Map<Integer, Rational> f6347c;

    private final Map<a, List<Size>> f6348a = new HashMap();

    static abstract class a {
        a() {
        }

        static a c(C1230l c1230l, int i7) {
            return new C1223e(c1230l, i7);
        }

        abstract int a();

        abstract C1230l b();
    }

    static {
        HashMap map = new HashMap();
        f6346b = map;
        map.put(C1230l.f6339d, Range.create(2160, 4319));
        map.put(C1230l.f6338c, Range.create(1080, 1439));
        map.put(C1230l.f6337b, Range.create(720, 1079));
        map.put(C1230l.f6336a, Range.create(241, 719));
        HashMap map2 = new HashMap();
        f6347c = map2;
        map2.put(0, E.a.f999a);
        map2.put(1, E.a.f1001c);
    }

    C1232n(List<Size> list, Map<C1230l, Size> map) {
        for (C1230l c1230l : f6346b.keySet()) {
            this.f6348a.put(a.c(c1230l, -1), new ArrayList());
            Iterator<Integer> it = f6347c.keySet().iterator();
            while (it.hasNext()) {
                this.f6348a.put(a.c(c1230l, it.next().intValue()), new ArrayList());
            }
        }
        b(map);
        c(list);
        i(map);
    }

    private void b(Map<C1230l, Size> map) {
        for (Map.Entry<C1230l, Size> entry : map.entrySet()) {
            List<Size> listF = f(entry.getKey(), -1);
            Objects.requireNonNull(listF);
            listF.add(entry.getValue());
        }
    }

    private void c(List<Size> list) {
        Integer numD;
        for (Size size : list) {
            C1230l c1230lE = e(size);
            if (c1230lE != null && (numD = d(size)) != null) {
                List<Size> listF = f(c1230lE, numD.intValue());
                Objects.requireNonNull(listF);
                listF.add(size);
            }
        }
    }

    private static Integer d(Size size) {
        for (Map.Entry<Integer, Rational> entry : f6347c.entrySet()) {
            if (E.a.b(size, entry.getValue(), L.d.f1938b)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static C1230l e(Size size) {
        for (Map.Entry<C1230l, Range<Integer>> entry : f6346b.entrySet()) {
            if (entry.getValue().contains((Range<Integer>) Integer.valueOf(size.getHeight()))) {
                return entry.getKey();
            }
        }
        return null;
    }

    private List<Size> f(C1230l c1230l, int i7) {
        return this.f6348a.get(a.c(c1230l, i7));
    }

    public static int h(int i7, Size size, Size size2) {
        return Math.abs(L.d.c(size) - i7) - Math.abs(L.d.c(size2) - i7);
    }

    private void i(Map<C1230l, Size> map) {
        for (Map.Entry<a, List<Size>> entry : this.f6348a.entrySet()) {
            Size size = map.get(entry.getKey().b());
            if (size != null) {
                final int iC = L.d.c(size);
                Collections.sort(entry.getValue(), new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return C1232n.h(iC, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }

    List<Size> g(C1230l c1230l, int i7) {
        List<Size> listF = f(c1230l, i7);
        return listF != null ? new ArrayList(listF) : new ArrayList(0);
    }
}
