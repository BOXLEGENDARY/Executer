package com.google.android.gms.common.api.internal;

import a4.C1574k;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import l3.C2527b;

public final class C1812l {

    private final Map f14160a = Collections.synchronizedMap(new WeakHashMap());

    private final Map f14161b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z7, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f14160a) {
            map = new HashMap(this.f14160a);
        }
        synchronized (this.f14161b) {
            map2 = new HashMap(this.f14161b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z7 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).d(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z7 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C1574k) entry2.getKey()).d(new C2527b(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z7) {
        this.f14160a.put(basePendingResult, Boolean.valueOf(z7));
        basePendingResult.a(new C1810j(this, basePendingResult));
    }

    final void d(C1574k c1574k, boolean z7) {
        this.f14161b.put(c1574k, Boolean.valueOf(z7));
        c1574k.a().addOnCompleteListener(new C1811k(this, c1574k));
    }

    final void e(int i7, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        h(true, new Status(20, sb.toString()));
    }

    public final void f() {
        h(false, C1803c.f14110I);
    }

    final boolean g() {
        return (this.f14160a.isEmpty() && this.f14161b.isEmpty()) ? false : true;
    }
}
