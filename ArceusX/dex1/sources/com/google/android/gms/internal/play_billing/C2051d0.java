package com.google.android.gms.internal.play_billing;

import java.util.List;

final class C2051d0 extends AbstractC2057e0 {

    final transient int f16001v;

    final transient int f16002w;

    final AbstractC2057e0 f16003y;

    C2051d0(AbstractC2057e0 abstractC2057e0, int i7, int i8) {
        this.f16003y = abstractC2057e0;
        this.f16001v = i7;
        this.f16002w = i8;
    }

    @Override
    final int e() {
        return this.f16003y.g() + this.f16001v + this.f16002w;
    }

    @Override
    final int g() {
        return this.f16003y.g() + this.f16001v;
    }

    @Override
    public final Object get(int i7) {
        C2145t.a(i7, this.f16002w, "index");
        return this.f16003y.get(i7 + this.f16001v);
    }

    @Override
    final boolean l() {
        return true;
    }

    @Override
    final Object[] m() {
        return this.f16003y.m();
    }

    @Override
    public final AbstractC2057e0 subList(int i7, int i8) {
        C2145t.e(i7, i8, this.f16002w);
        int i9 = this.f16001v;
        return this.f16003y.subList(i7 + i9, i8 + i9);
    }

    @Override
    public final int size() {
        return this.f16002w;
    }

    @Override
    public final List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
