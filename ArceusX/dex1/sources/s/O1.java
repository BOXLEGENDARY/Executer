package s;

import C.AbstractC0315a;
import C.c1;
import C.e1;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t.C2894g;
import w.C2961f;
import z.C3070z;

final class O1 {

    private final String f23122i;

    private final InterfaceC2807f f23123j;

    private final t.B f23124k;

    private final C2961f f23125l;

    private final int f23126m;

    private boolean f23127n;

    private boolean f23128o;

    private boolean f23129p;

    private boolean f23130q;

    private boolean f23131r;

    private boolean f23132s;

    C.f1 f23133t;

    private final C2815h1 f23135v;

    private final C2818i1 f23138y;

    private final List<C.d1> f23114a = new ArrayList();

    private final List<C.d1> f23115b = new ArrayList();

    private final List<C.d1> f23116c = new ArrayList();

    private final List<C.d1> f23117d = new ArrayList();

    private final Map<b, List<C.d1>> f23118e = new HashMap();

    private final List<C.d1> f23119f = new ArrayList();

    private final List<C.d1> f23120g = new ArrayList();

    private final List<C.d1> f23121h = new ArrayList();

    List<Integer> f23134u = new ArrayList();

    private final w.x f23136w = new w.x();

    private final w.t f23137x = new w.t();

    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i7) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i7);
        }
    }

    static abstract class b {
        b() {
        }

        static b e(int i7, int i8, boolean z7, boolean z8) {
            return new C2804e(i7, i8, z7, z8);
        }

        abstract int a();

        abstract int b();

        abstract boolean c();

        abstract boolean d();
    }

    O1(Context context, String str, t.O o2, InterfaceC2807f interfaceC2807f) throws NumberFormatException, z.r {
        this.f23127n = false;
        this.f23128o = false;
        this.f23129p = false;
        this.f23130q = false;
        this.f23131r = false;
        this.f23132s = false;
        String str2 = (String) x0.g.g(str);
        this.f23122i = str2;
        this.f23123j = (InterfaceC2807f) x0.g.g(interfaceC2807f);
        this.f23125l = new C2961f();
        this.f23135v = C2815h1.c(context);
        try {
            t.B bC = o2.c(str2);
            this.f23124k = bC;
            Integer num = (Integer) bC.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f23126m = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) bC.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i7 : iArr) {
                    if (i7 == 3) {
                        this.f23127n = true;
                    } else if (i7 == 6) {
                        this.f23128o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i7 == 16) {
                        this.f23131r = true;
                    }
                }
            }
            C2818i1 c2818i1 = new C2818i1(this.f23124k);
            this.f23138y = c2818i1;
            k();
            if (this.f23131r) {
                n();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f23129p = zHasSystemFeature;
            if (zHasSystemFeature) {
                h();
            }
            if (c2818i1.d()) {
                g();
            }
            if (J()) {
                m();
            }
            boolean zH = M1.h(this.f23124k);
            this.f23130q = zH;
            if (zH) {
                j();
            }
            boolean zA = g2.a(this.f23124k);
            this.f23132s = zA;
            if (zA) {
                i();
            }
            l();
            b();
        } catch (C2894g e7) {
            throw R0.a(e7);
        }
    }

    private List<C.d1> B(b bVar) {
        if (this.f23118e.containsKey(bVar)) {
            return this.f23118e.get(bVar);
        }
        List<C.d1> arrayList = new ArrayList<>();
        if (bVar.d()) {
            if (bVar.a() == 0) {
                arrayList.addAll(this.f23120g);
            }
        } else if (bVar.b() == 8) {
            int iA = bVar.a();
            if (iA == 1) {
                arrayList = this.f23116c;
            } else if (iA != 2) {
                arrayList.addAll(bVar.c() ? this.f23117d : this.f23114a);
            } else {
                arrayList.addAll(this.f23115b);
                arrayList.addAll(this.f23114a);
            }
        } else if (bVar.b() == 10 && bVar.a() == 0) {
            arrayList.addAll(this.f23119f);
        }
        this.f23118e.put(bVar, arrayList);
        return arrayList;
    }

    private Pair<List<C.e1>, Integer> C(int i7, List<AbstractC0315a> list, List<Size> list2, List<C.o1<?>> list3, List<Integer> list4, int i8, Map<Integer, AbstractC0315a> map, Map<Integer, C.o1<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC0315a abstractC0315a : list) {
            arrayList.add(abstractC0315a.g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), abstractC0315a);
            }
        }
        for (int i9 = 0; i9 < list2.size(); i9++) {
            Size size = list2.get(i9);
            C.o1<?> o1Var = list3.get(list4.get(i9).intValue());
            int iT = o1Var.t();
            arrayList.add(C.e1.h(i7, iT, size, F(iT)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), o1Var);
            }
            i8 = E(i8, o1Var.t(), size);
        }
        return new Pair<>(arrayList, Integer.valueOf(i8));
    }

    private Range<Integer> D(List<AbstractC0315a> list, List<C.o1<?>> list2, List<Integer> list3) {
        Iterator<AbstractC0315a> it = list.iterator();
        Range<Integer> rangeG = null;
        while (it.hasNext()) {
            rangeG = G(it.next().h(), rangeG);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            rangeG = G(list2.get(it2.next().intValue()).H(null), rangeG);
        }
        return rangeG;
    }

    private int E(int i7, int i8, Size size) {
        return Math.min(i7, q(this.f23124k, i8, size));
    }

    private Range<Integer> G(Range<Integer> range, Range<Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private static List<Integer> H(List<C.o1<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<C.o1<?>> it = list.iterator();
        while (it.hasNext()) {
            int iK = it.next().K(0);
            if (!arrayList2.contains(Integer.valueOf(iK))) {
                arrayList2.add(Integer.valueOf(iK));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            for (C.o1<?> o1Var : list) {
                if (iIntValue == o1Var.K(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(o1Var)));
                }
            }
        }
        return arrayList;
    }

    private static boolean I(List<AbstractC0315a> list, Map<C.o1<?>, List<Size>> map) {
        Iterator<AbstractC0315a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().d() == 4101) {
                return true;
            }
        }
        Iterator<C.o1<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().t() == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean J() {
        int[] iArrB = this.f23124k.b().b();
        if (iArrB == null) {
            return false;
        }
        for (int i7 : iArrB) {
            if (i7 == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean K(b bVar, List<AbstractC0315a> list, Map<C.o1<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC0315a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        E.d dVar = new E.d();
        for (C.o1<?> o1Var : map.keySet()) {
            List<Size> list2 = map.get(o1Var);
            x0.g.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + o1Var + ".");
            Size size = (Size) Collections.min(list2, dVar);
            int iT = o1Var.t();
            arrayList.add(C.e1.h(bVar.a(), iT, size, F(iT)));
        }
        return c(bVar, arrayList);
    }

    private void L() throws NumberFormatException {
        this.f23135v.g();
        if (this.f23133t == null) {
            l();
        } else {
            this.f23133t = C.f1.a(this.f23133t.b(), this.f23133t.j(), this.f23135v.f(), this.f23133t.h(), this.f23133t.f(), this.f23133t.d(), this.f23133t.l());
        }
    }

    private void N(Map<Integer, Size> map, int i7) {
        Size sizeR = r(this.f23124k.b().d(), i7, true);
        if (sizeR != null) {
            map.put(Integer.valueOf(i7), sizeR);
        }
    }

    private void O(Map<Integer, Size> map, Size size, int i7) {
        if (this.f23129p) {
            Size sizeR = r(this.f23124k.b().d(), i7, false);
            Integer numValueOf = Integer.valueOf(i7);
            if (sizeR != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeR), new E.d());
            }
            map.put(numValueOf, size);
        }
    }

    private void P(Map<Integer, Size> map, int i7) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.f23131r || (streamConfigurationMap = (StreamConfigurationMap) this.f23124k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i7), r(streamConfigurationMap, i7, true));
    }

    private void b() {
    }

    private static Range<Integer> d(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double dV = v(range2.intersect(range));
        double dV2 = v(range3.intersect(range));
        double dV3 = dV2 / v(range3);
        double dV4 = dV / v(range2);
        if (dV2 > dV) {
            if (dV3 >= 0.5d || dV3 >= dV4) {
                return range3;
            }
        } else if (dV2 == dV) {
            if (dV3 > dV4) {
                return range3;
            }
            if (dV3 == dV4 && ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue()) {
                return range3;
            }
        } else if (dV4 < 0.5d && dV3 > dV4) {
            return range3;
        }
        return range2;
    }

    private b e(int i7, Map<C.o1<?>, C3070z> map, boolean z7, boolean z8) {
        int iZ = z(map);
        if (i7 != 0 && z8) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f23122i, C.K.a(i7)));
        }
        if (i7 == 0 || iZ != 10) {
            return b.e(i7, iZ, z7, z8);
        }
        throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f23122i, C.K.a(i7)));
    }

    private Map<C.o1<?>, List<Size>> f(Map<C.o1<?>, List<Size>> map, b bVar, Range<Integer> range) {
        HashMap map2 = new HashMap();
        for (C.o1<?> o1Var : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            for (Size size : map.get(o1Var)) {
                int iT = o1Var.t();
                e1.a aVarC = C.e1.h(bVar.a(), iT, size, F(iT)).c();
                int iQ = range != null ? q(this.f23124k, iT, size) : Integer.MAX_VALUE;
                Set hashSet = (Set) map3.get(aVarC);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map3.put(aVarC, hashSet);
                }
                if (!hashSet.contains(Integer.valueOf(iQ))) {
                    arrayList.add(size);
                    hashSet.add(Integer.valueOf(iQ));
                }
            }
            map2.put(o1Var, arrayList);
        }
        return map2;
    }

    private void g() {
        this.f23119f.addAll(C2869z1.b());
    }

    private void h() {
        this.f23116c.addAll(C2869z1.d());
    }

    private void i() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f23117d.addAll(C2869z1.i());
        }
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f23121h.addAll(C2869z1.k());
        }
    }

    private void k() {
        this.f23114a.addAll(C2869z1.a(this.f23126m, this.f23127n, this.f23128o));
        this.f23114a.addAll(this.f23125l.a(this.f23122i));
    }

    private void l() throws NumberFormatException {
        this.f23133t = C.f1.a(L.d.f1939c, new HashMap(), this.f23135v.f(), new HashMap(), w(), new HashMap(), new HashMap());
    }

    private void m() {
        this.f23120g.addAll(C2869z1.l());
    }

    private void n() {
        this.f23115b.addAll(C2869z1.m());
    }

    private List<List<Size>> o(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= it.next().size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / list.get(0).size();
        int i8 = size;
        for (int i9 = 0; i9 < list.size(); i9++) {
            List<Size> list2 = list.get(i9);
            for (int i10 = 0; i10 < size; i10++) {
                ((List) arrayList.get(i10)).add(list2.get((i10 % i8) / size2));
            }
            if (i9 < list.size() - 1) {
                i8 = size2;
                size2 /= list.get(i9 + 1).size();
            }
        }
        return arrayList;
    }

    private Range<Integer> p(Range<Integer> range, int i7) {
        if (range != null) {
            Range<Integer> rangeD = C.c1.f534a;
            if (!range.equals(rangeD)) {
                Range<Integer>[] rangeArr = (Range[]) this.f23124k.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return rangeD;
                }
                Range<T> range2 = new Range<>(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i7)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i7)));
                int iV = 0;
                for (Range<Integer> range3 : rangeArr) {
                    if (i7 >= ((Integer) range3.getLower()).intValue()) {
                        if (rangeD.equals(C.c1.f534a)) {
                            rangeD = range3;
                        }
                        if (range3.equals(range2)) {
                            return range3;
                        }
                        try {
                            int iV2 = v(range3.intersect(range2));
                            if (iV == 0) {
                                iV = iV2;
                            } else {
                                if (iV2 >= iV) {
                                    rangeD = d(range2, rangeD, range3);
                                    iV = v(range2.intersect(rangeD));
                                }
                                range3 = rangeD;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (iV != 0 || (u(range3, range2) >= u(rangeD, range2) && (u(range3, range2) != u(rangeD, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeD.getUpper()).intValue() && v(range3) >= v(rangeD))))) {
                            }
                        }
                        rangeD = range3;
                    }
                }
                return rangeD;
            }
        }
        return C.c1.f534a;
    }

    static int q(t.B b2, int i7, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) b2.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i7, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    private Size r(StreamConfigurationMap streamConfigurationMap, int i7, boolean z7) {
        Size[] sizeArrA;
        Size[] outputSizes = i7 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i7);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        E.d dVar = new E.d();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), dVar);
        Size size2 = L.d.f1937a;
        if (z7 && (sizeArrA = a.a(streamConfigurationMap, i7)) != null && sizeArrA.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrA), dVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), dVar);
    }

    private int s(List<AbstractC0315a> list) {
        int iE = Integer.MAX_VALUE;
        for (AbstractC0315a abstractC0315a : list) {
            iE = E(iE, abstractC0315a.d(), abstractC0315a.f());
        }
        return iE;
    }

    private static int u(Range<Integer> range, Range<Integer> range2) {
        x0.g.j((range.contains((Range<Integer>) range2.getUpper()) || range.contains((Range<Integer>) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    private static int v(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    private Size w() throws NumberFormatException {
        try {
            int i7 = Integer.parseInt(this.f23122i);
            CamcorderProfile camcorderProfileA = this.f23123j.b(i7, 1) ? this.f23123j.a(i7, 1) : null;
            return camcorderProfileA != null ? new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight) : x(i7);
        } catch (NumberFormatException unused) {
            return y();
        }
    }

    private Size x(int i7) {
        Size size = L.d.f1940d;
        CamcorderProfile camcorderProfileA = this.f23123j.b(i7, 10) ? this.f23123j.a(i7, 10) : this.f23123j.b(i7, 8) ? this.f23123j.a(i7, 8) : this.f23123j.b(i7, 12) ? this.f23123j.a(i7, 12) : this.f23123j.b(i7, 6) ? this.f23123j.a(i7, 6) : this.f23123j.b(i7, 5) ? this.f23123j.a(i7, 5) : this.f23123j.b(i7, 4) ? this.f23123j.a(i7, 4) : null;
        return camcorderProfileA != null ? new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight) : size;
    }

    private Size y() {
        Size[] outputSizes = this.f23124k.b().d().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return L.d.f1940d;
        }
        Arrays.sort(outputSizes, new E.d(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = L.d.f1942f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return L.d.f1940d;
    }

    private static int z(Map<C.o1<?>, C3070z> map) {
        Iterator<C3070z> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    Pair<Map<C.o1<?>, C.c1>, Map<AbstractC0315a, C.c1>> A(int i7, List<AbstractC0315a> list, Map<C.o1<?>, List<Size>> map, boolean z7, boolean z8) throws NumberFormatException {
        HashMap map2;
        HashMap map3;
        HashMap map4;
        Range<Integer> range;
        List<Integer> list2;
        Map<C.o1<?>, C3070z> map5;
        int i8;
        String str;
        String str2;
        HashMap map6;
        List<C.e1> list3;
        String str3;
        String str4;
        HashMap map7;
        HashMap map8;
        List<Size> list4;
        List<Size> list5;
        HashMap map9;
        int i9;
        int i10;
        int i11;
        String str5;
        L();
        ArrayList arrayList = new ArrayList(map.keySet());
        List<Integer> listH = H(arrayList);
        Map<C.o1<?>, C3070z> mapG = this.f23138y.g(list, arrayList, listH);
        b bVarE = e(i7, mapG, z7, I(list, map));
        boolean zK = K(bVarE, list, map);
        String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
        String str7 = " New configs: ";
        String str8 = "No supported surface combination is found for camera device - Id : ";
        if (!zK) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f23122i + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range<Integer> rangeD = D(list, arrayList, listH);
        Map<C.o1<?>, List<Size>> mapF = f(map, bVarE, rangeD);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = listH.iterator();
        while (it.hasNext()) {
            C.o1<?> o1Var = arrayList.get(it.next().intValue());
            arrayList2.add(a(mapF.get(o1Var), o1Var.t()));
        }
        List<List<Size>> listO = o(arrayList2);
        HashMap map10 = new HashMap();
        HashMap map11 = new HashMap();
        HashMap map12 = new HashMap();
        HashMap map13 = new HashMap();
        boolean zD = M1.d(list, arrayList);
        int iS = s(list);
        HashMap map14 = map13;
        if (!this.f23130q || zD) {
            map2 = map12;
            map3 = map11;
            map4 = map10;
            range = rangeD;
            list2 = listH;
            map5 = mapG;
            i8 = iS;
            str = "No supported surface combination is found for camera device - Id : ";
            str2 = " New configs: ";
            map6 = map14;
            list3 = null;
        } else {
            Iterator<List<Size>> it2 = listO.iterator();
            List<C.e1> listT = null;
            while (true) {
                if (!it2.hasNext()) {
                    map3 = map11;
                    map4 = map10;
                    range = rangeD;
                    list2 = listH;
                    map5 = mapG;
                    i8 = iS;
                    str = str8;
                    str2 = str7;
                    str5 = str6;
                    map6 = map14;
                    map2 = map12;
                    break;
                }
                HashMap map15 = map14;
                HashMap map16 = map12;
                map3 = map11;
                map4 = map10;
                map5 = mapG;
                Range<Integer> range2 = rangeD;
                List<Integer> list6 = listH;
                range = range2;
                str = str8;
                int i12 = iS;
                i8 = iS;
                str2 = str7;
                list2 = listH;
                str5 = str6;
                listT = t(bVarE, (List) C(i7, list, it2.next(), arrayList, list6, i12, map16, map15).first);
                map2 = map16;
                map6 = map15;
                if (listT != null && !M1.a(map2, map6, listT)) {
                    listT = null;
                }
                if (listT != null) {
                    if (M1.c(this.f23124k, listT)) {
                        break;
                    }
                    listT = null;
                }
                map2.clear();
                map6.clear();
                map14 = map6;
                map12 = map2;
                str6 = str5;
                str8 = str;
                str7 = str2;
                mapG = map5;
                map11 = map3;
                map10 = map4;
                rangeD = range;
                iS = i8;
                listH = list2;
            }
            if (listT == null && !zK) {
                throw new IllegalArgumentException(str + this.f23122i + str5 + list + str2 + arrayList);
            }
            list3 = listT;
        }
        Iterator<List<Size>> it3 = listO.iterator();
        int i13 = Integer.MAX_VALUE;
        int iIntValue = Integer.MAX_VALUE;
        boolean z9 = false;
        boolean z10 = false;
        List<Size> list7 = null;
        List<Size> list8 = null;
        while (true) {
            if (!it3.hasNext()) {
                str3 = str;
                str4 = str2;
                map7 = map6;
                map8 = map2;
                list4 = list7;
                list5 = list8;
                break;
            }
            List<Size> next = it3.next();
            int i14 = i13;
            int i15 = iIntValue;
            str4 = str2;
            map7 = map6;
            str3 = str;
            map8 = map2;
            Pair<List<C.e1>, Integer> pairC = C(i7, list, next, arrayList, list2, i8, null, null);
            List<C.e1> list9 = (List) pairC.first;
            iIntValue = ((Integer) pairC.second).intValue();
            int i16 = i8;
            boolean z11 = range == null || i16 <= iIntValue || iIntValue >= ((Integer) range.getLower()).intValue();
            if (z9 || !c(bVarE, list9)) {
                i9 = i15;
                i10 = Integer.MAX_VALUE;
            } else {
                i9 = i15;
                i10 = Integer.MAX_VALUE;
                if (i9 == Integer.MAX_VALUE || i9 < iIntValue) {
                    i9 = iIntValue;
                    list7 = next;
                }
                if (z11) {
                    if (z10) {
                        list5 = list8;
                        list4 = next;
                        i13 = i14;
                        break;
                    }
                    z9 = true;
                    i9 = iIntValue;
                    list7 = next;
                }
            }
            if (list3 == null || z10 || t(bVarE, list9) == null) {
                i11 = i14;
            } else {
                i11 = i14;
                if (i11 == i10 || i11 < iIntValue) {
                    i11 = iIntValue;
                    list8 = next;
                }
                if (!z11) {
                    continue;
                } else {
                    if (z9) {
                        i13 = iIntValue;
                        iIntValue = i9;
                        list4 = list7;
                        list5 = next;
                        break;
                    }
                    z10 = true;
                    i11 = iIntValue;
                    list8 = next;
                }
            }
            i8 = i16;
            iIntValue = i9;
            map2 = map8;
            map6 = map7;
            str = str3;
            str2 = str4;
            i13 = i11;
        }
        if (list4 == null) {
            throw new IllegalArgumentException(str3 + this.f23122i + " and Hardware level: " + this.f23126m + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str4 + arrayList);
        }
        Range<Integer> rangeP = range != null ? p(range, iIntValue) : null;
        Iterator<C.o1<?>> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C.o1<?> next2 = it4.next();
            List<Integer> list10 = list2;
            Map<C.o1<?>, C3070z> map17 = map5;
            Iterator<C.o1<?>> it5 = it4;
            c1.a aVarF = C.c1.a(list4.get(list10.indexOf(Integer.valueOf(arrayList.indexOf(next2))))).b((C3070z) x0.g.g(map17.get(next2))).d(M1.e(next2)).f(z8);
            if (rangeP != null) {
                aVarF.c(rangeP);
            }
            map3.put(next2, aVarF.a());
            it4 = it5;
            list2 = list10;
            map5 = map17;
            rangeP = rangeP;
        }
        HashMap map18 = map3;
        if (list3 == null || iIntValue != i13 || list4.size() != list5.size()) {
            map9 = map4;
            break;
        }
        for (int i17 = 0; i17 < list4.size(); i17++) {
            if (!list4.get(i17).equals(list5.get(i17))) {
                map9 = map4;
                break;
            }
        }
        map9 = map4;
        if (!M1.k(this.f23124k, list, map18, map9)) {
            M1.l(map18, map9, map8, map7, list3);
        }
        return new Pair<>(map18, map9);
    }

    C.f1 F(int i7) {
        if (!this.f23134u.contains(Integer.valueOf(i7))) {
            O(this.f23133t.j(), L.d.f1941e, i7);
            O(this.f23133t.h(), L.d.f1943g, i7);
            N(this.f23133t.d(), i7);
            P(this.f23133t.l(), i7);
            this.f23134u.add(Integer.valueOf(i7));
        }
        return this.f23133t;
    }

    C.e1 M(int i7, int i8, Size size) {
        return C.e1.h(i7, i8, size, F(i8));
    }

    List<Size> a(List<Size> list, int i7) {
        Rational rational;
        int iA = this.f23136w.a(this.f23122i, this.f23124k);
        if (iA == 0) {
            rational = E.a.f999a;
        } else if (iA == 1) {
            rational = E.a.f1001c;
        } else if (iA != 2) {
            rational = null;
        } else {
            Size sizeC = F(256).c(256);
            rational = new Rational(sizeC.getWidth(), sizeC.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (E.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f23137x.a(C.e1.e(i7), list);
    }

    boolean c(b bVar, List<C.e1> list) {
        Iterator<C.d1> it = B(bVar).iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 = it.next().d(list) != null;
            if (z7) {
                break;
            }
        }
        return z7;
    }

    List<C.e1> t(b bVar, List<C.e1> list) {
        if (!M1.n(bVar)) {
            return null;
        }
        Iterator<C.d1> it = this.f23121h.iterator();
        while (it.hasNext()) {
            List<C.e1> listD = it.next().d(list);
            if (listD != null) {
                return listD;
            }
        }
        return null;
    }
}
