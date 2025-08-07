package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class T4<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    private final int f15036d;

    private boolean f15039v;

    private volatile S4 f15040w;

    private List<Q4> f15037e = Collections.emptyList();

    private Map<K, V> f15038i = Collections.emptyMap();

    private Map<K, V> f15041y = Collections.emptyMap();

    private final int l(K k7) {
        int size = this.f15037e.size();
        int i7 = size - 1;
        int i8 = 0;
        if (i7 >= 0) {
            int iCompareTo = k7.compareTo(this.f15037e.get(i7).c());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i7;
            }
        }
        while (i8 <= i7) {
            int i9 = (i8 + i7) / 2;
            int iCompareTo2 = k7.compareTo(this.f15037e.get(i9).c());
            if (iCompareTo2 < 0) {
                i7 = i9 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i9;
                }
                i8 = i9 + 1;
            }
        }
        return -(i8 + 1);
    }

    public final V m(int i7) {
        o();
        V v7 = (V) this.f15037e.remove(i7).getValue();
        if (!this.f15038i.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            List<Q4> list = this.f15037e;
            Map.Entry<K, V> next = it.next();
            list.add(new Q4(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v7;
    }

    private final SortedMap<K, V> n() {
        o();
        if (this.f15038i.isEmpty() && !(this.f15038i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15038i = treeMap;
            this.f15041y = treeMap.descendingMap();
        }
        return (SortedMap) this.f15038i;
    }

    public final void o() {
        if (this.f15039v) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f15039v) {
            return;
        }
        this.f15038i = this.f15038i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15038i);
        this.f15041y = this.f15041y.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15041y);
        this.f15039v = true;
    }

    public final int b() {
        return this.f15037e.size();
    }

    public final Iterable<Map.Entry<K, V>> c() {
        return this.f15038i.isEmpty() ? P4.a() : this.f15038i.entrySet();
    }

    @Override
    public final void clear() {
        o();
        if (!this.f15037e.isEmpty()) {
            this.f15037e.clear();
        }
        if (this.f15038i.isEmpty()) {
            return;
        }
        this.f15038i.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f15038i.containsKey(comparable);
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f15040w == null) {
            this.f15040w = new S4(this, null);
        }
        return this.f15040w;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T4)) {
            return super.equals(obj);
        }
        T4 t42 = (T4) obj;
        int size = size();
        if (size != t42.size()) {
            return false;
        }
        int iB = b();
        if (iB != t42.b()) {
            return entrySet().equals(t42.entrySet());
        }
        for (int i7 = 0; i7 < iB; i7++) {
            if (!h(i7).equals(t42.h(i7))) {
                return false;
            }
        }
        if (iB != size) {
            return this.f15038i.equals(t42.f15038i);
        }
        return true;
    }

    @Override
    public final V put(K k7, V v7) {
        o();
        int iL = l(k7);
        if (iL >= 0) {
            return (V) this.f15037e.get(iL).setValue(v7);
        }
        o();
        if (this.f15037e.isEmpty() && !(this.f15037e instanceof ArrayList)) {
            this.f15037e = new ArrayList(this.f15036d);
        }
        int i7 = -(iL + 1);
        if (i7 >= this.f15036d) {
            return n().put(k7, v7);
        }
        int size = this.f15037e.size();
        int i8 = this.f15036d;
        if (size == i8) {
            Q4 q4Remove = this.f15037e.remove(i8 - 1);
            n().put(q4Remove.c(), q4Remove.getValue());
        }
        this.f15037e.add(i7, new Q4(this, k7, v7));
        return null;
    }

    @Override
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? (V) this.f15037e.get(iL).getValue() : this.f15038i.get(comparable);
    }

    public final Map.Entry<K, V> h(int i7) {
        return this.f15037e.get(i7);
    }

    @Override
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i7 = 0; i7 < iB; i7++) {
            iHashCode += this.f15037e.get(i7).hashCode();
        }
        return this.f15038i.size() > 0 ? iHashCode + this.f15038i.hashCode() : iHashCode;
    }

    public final boolean k() {
        return this.f15039v;
    }

    @Override
    public final V remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.f15038i.isEmpty()) {
            return null;
        }
        return this.f15038i.remove(comparable);
    }

    @Override
    public final int size() {
        return this.f15037e.size() + this.f15038i.size();
    }
}
