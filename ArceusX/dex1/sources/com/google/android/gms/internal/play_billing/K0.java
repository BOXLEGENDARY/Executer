package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

final class K0 extends AbstractC2099l0 {

    final transient Object f15883i;

    K0(Object obj) {
        obj.getClass();
        this.f15883i = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f15883i.equals(obj);
    }

    @Override
    final int d(Object[] objArr, int i7) {
        objArr[0] = this.f15883i;
        return 1;
    }

    @Override
    public final int hashCode() {
        return this.f15883i.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new C2123p0(this.f15883i);
    }

    @Override
    public final AbstractC2057e0 j() {
        return AbstractC2057e0.s(this.f15883i);
    }

    @Override
    public final N0 iterator() {
        return new C2123p0(this.f15883i);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return "[" + this.f15883i.toString() + "]";
    }
}
