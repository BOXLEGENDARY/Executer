package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class S4 extends AbstractSet<Map.Entry> {

    final T4 f15025d;

    S4(T4 t42, M4 m42) {
        this.f15025d = t42;
    }

    @Override
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f15025d.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override
    public final void clear() {
        this.f15025d.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f15025d.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override
    public final Iterator<Map.Entry> iterator() {
        return new R4(this.f15025d, null);
    }

    @Override
    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f15025d.remove(entry.getKey());
        return true;
    }

    @Override
    public final int size() {
        return this.f15025d.size();
    }
}
