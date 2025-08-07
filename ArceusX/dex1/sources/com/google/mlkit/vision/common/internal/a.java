package com.google.mlkit.vision.common.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import n3.C2651i;

public class a {

    private final Map f19294a = new HashMap();

    public static class C0173a {

        private final Class f19295a;

        private final c5.b f19296b;

        private final int f19297c;

        final int a() {
            return this.f19297c;
        }

        final c5.b b() {
            return this.f19296b;
        }

        final Class c() {
            return this.f19295a;
        }
    }

    a(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0173a c0173a = (C0173a) it.next();
            Class clsC = c0173a.c();
            if (!this.f19294a.containsKey(clsC) || c0173a.a() >= ((Integer) C2651i.l((Integer) map.get(clsC))).intValue()) {
                this.f19294a.put(clsC, c0173a.b());
                map.put(clsC, Integer.valueOf(c0173a.a()));
            }
        }
    }
}
