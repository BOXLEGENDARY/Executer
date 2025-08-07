package com.google.android.gms.internal.play_billing;

import java.util.Objects;

final class B0 extends AbstractC2057e0 {

    static final AbstractC2057e0 f15769y = new B0(new Object[0], 0);

    final transient Object[] f15770v;

    private final transient int f15771w;

    B0(Object[] objArr, int i7) {
        this.f15770v = objArr;
        this.f15771w = i7;
    }

    @Override
    final int d(Object[] objArr, int i7) {
        System.arraycopy(this.f15770v, 0, objArr, 0, this.f15771w);
        return this.f15771w;
    }

    @Override
    final int e() {
        return this.f15771w;
    }

    @Override
    final int g() {
        return 0;
    }

    @Override
    public final Object get(int i7) {
        C2145t.a(i7, this.f15771w, "index");
        Object obj = this.f15770v[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    final boolean l() {
        return false;
    }

    @Override
    final Object[] m() {
        return this.f15770v;
    }

    @Override
    public final int size() {
        return this.f15771w;
    }
}
