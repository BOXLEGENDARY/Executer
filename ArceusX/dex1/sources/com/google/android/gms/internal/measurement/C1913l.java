package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class C1913l {
    public static r a(InterfaceC1929n interfaceC1929n, r rVar, T1 t1, List<r> list) {
        if (interfaceC1929n.l0(rVar.e())) {
            r rVarD = interfaceC1929n.D(rVar.e());
            if (rVarD instanceof AbstractC1905k) {
                return ((AbstractC1905k) rVarD).a(t1, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", rVar.e()));
        }
        if (!"hasOwnProperty".equals(rVar.e())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", rVar.e()));
        }
        C1987u2.h("hasOwnProperty", 1, list);
        return interfaceC1929n.l0(t1.b(list.get(0)).e()) ? r.f15287m : r.f15288n;
    }

    public static Iterator<r> b(Map<String, r> map) {
        return new C1921m(map.keySet().iterator());
    }
}
