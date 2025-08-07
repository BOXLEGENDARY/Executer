package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

final class L3 implements Iterator {

    private int f15899d = -1;

    private boolean f15900e;

    private Iterator f15901i;

    final O3 f15902v;

    L3(O3 o32, N3 n32) {
        this.f15902v = o32;
    }

    private final Iterator a() {
        if (this.f15901i == null) {
            this.f15901i = this.f15902v.f15911i.entrySet().iterator();
        }
        return this.f15901i;
    }

    @Override
    public final boolean hasNext() {
        int i7 = this.f15899d + 1;
        O3 o32 = this.f15902v;
        if (i7 >= o32.f15910e) {
            return !o32.f15911i.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override
    public final Object next() {
        this.f15900e = true;
        int i7 = this.f15899d + 1;
        this.f15899d = i7;
        O3 o32 = this.f15902v;
        return i7 < o32.f15910e ? (K3) o32.f15909d[i7] : (Map.Entry) a().next();
    }

    @Override
    public final void remove() {
        if (!this.f15900e) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f15900e = false;
        this.f15902v.p();
        int i7 = this.f15899d;
        O3 o32 = this.f15902v;
        if (i7 >= o32.f15910e) {
            a().remove();
        } else {
            this.f15899d = i7 - 1;
            o32.n(i7);
        }
    }
}
