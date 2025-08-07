package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

final class C0 extends AbstractC2057e0 {

    final D0 f15775v;

    C0(D0 d02) {
        this.f15775v = d02;
    }

    @Override
    public final Object get(int i7) {
        C2145t.a(i7, this.f15775v.f15786w, "index");
        int i8 = i7 + i7;
        Object obj = this.f15775v.f15785v[i8];
        Objects.requireNonNull(obj);
        Object obj2 = this.f15775v.f15785v[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final int size() {
        return this.f15775v.f15786w;
    }
}
