package s;

import C.AbstractC0315a;
import C.AbstractC0324e0;
import C.C0348q0;
import C.InterfaceC0349r0;
import C.X;
import C.p1;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r.C2739a;
import s.O1;
import z.C3043d0;

public final class M1 {

    public static final X.a<Long> f23108a = X.a.a("camera2.streamSpec.streamUseCase", Long.TYPE);

    private static final Map<Long, Set<p1.b>> f23109b;

    private static final Map<Long, Set<p1.b>> f23110c;

    static {
        HashMap map = new HashMap();
        f23109b = map;
        HashMap map2 = new HashMap();
        f23110c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            p1.b bVar = p1.b.PREVIEW;
            hashSet.add(bVar);
            p1.b bVar2 = p1.b.METERING_REPEATING;
            hashSet.add(bVar2);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(bVar2);
            hashSet2.add(p1.b.IMAGE_ANALYSIS);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            p1.b bVar3 = p1.b.IMAGE_CAPTURE;
            hashSet3.add(bVar3);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            p1.b bVar4 = p1.b.VIDEO_CAPTURE;
            hashSet4.add(bVar4);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bVar);
            hashSet5.add(bVar3);
            hashSet5.add(bVar4);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bVar);
            hashSet6.add(bVar4);
            map2.put(3L, hashSet6);
        }
    }

    public static boolean a(Map<Integer, AbstractC0315a> map, Map<Integer, C.o1<?>> map2, List<C.e1> list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            long jF = list.get(i7).f();
            if (map.containsKey(Integer.valueOf(i7))) {
                AbstractC0315a abstractC0315a = map.get(Integer.valueOf(i7));
                if (!g(abstractC0315a.b().size() == 1 ? abstractC0315a.b().get(0) : p1.b.STREAM_SHARING, jF, abstractC0315a.b())) {
                    return false;
                }
            } else {
                if (!map2.containsKey(Integer.valueOf(i7))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                C.o1<?> o1Var = map2.get(Integer.valueOf(i7));
                if (!g(o1Var.F(), jF, o1Var.F() == p1.b.STREAM_SHARING ? ((Q.j) o1Var).Z() : Collections.emptyList())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean b(Set<Long> set, Set<Long> set2) {
        Iterator<Long> it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(t.B b2, List<C.e1> list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) b2.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j7 : jArr) {
            hashSet.add(Long.valueOf(j7));
        }
        Iterator<C.e1> it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(it.next().f()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(List<AbstractC0315a> list, List<C.o1<?>> list2) {
        for (AbstractC0315a abstractC0315a : list) {
            if (j(abstractC0315a.e(), abstractC0315a.b().get(0))) {
                return true;
            }
        }
        for (C.o1<?> o1Var : list2) {
            if (j(o1Var, o1Var.F())) {
                return true;
            }
        }
        return false;
    }

    public static C2739a e(C.o1<?> o1Var) {
        C.E0 e0D0 = C.E0.d0();
        X.a<?> aVar = C2739a.f22722K;
        if (o1Var.b(aVar)) {
            e0D0.l(aVar, (Long) o1Var.f(aVar));
        }
        X.a<?> aVar2 = C.o1.f672z;
        if (o1Var.b(aVar2)) {
            e0D0.l(aVar2, (Boolean) o1Var.f(aVar2));
        }
        X.a<?> aVar3 = C0348q0.f689J;
        if (o1Var.b(aVar3)) {
            e0D0.l(aVar3, (Integer) o1Var.f(aVar3));
        }
        X.a<?> aVar4 = InterfaceC0349r0.f706h;
        if (o1Var.b(aVar4)) {
            e0D0.l(aVar4, (Integer) o1Var.f(aVar4));
        }
        return new C2739a(e0D0);
    }

    private static C.X f(C.X x7, long j7) {
        X.a<Long> aVar = f23108a;
        if (x7.b(aVar) && ((Long) x7.f(aVar)).longValue() == j7) {
            return null;
        }
        C.E0 e02 = C.E0.e0(x7);
        e02.l(aVar, Long.valueOf(j7));
        return new C2739a(e02);
    }

    private static boolean g(p1.b bVar, long j7, List<p1.b> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != p1.b.STREAM_SHARING) {
            Map<Long, Set<p1.b>> map = f23109b;
            return map.containsKey(Long.valueOf(j7)) && map.get(Long.valueOf(j7)).contains(bVar);
        }
        Map<Long, Set<p1.b>> map2 = f23110c;
        if (!map2.containsKey(Long.valueOf(j7))) {
            return false;
        }
        Set<p1.b> set = map2.get(Long.valueOf(j7));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator<p1.b> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(t.B b2) {
        long[] jArr;
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) b2.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    private static boolean i(List<AbstractC0315a> list, List<C.o1<?>> list2, Set<Long> set) {
        boolean z7;
        boolean z8;
        HashSet hashSet = new HashSet();
        Iterator<AbstractC0315a> it = list.iterator();
        if (it.hasNext()) {
            AbstractC0315a next = it.next();
            C.X xE = next.e();
            X.a<Long> aVar = C2739a.f22722K;
            if (xE.b(aVar) && ((Long) next.e().f(aVar)).longValue() != 0) {
                z7 = true;
                z8 = false;
            } else {
                z8 = true;
                z7 = false;
            }
        } else {
            z7 = false;
            z8 = false;
        }
        for (C.o1<?> o1Var : list2) {
            X.a<?> aVar2 = C2739a.f22722K;
            if (o1Var.b(aVar2)) {
                Long l7 = (Long) o1Var.f(aVar2);
                if (l7.longValue() != 0) {
                    if (z8) {
                        o();
                    }
                    hashSet.add(l7);
                    z7 = true;
                } else if (z7) {
                    o();
                }
            } else if (z7) {
                o();
            }
            z8 = true;
        }
        return !z8 && b(set, hashSet);
    }

    private static boolean j(C.X x7, p1.b bVar) {
        if (((Boolean) x7.a(C.o1.f672z, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        X.a<Integer> aVar = C0348q0.f689J;
        return x7.b(aVar) && b2.b(bVar, ((Integer) x7.f(aVar)).intValue()) == 5;
    }

    public static boolean k(t.B b2, List<AbstractC0315a> list, Map<C.o1<?>, C.c1> map, Map<AbstractC0315a, C.c1> map2) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<C.o1<?>> arrayList = new ArrayList(map.keySet());
        Iterator<AbstractC0315a> it = list.iterator();
        while (it.hasNext()) {
            x0.g.g(it.next().e());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            x0.g.g(((C.c1) x0.g.g(map.get((C.o1) it2.next()))).d());
        }
        long[] jArr = (long[]) b2.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j7 : jArr) {
                hashSet.add(Long.valueOf(j7));
            }
            if (i(list, arrayList, hashSet)) {
                for (AbstractC0315a abstractC0315a : list) {
                    C.X xE = abstractC0315a.e();
                    C.X xF = f(xE, ((Long) xE.f(C2739a.f22722K)).longValue());
                    if (xF != null) {
                        map2.put(abstractC0315a, abstractC0315a.i(xF));
                    }
                }
                for (C.o1<?> o1Var : arrayList) {
                    C.c1 c1Var = map.get(o1Var);
                    C.X xD = c1Var.d();
                    C.X xF2 = f(xD, ((Long) xD.f(C2739a.f22722K)).longValue());
                    if (xF2 != null) {
                        map.put(o1Var, c1Var.g().d(xF2).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void l(Map<C.o1<?>, C.c1> map, Map<AbstractC0315a, C.c1> map2, Map<Integer, AbstractC0315a> map3, Map<Integer, C.o1<?>> map4, List<C.e1> list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            long jF = list.get(i7).f();
            if (map3.containsKey(Integer.valueOf(i7))) {
                AbstractC0315a abstractC0315a = map3.get(Integer.valueOf(i7));
                C.X xF = f(abstractC0315a.e(), jF);
                if (xF != null) {
                    map2.put(abstractC0315a, abstractC0315a.i(xF));
                }
            } else {
                if (!map4.containsKey(Integer.valueOf(i7))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                C.o1<?> o1Var = map4.get(Integer.valueOf(i7));
                C.c1 c1Var = map.get(o1Var);
                C.X xF2 = f(c1Var.d(), jF);
                if (xF2 != null) {
                    map.put(o1Var, c1Var.g().d(xF2).a());
                }
            }
        }
    }

    public static void m(Collection<C.X0> collection, Collection<C.o1<?>> collection2, Map<AbstractC0324e0, Long> map) {
        ArrayList arrayList = new ArrayList(collection2);
        for (C.X0 x02 : collection) {
            C.X xF = x02.f();
            X.a<Long> aVar = f23108a;
            if (xF.b(aVar) && x02.o().size() != 1) {
                C3043d0.c("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(x02.o().size())));
                return;
            }
            if (x02.f().b(aVar)) {
                int i7 = 0;
                for (C.X0 x03 : collection) {
                    if (((C.o1) arrayList.get(i7)).F() == p1.b.METERING_REPEATING) {
                        x0.g.j(!x03.o().isEmpty(), "MeteringRepeating should contain a surface");
                        map.put(x03.o().get(0), 1L);
                    } else {
                        C.X xF2 = x03.f();
                        X.a<Long> aVar2 = f23108a;
                        if (xF2.b(aVar2) && !x03.o().isEmpty()) {
                            map.put(x03.o().get(0), (Long) x03.f().f(aVar2));
                        }
                    }
                    i7++;
                }
                return;
            }
        }
    }

    public static boolean n(O1.b bVar) {
        return bVar.a() == 0 && bVar.b() == 8;
    }

    private static void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
