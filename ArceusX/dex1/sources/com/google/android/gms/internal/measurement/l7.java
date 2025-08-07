package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public final class l7 {

    final TreeMap<Integer, C1953q> f15208a = new TreeMap<>();

    final TreeMap<Integer, C1953q> f15209b = new TreeMap<>();

    private static final int c(T1 t1, C1953q c1953q, r rVar) {
        r rVarA = c1953q.a(t1, Collections.singletonList(rVar));
        if (rVarA instanceof C1897j) {
            return C1987u2.b(rVarA.f().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i7, C1953q c1953q, String str2) {
        TreeMap<Integer, C1953q> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f15209b;
        } else {
            if (!"edit".equals(str2)) {
                String strValueOf = String.valueOf(str2);
                throw new IllegalStateException(strValueOf.length() != 0 ? "Unknown callback type: ".concat(strValueOf) : new String("Unknown callback type: "));
            }
            treeMap = this.f15208a;
        }
        if (treeMap.containsKey(Integer.valueOf(i7))) {
            i7 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i7), c1953q);
    }

    public final void b(T1 t1, C1841c c1841c) {
        C1997v4 c1997v4 = new C1997v4(c1841c);
        for (Integer num : this.f15208a.keySet()) {
            C1833b c1833bClone = c1841c.b().clone();
            int iC = c(t1, this.f15208a.get(num), c1997v4);
            if (iC == 2 || iC == -1) {
                c1841c.f(c1833bClone);
            }
        }
        Iterator<Integer> it = this.f15209b.keySet().iterator();
        while (it.hasNext()) {
            c(t1, this.f15209b.get(it.next()), c1997v4);
        }
    }
}
