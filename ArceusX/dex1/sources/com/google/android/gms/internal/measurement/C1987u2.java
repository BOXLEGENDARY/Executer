package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class C1987u2 {
    public static double a(double d7) {
        if (Double.isNaN(d7)) {
            return 0.0d;
        }
        if (Double.isInfinite(d7) || d7 == 0.0d || d7 == 0.0d) {
            return d7;
        }
        return (d7 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d7));
    }

    public static int b(double d7) {
        if (Double.isNaN(d7) || Double.isInfinite(d7) || d7 == 0.0d) {
            return 0;
        }
        return (int) (((d7 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d7))) % 4.294967296E9d);
    }

    public static int c(T1 t1) {
        int iB = b(t1.d("runtime.counter").f().doubleValue() + 1.0d);
        if (iB > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        t1.g("runtime.counter", new C1897j(Double.valueOf(iB)));
        return iB;
    }

    public static long d(double d7) {
        return b(d7) & 4294967295L;
    }

    public static O e(String str) {
        O oC = null;
        if (str != null && !str.isEmpty()) {
            oC = O.c(Integer.parseInt(str));
        }
        if (oC != null) {
            return oC;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(r rVar) {
        if (r.f15283h.equals(rVar)) {
            return null;
        }
        if (r.f15282g.equals(rVar)) {
            return BuildConfig.FLAVOR;
        }
        if (rVar instanceof C1937o) {
            return g((C1937o) rVar);
        }
        if (!(rVar instanceof C1865f)) {
            return !rVar.f().isNaN() ? rVar.f() : rVar.e();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<r> it = ((C1865f) rVar).iterator();
        while (it.hasNext()) {
            Object objF = f(it.next());
            if (objF != null) {
                arrayList.add(objF);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> g(C1937o c1937o) {
        HashMap map = new HashMap();
        for (String str : c1937o.a()) {
            Object objF = f(c1937o.D(str));
            if (objF != null) {
                map.put(str, objF);
            }
        }
        return map;
    }

    public static void h(String str, int i7, List<r> list) {
        if (list.size() != i7) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i7, List<r> list) {
        if (list.size() < i7) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }

    public static void j(String str, int i7, List<r> list) {
        if (list.size() > i7) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i7), Integer.valueOf(list.size())));
        }
    }

    public static boolean k(r rVar) {
        if (rVar == null) {
            return false;
        }
        Double dF = rVar.f();
        return !dF.isNaN() && dF.doubleValue() >= 0.0d && dF.equals(Double.valueOf(Math.floor(dF.doubleValue())));
    }

    public static boolean l(r rVar, r rVar2) {
        if (!rVar.getClass().equals(rVar2.getClass())) {
            return false;
        }
        if ((rVar instanceof C2000w) || (rVar instanceof C1945p)) {
            return true;
        }
        if (!(rVar instanceof C1897j)) {
            return rVar instanceof C1992v ? rVar.e().equals(rVar2.e()) : rVar instanceof C1873g ? rVar.g().equals(rVar2.g()) : rVar == rVar2;
        }
        if (Double.isNaN(rVar.f().doubleValue()) || Double.isNaN(rVar2.f().doubleValue())) {
            return false;
        }
        return rVar.f().equals(rVar2.f());
    }
}
