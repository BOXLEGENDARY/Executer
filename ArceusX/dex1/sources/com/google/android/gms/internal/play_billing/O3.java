package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class O3 extends AbstractMap {

    private Object[] f15909d;

    private int f15910e;

    private boolean f15912v;

    private volatile M3 f15913w;

    private Map f15911i = Collections.emptyMap();

    private Map f15914y = Collections.emptyMap();

    private O3() {
    }

    private final int m(Comparable comparable) {
        int i7 = this.f15910e;
        int i8 = i7 - 1;
        int i9 = 0;
        if (i8 >= 0) {
            int iCompareTo = comparable.compareTo(((K3) this.f15909d[i8]).c());
            if (iCompareTo > 0) {
                return -(i7 + 1);
            }
            if (iCompareTo == 0) {
                return i8;
            }
        }
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int iCompareTo2 = comparable.compareTo(((K3) this.f15909d[i10]).c());
            if (iCompareTo2 < 0) {
                i8 = i10 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        return -(i9 + 1);
    }

    public final Object n(int i7) {
        p();
        Object value = ((K3) this.f15909d[i7]).getValue();
        Object[] objArr = this.f15909d;
        System.arraycopy(objArr, i7 + 1, objArr, i7, (this.f15910e - i7) - 1);
        this.f15910e--;
        if (!this.f15911i.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            Object[] objArr2 = this.f15909d;
            int i8 = this.f15910e;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i8] = new K3(this, (Comparable) entry.getKey(), entry.getValue());
            this.f15910e++;
            it.remove();
        }
        return value;
    }

    private final SortedMap o() {
        p();
        if (this.f15911i.isEmpty() && !(this.f15911i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15911i = treeMap;
            this.f15914y = treeMap.descendingMap();
        }
        return (SortedMap) this.f15911i;
    }

    public final void p() {
        if (this.f15912v) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f15912v) {
            return;
        }
        this.f15911i = this.f15911i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15911i);
        this.f15914y = this.f15914y.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15914y);
        this.f15912v = true;
    }

    public final int c() {
        return this.f15910e;
    }

    @Override
    public final void clear() {
        p();
        if (this.f15910e != 0) {
            this.f15909d = null;
            this.f15910e = 0;
        }
        if (this.f15911i.isEmpty()) {
            return;
        }
        this.f15911i.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m(comparable) >= 0 || this.f15911i.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f15911i.isEmpty() ? Collections.emptySet() : this.f15911i.entrySet();
    }

    @Override
    public final Set entrySet() {
        if (this.f15913w == null) {
            this.f15913w = new M3(this, null);
        }
        return this.f15913w;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O3)) {
            return super.equals(obj);
        }
        O3 o32 = (O3) obj;
        int size = size();
        if (size != o32.size()) {
            return false;
        }
        int i7 = this.f15910e;
        if (i7 != o32.f15910e) {
            return entrySet().equals(o32.entrySet());
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!h(i8).equals(o32.h(i8))) {
                return false;
            }
        }
        if (i7 != size) {
            return this.f15911i.equals(o32.f15911i);
        }
        return true;
    }

    @Override
    public final Object put(Comparable comparable, Object obj) {
        p();
        int iM = m(comparable);
        if (iM >= 0) {
            return ((K3) this.f15909d[iM]).setValue(obj);
        }
        p();
        if (this.f15909d == null) {
            this.f15909d = new Object[16];
        }
        int i7 = -(iM + 1);
        if (i7 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.f15910e == 16) {
            K3 k32 = (K3) this.f15909d[15];
            this.f15910e = 15;
            o().put(k32.c(), k32.getValue());
        }
        Object[] objArr = this.f15909d;
        int length = objArr.length;
        System.arraycopy(objArr, i7, objArr, i7 + 1, 15 - i7);
        this.f15909d[i7] = new K3(this, comparable, obj);
        this.f15910e++;
        return null;
    }

    @Override
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        return iM >= 0 ? ((K3) this.f15909d[iM]).getValue() : this.f15911i.get(comparable);
    }

    public final Map.Entry h(int i7) {
        if (i7 < this.f15910e) {
            return (K3) this.f15909d[i7];
        }
        throw new ArrayIndexOutOfBoundsException(i7);
    }

    @Override
    public final int hashCode() {
        int i7 = this.f15910e;
        int iHashCode = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode += this.f15909d[i8].hashCode();
        }
        return this.f15911i.size() > 0 ? iHashCode + this.f15911i.hashCode() : iHashCode;
    }

    public final boolean k() {
        return this.f15912v;
    }

    @Override
    public final Object remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        if (iM >= 0) {
            return n(iM);
        }
        if (this.f15911i.isEmpty()) {
            return null;
        }
        return this.f15911i.remove(comparable);
    }

    @Override
    public final int size() {
        return this.f15910e + this.f15911i.size();
    }

    O3(N3 n32) {
    }
}
