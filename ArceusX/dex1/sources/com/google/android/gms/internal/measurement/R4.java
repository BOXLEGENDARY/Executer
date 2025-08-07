package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class R4 implements Iterator<Map.Entry> {

    private int f15016d = -1;

    private boolean f15017e;

    private Iterator<Map.Entry> f15018i;

    final T4 f15019v;

    R4(T4 t42, M4 m42) {
        this.f15019v = t42;
    }

    private final Iterator<Map.Entry> a() {
        if (this.f15018i == null) {
            this.f15018i = this.f15019v.f15038i.entrySet().iterator();
        }
        return this.f15018i;
    }

    @Override
    public final boolean hasNext() {
        if (this.f15016d + 1 >= this.f15019v.f15037e.size()) {
            return !this.f15019v.f15038i.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override
    public final Map.Entry next() {
        this.f15017e = true;
        int i7 = this.f15016d + 1;
        this.f15016d = i7;
        return i7 < this.f15019v.f15037e.size() ? (Map.Entry) this.f15019v.f15037e.get(this.f15016d) : a().next();
    }

    @Override
    public final void remove() {
        if (!this.f15017e) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f15017e = false;
        this.f15019v.o();
        if (this.f15016d >= this.f15019v.f15037e.size()) {
            a().remove();
            return;
        }
        T4 t42 = this.f15019v;
        int i7 = this.f15016d;
        this.f15016d = i7 - 1;
        t42.m(i7);
    }
}
