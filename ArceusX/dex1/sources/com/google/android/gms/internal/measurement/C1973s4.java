package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class C1973s4 {
    C1973s4() {
    }

    public static final int a(int i7, Object obj, Object obj2) {
        C1965r4 c1965r4 = (C1965r4) obj;
        if (c1965r4.isEmpty()) {
            return 0;
        }
        Iterator it = c1965r4.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        C1965r4 c1965r4B = (C1965r4) obj;
        C1965r4 c1965r4 = (C1965r4) obj2;
        if (!c1965r4.isEmpty()) {
            if (!c1965r4B.g()) {
                c1965r4B = c1965r4B.b();
            }
            c1965r4B.d(c1965r4);
        }
        return c1965r4B;
    }
}
