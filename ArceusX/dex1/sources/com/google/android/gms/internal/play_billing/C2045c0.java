package com.google.android.gms.internal.play_billing;

import java.util.List;

final class C2045c0 extends AbstractC2057e0 {

    private final transient AbstractC2057e0 f15997v;

    C2045c0(AbstractC2057e0 abstractC2057e0) {
        this.f15997v = abstractC2057e0;
    }

    private final int v(int i7) {
        return (this.f15997v.size() - 1) - i7;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f15997v.contains(obj);
    }

    @Override
    public final Object get(int i7) {
        C2145t.a(i7, this.f15997v.size(), "index");
        return this.f15997v.get(v(i7));
    }

    @Override
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f15997v.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return v(iLastIndexOf);
        }
        return -1;
    }

    @Override
    final boolean l() {
        return this.f15997v.l();
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f15997v.indexOf(obj);
        if (iIndexOf >= 0) {
            return v(iIndexOf);
        }
        return -1;
    }

    @Override
    public final AbstractC2057e0 n() {
        return this.f15997v;
    }

    @Override
    public final AbstractC2057e0 subList(int i7, int i8) {
        C2145t.e(i7, i8, this.f15997v.size());
        AbstractC2057e0 abstractC2057e0 = this.f15997v;
        return abstractC2057e0.subList(abstractC2057e0.size() - i8, this.f15997v.size() - i7).n();
    }

    @Override
    public final int size() {
        return this.f15997v.size();
    }

    @Override
    public final List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
