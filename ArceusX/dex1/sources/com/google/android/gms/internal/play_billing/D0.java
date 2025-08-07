package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

final class D0 extends AbstractC2099l0 {

    private final transient AbstractC2075h0 f15784i;

    private final transient Object[] f15785v;

    private final transient int f15786w;

    D0(AbstractC2075h0 abstractC2075h0, Object[] objArr, int i7, int i8) {
        this.f15784i = abstractC2075h0;
        this.f15785v = objArr;
        this.f15786w = i8;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f15784i.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        return j().d(objArr, 0);
    }

    @Override
    public final Iterator iterator() {
        return j().listIterator(0);
    }

    @Override
    public final N0 iterator() {
        return j().listIterator(0);
    }

    @Override
    final AbstractC2057e0 o() {
        return new C0(this);
    }

    @Override
    public final int size() {
        return this.f15786w;
    }
}
