package com.google.android.gms.internal.measurement;

import java.util.Map;

final class Q4 implements Map.Entry, Comparable<Q4> {

    private final Comparable f15010d;

    private Object f15011e;

    final T4 f15012i;

    Q4(T4 t42, Comparable comparable, Object obj) {
        this.f15012i = t42;
        this.f15010d = comparable;
        this.f15011e = obj;
    }

    private static final boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable c() {
        return this.f15010d;
    }

    @Override
    public final int compareTo(Q4 q42) {
        return this.f15010d.compareTo(q42.f15010d);
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
        return e(this.f15010d, entry.getKey()) && e(this.f15011e, entry.getValue());
    }

    @Override
    public final Object getKey() {
        return this.f15010d;
    }

    @Override
    public final Object getValue() {
        return this.f15011e;
    }

    @Override
    public final int hashCode() {
        Comparable comparable = this.f15010d;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f15011e;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override
    public final Object setValue(Object obj) {
        this.f15012i.o();
        Object obj2 = this.f15011e;
        this.f15011e = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f15010d);
        String strValueOf2 = String.valueOf(this.f15011e);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
