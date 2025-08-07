package com.google.android.gms.measurement.internal;

import n3.C2651i;

final class X1 implements Runnable {

    final zzp f16568d;

    final BinderC2220g2 f16569e;

    X1(BinderC2220g2 binderC2220g2, zzp zzpVar) {
        this.f16569e = binderC2220g2;
        this.f16568d = zzpVar;
    }

    @Override
    public final void run() {
        this.f16569e.f16802d.e();
        c4 c4Var = this.f16569e.f16802d;
        zzp zzpVar = this.f16568d;
        c4Var.a().h();
        c4Var.g();
        C2651i.f(zzpVar.f17168d);
        c4Var.R(zzpVar);
    }
}
