package s;

import C.AbstractC0315a;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import j0.tkB.pkcpMQSgx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import u.C2923d;
import u.C2926g;
import w7.Jld.EZYiRMRTxKdo;
import z.C3043d0;
import z.C3070z;

final class C2818i1 {

    private final t.B f23374a;

    private final C2926g f23375b;

    private final boolean f23376c;

    static final class a {
        static C3070z a(t.B b2) {
            Long l7 = (Long) b2.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l7 != null) {
                return C2923d.b(l7.longValue());
            }
            return null;
        }
    }

    C2818i1(t.B b2) {
        this.f23374a = b2;
        this.f23375b = C2926g.a(b2);
        int[] iArr = (int[]) b2.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z7 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (iArr[i7] == 18) {
                    z7 = true;
                    break;
                }
                i7++;
            }
        }
        this.f23376c = z7;
    }

    private static boolean a(C3070z c3070z, C3070z c3070z2) {
        x0.g.j(c3070z2.e(), "Fully specified range is not actually fully specified.");
        if (c3070z.b() == 2 && c3070z2.b() == 1) {
            return false;
        }
        if (c3070z.b() == 2 || c3070z.b() == 0 || c3070z.b() == c3070z2.b()) {
            return c3070z.a() == 0 || c3070z.a() == c3070z2.a();
        }
        return false;
    }

    private static boolean b(C3070z c3070z, C3070z c3070z2, Set<C3070z> set) {
        if (set.contains(c3070z2)) {
            return a(c3070z, c3070z2);
        }
        C3043d0.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", c3070z, c3070z2));
        return false;
    }

    private static C3070z c(C3070z c3070z, Collection<C3070z> collection, Set<C3070z> set) {
        if (c3070z.b() == 1) {
            return null;
        }
        for (C3070z c3070z2 : collection) {
            x0.g.h(c3070z2, "Fully specified DynamicRange cannot be null.");
            int iB = c3070z2.b();
            x0.g.j(c3070z2.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (iB != 1 && b(c3070z, c3070z2, set)) {
                return c3070z2;
            }
        }
        return null;
    }

    private static boolean e(C3070z c3070z) {
        return Objects.equals(c3070z, C3070z.f24772c);
    }

    private static boolean f(C3070z c3070z) {
        return c3070z.b() == 2 || (c3070z.b() != 0 && c3070z.a() == 0) || (c3070z.b() == 0 && c3070z.a() != 0);
    }

    private C3070z h(C3070z c3070z, Set<C3070z> set, Set<C3070z> set2, Set<C3070z> set3, String str) {
        C3070z c3070zA;
        if (c3070z.e()) {
            if (set.contains(c3070z)) {
                return c3070z;
            }
            return null;
        }
        int iB = c3070z.b();
        int iA = c3070z.a();
        if (iB == 1 && iA == 0) {
            C3070z c3070z2 = C3070z.f24773d;
            if (set.contains(c3070z2)) {
                return c3070z2;
            }
            return null;
        }
        C3070z c3070zC = c(c3070z, set2, set);
        if (c3070zC != null) {
            C3043d0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, c3070z, c3070zC));
            return c3070zC;
        }
        C3070z c3070zC2 = c(c3070z, set3, set);
        if (c3070zC2 != null) {
            C3043d0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, c3070z, c3070zC2));
            return c3070zC2;
        }
        C3070z c3070z3 = C3070z.f24773d;
        if (b(c3070z, c3070z3, set)) {
            C3043d0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, c3070z, c3070z3));
            return c3070z3;
        }
        if (iB == 2 && (iA == 10 || iA == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                c3070zA = a.a(this.f23374a);
                if (c3070zA != null) {
                    linkedHashSet.add(c3070zA);
                }
            } else {
                c3070zA = null;
            }
            linkedHashSet.add(C3070z.f24775f);
            C3070z c3070zC3 = c(c3070z, linkedHashSet, set);
            if (c3070zC3 != null) {
                C3043d0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, c3070zC3.equals(c3070zA) ? "recommended" : "required", c3070z, c3070zC3));
                return c3070zC3;
            }
        }
        for (C3070z c3070z4 : set) {
            x0.g.j(c3070z4.e(), "Candidate dynamic range must be fully specified.");
            if (!c3070z4.equals(C3070z.f24773d) && a(c3070z, c3070z4)) {
                C3043d0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, c3070z, c3070z4));
                return c3070z4;
            }
        }
        return null;
    }

    private C3070z i(Set<C3070z> set, Set<C3070z> set2, Set<C3070z> set3, C.o1<?> o1Var, Set<C3070z> set4) {
        C3070z c3070zO = o1Var.o();
        C3070z c3070zH = h(c3070zO, set4, set2, set3, o1Var.I());
        if (c3070zH != null) {
            j(set4, c3070zH, this.f23375b);
            return c3070zH;
        }
        String strI = o1Var.I();
        String str = pkcpMQSgx.ARWLptPLihRncPZ;
        throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", strI, c3070zO, TextUtils.join(str, set), TextUtils.join(str, set4)));
    }

    private static void j(Set<C3070z> set, C3070z c3070z, C2926g c2926g) {
        x0.g.j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<C3070z> setB = c2926g.b(c3070z);
        if (setB.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(setB);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format(EZYiRMRTxKdo.mPJgS, c3070z, TextUtils.join("\n  ", setB), TextUtils.join("\n  ", hashSet)));
        }
    }

    boolean d() {
        return this.f23376c;
    }

    Map<C.o1<?>, C3070z> g(List<AbstractC0315a> list, List<C.o1<?>> list2, List<Integer> list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<AbstractC0315a> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().c());
        }
        Set<C3070z> setC = this.f23375b.c();
        HashSet hashSet = new HashSet(setC);
        Iterator<C3070z> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j(hashSet, it2.next(), this.f23375b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it3 = list3.iterator();
        while (it3.hasNext()) {
            C.o1<?> o1Var = list2.get(it3.next().intValue());
            C3070z c3070zO = o1Var.o();
            if (e(c3070zO)) {
                arrayList3.add(o1Var);
            } else if (f(c3070zO)) {
                arrayList2.add(o1Var);
            } else {
                arrayList.add(o1Var);
            }
        }
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<C.o1<?>> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (C.o1<?> o1Var2 : arrayList4) {
            C3070z c3070zI = i(setC, linkedHashSet, linkedHashSet2, o1Var2, hashSet);
            map.put(o1Var2, c3070zI);
            if (!linkedHashSet.contains(c3070zI)) {
                linkedHashSet2.add(c3070zI);
            }
        }
        return map;
    }
}
