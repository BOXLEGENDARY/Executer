package com.google.android.gms.internal.play_billing;

import java.util.Map;

final class K3 implements Map.Entry, Comparable {

    private final Comparable f15889d;

    private Object f15890e;

    final O3 f15891i;

    K3(O3 o32, Comparable comparable, Object obj) {
        this.f15891i = o32;
        this.f15889d = comparable;
        this.f15890e = obj;
    }

    private static final boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable c() {
        return this.f15889d;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f15889d.compareTo(((K3) obj).f15889d);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return e(this.f15889d, entry.getKey()) && e(this.f15890e, entry.getValue());
    }

    @Override
    public final Object getKey() {
        return this.f15889d;
    }

    @Override
    public final Object getValue() {
        return this.f15890e;
    }

    @Override
    public final int hashCode() {
        Comparable comparable = this.f15889d;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f15890e;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override
    public final Object setValue(Object obj) {
        this.f15891i.p();
        Object obj2 = this.f15890e;
        this.f15890e = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f15889d) + "=" + String.valueOf(this.f15890e);
    }
}
