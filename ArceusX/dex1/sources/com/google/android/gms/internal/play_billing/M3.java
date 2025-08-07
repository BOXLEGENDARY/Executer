package com.google.android.gms.internal.play_billing;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class M3 extends AbstractSet {

    final O3 f15905d;

    M3(O3 o32, N3 n32) {
        this.f15905d = o32;
    }

    @Override
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f15905d.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override
    public final void clear() {
        this.f15905d.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f15905d.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override
    public final Iterator iterator() {
        return new L3(this.f15905d, null);
    }

    @Override
    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f15905d.remove(entry.getKey());
        return true;
    }

    @Override
    public final int size() {
        return this.f15905d.size();
    }
}
