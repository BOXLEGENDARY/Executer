package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class V2 {
    public static r a(C1932n2 c1932n2) {
        if (c1932n2 == null) {
            return r.f15282g;
        }
        int iG = c1932n2.G() - 1;
        if (iG == 1) {
            return c1932n2.F() ? new C1992v(c1932n2.z()) : r.f15289o;
        }
        if (iG == 2) {
            return c1932n2.E() ? new C1897j(Double.valueOf(c1932n2.w())) : new C1897j(null);
        }
        if (iG == 3) {
            return c1932n2.D() ? new C1873g(Boolean.valueOf(c1932n2.C())) : new C1873g(null);
        }
        if (iG != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List<C1932n2> listB = c1932n2.B();
        ArrayList arrayList = new ArrayList();
        Iterator<C1932n2> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return new C1968s(c1932n2.y(), arrayList);
    }

    public static r b(Object obj) {
        if (obj == null) {
            return r.f15283h;
        }
        if (obj instanceof String) {
            return new C1992v((String) obj);
        }
        if (obj instanceof Double) {
            return new C1897j((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1897j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1897j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1873g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C1865f c1865f = new C1865f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1865f.v(c1865f.n(), b(it.next()));
            }
            return c1865f;
        }
        C1937o c1937o = new C1937o();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            r rVarB = b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c1937o.k((String) string, rVarB);
            }
        }
        return c1937o;
    }
}
