package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.E6;

final class Z1 implements Runnable {

    final zzat f16665d;

    final zzp f16666e;

    final BinderC2220g2 f16667i;

    Z1(BinderC2220g2 binderC2220g2, zzat zzatVar, zzp zzpVar) {
        this.f16667i = binderC2220g2;
        this.f16665d = zzatVar;
        this.f16666e = zzpVar;
    }

    @Override
    public final void run() {
        zzat zzatVarH3 = this.f16667i.h3(this.f16665d, this.f16666e);
        E6.b();
        if (this.f16667i.f16802d.T().B(null, Y0.f16649v0)) {
            this.f16667i.w6(zzatVarH3, this.f16666e);
        } else {
            this.f16667i.V0(zzatVarH3, this.f16666e);
        }
    }
}
