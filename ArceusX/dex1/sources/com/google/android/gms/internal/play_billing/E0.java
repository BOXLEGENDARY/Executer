package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

final class E0 extends AbstractC2099l0 {

    private final transient AbstractC2075h0 f15792i;

    private final transient AbstractC2057e0 f15793v;

    E0(AbstractC2075h0 abstractC2075h0, AbstractC2057e0 abstractC2057e0) {
        this.f15792i = abstractC2075h0;
        this.f15793v = abstractC2057e0;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f15792i.get(obj) != null;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        return this.f15793v.d(objArr, 0);
    }

    @Override
    public final Iterator iterator() {
        return this.f15793v.listIterator(0);
    }

    @Override
    public final AbstractC2057e0 j() {
        return this.f15793v;
    }

    @Override
    public final N0 iterator() {
        return this.f15793v.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f15792i.size();
    }
}
