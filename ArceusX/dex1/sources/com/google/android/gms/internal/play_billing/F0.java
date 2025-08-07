package com.google.android.gms.internal.play_billing;

import java.util.Objects;

final class F0 extends AbstractC2057e0 {

    private final transient Object[] f15798v;

    private final transient int f15799w;

    private final transient int f15800y;

    F0(Object[] objArr, int i7, int i8) {
        this.f15798v = objArr;
        this.f15799w = i7;
        this.f15800y = i8;
    }

    @Override
    public final Object get(int i7) {
        C2145t.a(i7, this.f15800y, "index");
        Object obj = this.f15798v[i7 + i7 + this.f15799w];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    final boolean l() {
        return true;
    }

    @Override
    public final int size() {
        return this.f15800y;
    }
}
