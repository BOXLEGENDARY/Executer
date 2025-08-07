package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class C1986u1 extends Q3<C1994v1, C1986u1> implements InterfaceC2029z4 {
    private C1986u1() {
        super(C1994v1.zza);
    }

    public final int s() {
        return ((C1994v1) this.f15008e).x();
    }

    public final C1978t1 t(int i7) {
        return ((C1994v1) this.f15008e).z(i7);
    }

    public final C1986u1 v() {
        if (this.f15009i) {
            o();
            this.f15009i = false;
        }
        ((C1994v1) this.f15008e).zzk = T3.k();
        return this;
    }

    public final C1986u1 w(int i7, C1962r1 c1962r1) {
        if (this.f15009i) {
            o();
            this.f15009i = false;
        }
        C1994v1.I((C1994v1) this.f15008e, i7, c1962r1.l());
        return this;
    }

    public final List<Z0> x() {
        return Collections.unmodifiableList(((C1994v1) this.f15008e).F());
    }

    C1986u1(C1955q1 c1955q1) {
        super(C1994v1.zza);
    }
}
