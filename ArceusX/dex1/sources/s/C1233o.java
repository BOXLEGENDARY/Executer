package S;

import C.InterfaceC0336k0;
import S.C1228j;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import z.C3043d0;
import z.C3070z;

public final class C1233o {

    private final List<C1230l> f6349a;

    private final C1228j f6350b;

    C1233o(List<C1230l> list, C1228j c1228j) {
        x0.g.b((list.isEmpty() && c1228j == C1228j.f6335a) ? false : true, "No preferred quality and fallback strategy.");
        this.f6349a = Collections.unmodifiableList(new ArrayList(list));
        this.f6350b = c1228j;
    }

    private void a(List<C1230l> list, Set<C1230l> set) {
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        C3043d0.a("QualitySelector", "Select quality by fallbackStrategy = " + this.f6350b);
        C1228j c1228j = this.f6350b;
        if (c1228j == C1228j.f6335a) {
            return;
        }
        x0.g.j(c1228j instanceof C1228j.b, "Currently only support type RuleStrategy");
        C1228j.b bVar = (C1228j.b) this.f6350b;
        List<C1230l> listB = C1230l.b();
        C1230l c1230lB = bVar.b() == C1230l.f6341f ? listB.get(0) : bVar.b() == C1230l.f6340e ? listB.get(listB.size() - 1) : bVar.b();
        int iIndexOf = listB.indexOf(c1230lB);
        x0.g.i(iIndexOf != -1);
        ArrayList arrayList = new ArrayList();
        for (int i7 = iIndexOf - 1; i7 >= 0; i7--) {
            C1230l c1230l = listB.get(i7);
            if (list.contains(c1230l)) {
                arrayList.add(c1230l);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = iIndexOf + 1; i8 < listB.size(); i8++) {
            C1230l c1230l2 = listB.get(i8);
            if (list.contains(c1230l2)) {
                arrayList2.add(c1230l2);
            }
        }
        C3043d0.a("QualitySelector", "sizeSortedQualities = " + listB + ", fallback quality = " + c1230lB + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int iC = bVar.c();
        if (iC != 0) {
            if (iC == 1) {
                set.addAll(arrayList);
                set.addAll(arrayList2);
                return;
            }
            if (iC == 2) {
                set.addAll(arrayList);
                return;
            }
            if (iC != 3) {
                if (iC == 4) {
                    set.addAll(arrayList2);
                    return;
                }
                throw new AssertionError("Unhandled fallback strategy: " + this.f6350b);
            }
            set.addAll(arrayList2);
            set.addAll(arrayList);
        }
    }

    private static void b(List<C1230l> list) {
        for (C1230l c1230l : list) {
            x0.g.b(C1230l.a(c1230l), "qualities contain invalid quality: " + c1230l);
        }
    }

    public static C1233o c(List<C1230l> list, C1228j c1228j) {
        x0.g.h(list, "qualities cannot be null");
        x0.g.h(c1228j, "fallbackStrategy cannot be null");
        x0.g.b(!list.isEmpty(), "qualities cannot be empty");
        b(list);
        return new C1233o(list, c1228j);
    }

    private static Size e(U.g gVar) {
        InterfaceC0336k0.c cVarK = gVar.k();
        return new Size(cVarK.k(), cVarK.h());
    }

    public static Map<C1230l, Size> f(I i7, C3070z c3070z) {
        HashMap map = new HashMap();
        for (C1230l c1230l : i7.b(c3070z)) {
            U.g gVarA = i7.a(c1230l, c3070z);
            Objects.requireNonNull(gVarA);
            map.put(c1230l, e(gVarA));
        }
        return map;
    }

    List<C1230l> d(List<C1230l> list) {
        if (list.isEmpty()) {
            C3043d0.l("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        C3043d0.a("QualitySelector", "supportedQualities = " + list);
        Set<C1230l> linkedHashSet = new LinkedHashSet<>();
        Iterator<C1230l> it = this.f6349a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1230l next = it.next();
            if (next == C1230l.f6341f) {
                linkedHashSet.addAll(list);
                break;
            }
            if (next == C1230l.f6340e) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(next)) {
                linkedHashSet.add(next);
            } else {
                C3043d0.l("QualitySelector", "quality is not supported and will be ignored: " + next);
            }
        }
        a(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f6349a + ", fallbackStrategy=" + this.f6350b + "}";
    }
}
