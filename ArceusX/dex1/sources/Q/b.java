package Q;

import C.D0;
import C.I;
import C.InterfaceC0351s0;
import C.J;
import C.o1;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import z.C3043d0;

public class b {

    private static final double f3728h = Math.sqrt(2.3703703703703702d);

    private final Size f3729a;

    private final Rational f3730b;

    private final Rational f3731c;

    private final Set<o1<?>> f3732d;

    private final H.k f3733e;

    private final I f3734f;

    private final Map<o1<?>, List<Size>> f3735g;

    private static class a implements Comparator<Rational> {

        private final Rational f3736d;

        private final boolean f3737e;

        a(Rational rational, boolean z7) {
            this.f3736d = rational;
            this.f3737e = z7;
        }

        @Override
        public int compare(Rational rational, Rational rational2) {
            float fC = b.c(rational, this.f3736d);
            float fC2 = b.c(rational2, this.f3736d);
            return this.f3737e ? Float.compare(fC2, fC) : Float.compare(fC, fC2);
        }
    }

    b(J j7, Set<o1<?>> set) {
        this(E.q.m(j7.h().h()), j7.q(), set);
    }

    private static boolean A(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (!y(it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    private boolean B(Rational rational, Size size) {
        if (this.f3730b.equals(rational) || E.a.a(size, rational)) {
            return false;
        }
        return b(this.f3730b.floatValue(), rational.floatValue(), N(size).floatValue());
    }

    private boolean C(Size size, Size size2) {
        return B(N(size), size2);
    }

    private boolean D() {
        Iterator<Size> it = l().iterator();
        while (it.hasNext()) {
            if (!E.a.a(it.next(), this.f3731c)) {
                return true;
            }
        }
        return false;
    }

    private static List<Size> E(List<Size> list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    static Rect F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    private List<Size> G(List<Size> list, boolean z7) {
        Map<Rational, List<Size>> mapX = x(list);
        ArrayList arrayList = new ArrayList(mapX.keySet());
        K(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(E.a.f1001c) && !rational.equals(E.a.f999a)) {
                List<Size> list2 = mapX.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(I(rational, list2, z7));
            }
        }
        return arrayList2;
    }

    private List<Size> H(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.addAll(I(this.f3730b, list, false));
        }
        arrayList.addAll(I(this.f3731c, list, false));
        arrayList.addAll(G(list, false));
        if (arrayList.isEmpty()) {
            C3043d0.l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(G(list, true));
        }
        C3043d0.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    private List<Size> I(Rational rational, List<Size> list, boolean z7) {
        List<Size> listG = g(rational, list);
        L(listG);
        HashSet hashSet = new HashSet(listG);
        Iterator<o1<?>> it = this.f3732d.iterator();
        while (it.hasNext()) {
            List<Size> listV = v(it.next());
            if (!z7) {
                listV = d(rational, listV);
            }
            if (listV.isEmpty()) {
                return new ArrayList();
            }
            listG = f(listV, listG);
            hashSet.retainAll(p(listV, listG));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listG) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private boolean J() {
        boolean z7;
        P.c cVarU;
        Iterator<o1<?>> it = this.f3732d.iterator();
        while (true) {
            z7 = false;
            if (!it.hasNext()) {
                break;
            }
            o1<?> next = it.next();
            if (!next.R(false) && (next instanceof InterfaceC0351s0) && (cVarU = ((InterfaceC0351s0) next).U(null)) != null) {
                z7 = true;
                if (cVarU.a() == 1) {
                    break;
                }
            }
        }
        return z7;
    }

    private void K(List<Rational> list) {
        Collections.sort(list, new a(M(this.f3729a), true));
    }

    static void L(List<Size> list) {
        Collections.sort(list, new E.d(true));
    }

    private static Rational M(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private static Rational N(Size size) {
        Rational rational = E.a.f999a;
        if (E.a.a(size, rational)) {
            return rational;
        }
        Rational rational2 = E.a.f1001c;
        return E.a.a(size, rational2) ? rational2 : M(size);
    }

    private boolean b(float f7, float f8, float f9) {
        if (f7 == f8 || f8 == f9) {
            return false;
        }
        return f7 > f8 ? f8 < f9 : f8 > f9;
    }

    public static float c(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    private List<Size> d(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (!B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static List<Size> e(List<Size> list) {
        Rational rationalM;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rationalM = null;
                    break;
                }
                rationalM = (Rational) it.next();
                if (E.a.a(size, rationalM)) {
                    break;
                }
            }
            if (rationalM != null) {
                Size size2 = (Size) map.get(rationalM);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalM = M(size);
            }
            arrayList.add(size);
            map.put(rationalM, size);
        }
        return arrayList;
    }

    static List<Size> f(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (A(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    static List<Size> g(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (E.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static Rational h(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f3728h ? E.a.f1001c : E.a.f999a;
    }

    private List<Size> i() {
        return this.f3734f.k(34);
    }

    private List<Size> j() {
        return this.f3734f.p(34);
    }

    private static Rect k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalM = M(size);
        if (rational.floatValue() == rationalM.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rationalM.floatValue()) {
                float f7 = width;
                float fFloatValue = f7 / rational.floatValue();
                float f8 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f8, f7, fFloatValue + f8);
            } else {
                float f9 = height;
                float fFloatValue2 = rational.floatValue() * f9;
                float f10 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f10, 0.0f, fFloatValue2 + f10, f9);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    private Set<Size> l() {
        HashSet hashSet = new HashSet();
        Iterator<o1<?>> it = this.f3732d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(v(it.next()));
        }
        return hashSet;
    }

    static Rect m(Size size, Size size2) {
        return k(M(size2), size);
    }

    private static Rational n(Rational rational) {
        Rational rational2 = E.a.f999a;
        if (rational.equals(rational2)) {
            return E.a.f1001c;
        }
        if (rational.equals(E.a.f1001c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    static List<Size> p(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> listE = E(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : listE) {
            if (z(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    private Pair<Rect, Size> t(Rect rect, o1<?> o1Var, boolean z7) {
        Size sizeQ;
        if (z7) {
            sizeQ = r(E.q.m(rect), o1Var);
        } else {
            Size sizeM = E.q.m(rect);
            sizeQ = q(sizeM, o1Var);
            rect = m(sizeM, sizeQ);
        }
        return new Pair<>(rect, sizeQ);
    }

    private static Rational u(Size size) {
        Rational rationalH = h(size);
        C3043d0.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + rationalH + ".");
        return rationalH;
    }

    private List<Size> v(o1<?> o1Var) {
        if (!this.f3732d.contains(o1Var)) {
            throw new IllegalArgumentException("Invalid child config: " + o1Var);
        }
        if (this.f3735g.containsKey(o1Var)) {
            List<Size> list = this.f3735g.get(o1Var);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listE = e(this.f3733e.m(o1Var));
        this.f3735g.put(o1Var, listE);
        return listE;
    }

    private static List<Size> w(List<Pair<Integer, Size[]>> list) {
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    private Map<Rational, List<Size>> x(List<Size> list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = E.a.f999a;
        map.put(rational, new ArrayList());
        Rational rational2 = E.a.f1001c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        for (Size size : list) {
            if (size.getHeight() > 0) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it.next();
                    if (E.a.a(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalM = M(size);
                    arrayList2.add(rationalM);
                    map.put(rationalM, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    static boolean y(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private static boolean z(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (y(it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    List<Size> o(D0 d02) {
        List<Size> listJ = j();
        if (J()) {
            ArrayList arrayList = new ArrayList(listJ);
            arrayList.addAll(i());
            listJ = arrayList;
        }
        List list = (List) d02.a(InterfaceC0351s0.f723q, null);
        if (list != null) {
            listJ = w(list);
        }
        return H(listJ);
    }

    Size q(Size size, o1<?> o1Var) {
        List<Size> listV = v(o1Var);
        for (Size size2 : listV) {
            if (!C(size, size2) && !y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : listV) {
            if (!y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    Size r(Size size, o1<?> o1Var) {
        Iterator<Size> it = v(o1Var).iterator();
        while (it.hasNext()) {
            Size sizeM = E.q.m(m(it.next(), size));
            if (!y(sizeM, size)) {
                return sizeM;
            }
        }
        return size;
    }

    Pair<Rect, Size> s(o1<?> o1Var, Rect rect, int i7, boolean z7) {
        boolean z8;
        if (E.q.i(i7)) {
            rect = F(rect);
            z8 = true;
        } else {
            z8 = false;
        }
        Pair<Rect, Size> pairT = t(rect, o1Var, z7);
        Rect rectF = (Rect) pairT.first;
        Size sizeO = (Size) pairT.second;
        if (z8) {
            sizeO = E.q.o(sizeO);
            rectF = F(rectF);
        }
        return new Pair<>(rectF, sizeO);
    }

    private b(Size size, I i7, Set<o1<?>> set) {
        this(size, i7, set, new H.k(i7, size));
    }

    b(Size size, I i7, Set<o1<?>> set, H.k kVar) {
        this.f3735g = new HashMap();
        this.f3729a = size;
        Rational rationalU = u(size);
        this.f3730b = rationalU;
        this.f3731c = n(rationalU);
        this.f3734f = i7;
        this.f3732d = set;
        this.f3733e = kVar;
    }
}
