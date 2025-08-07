package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.K3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t4.gYZ.uCYQMIHsy;

final class L3<T extends K3<T>> {

    private static final L3 f14819d = new L3(true);

    final T4<T, Object> f14820a = new M4(16);

    private boolean f14821b;

    private boolean f14822c;

    private L3() {
    }

    public static <T extends K3<T>> L3<T> a() {
        throw null;
    }

    private static final void d(T r2, java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.L3.d(com.google.android.gms.internal.measurement.K3, java.lang.Object):void");
    }

    public final void b() {
        if (this.f14821b) {
            return;
        }
        this.f14820a.a();
        this.f14821b = true;
    }

    public final void c(T t7, Object obj) {
        if (!t7.a()) {
            d(t7, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException(uCYQMIHsy.XqCTZKVb);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d(t7, arrayList.get(i7));
            }
            obj = arrayList;
        }
        this.f14820a.put(t7, obj);
    }

    public final Object clone() throws CloneNotSupportedException {
        L3 l32 = new L3();
        for (int i7 = 0; i7 < this.f14820a.b(); i7++) {
            Map.Entry<K, Object> entryH = this.f14820a.h(i7);
            l32.c((K3) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f14820a.c().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            l32.c((K3) entry.getKey(), entry.getValue());
        }
        l32.f14822c = this.f14822c;
        return l32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L3) {
            return this.f14820a.equals(((L3) obj).f14820a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14820a.hashCode();
    }

    private L3(boolean z7) {
        b();
        b();
    }
}
