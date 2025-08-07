package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class C1965r4<K, V> extends LinkedHashMap<K, V> {

    private static final C1965r4 f15297e;

    private boolean f15298d;

    static {
        C1965r4 c1965r4 = new C1965r4();
        f15297e = c1965r4;
        c1965r4.f15298d = false;
    }

    private C1965r4() {
        this.f15298d = true;
    }

    public static <K, V> C1965r4<K, V> a() {
        return f15297e;
    }

    private static int h(Object obj) {
        return obj instanceof byte[] ? C1838b4.b((byte[]) obj) : obj.hashCode();
    }

    private final void i() {
        if (!this.f15298d) {
            throw new UnsupportedOperationException();
        }
    }

    public final C1965r4<K, V> b() {
        return isEmpty() ? new C1965r4<>() : new C1965r4<>(this);
    }

    public final void c() {
        this.f15298d = false;
    }

    @Override
    public final void clear() {
        i();
        super.clear();
    }

    public final void d(C1965r4<K, V> c1965r4) {
        i();
        if (c1965r4.isEmpty()) {
            return;
        }
        putAll(c1965r4);
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return this.f15298d;
    }

    @Override
    public final int hashCode() {
        int iH = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iH += h(entry.getValue()) ^ h(entry.getKey());
        }
        return iH;
    }

    @Override
    public final V put(K k7, V v7) {
        i();
        C1838b4.e(k7);
        C1838b4.e(v7);
        return (V) super.put(k7, v7);
    }

    @Override
    public final void putAll(Map<? extends K, ? extends V> map) {
        i();
        for (K k7 : map.keySet()) {
            C1838b4.e(k7);
            C1838b4.e(map.get(k7));
        }
        super.putAll(map);
    }

    @Override
    public final V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }

    private C1965r4(Map<K, V> map) {
        super(map);
        this.f15298d = true;
    }
}
