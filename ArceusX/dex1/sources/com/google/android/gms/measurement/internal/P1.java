package com.google.android.gms.measurement.internal;

final class P1 implements Runnable {

    final zzab f16457d;

    final zzp f16458e;

    final BinderC2220g2 f16459i;

    P1(BinderC2220g2 binderC2220g2, zzab zzabVar, zzp zzpVar) {
        this.f16459i = binderC2220g2;
        this.f16457d = zzabVar;
        this.f16458e = zzpVar;
    }

    @Override
    public final void run() {
        this.f16459i.f16802d.e();
        if (this.f16457d.f17136i.l() == null) {
            this.f16459i.f16802d.s(this.f16457d, this.f16458e);
        } else {
            this.f16459i.f16802d.x(this.f16457d, this.f16458e);
        }
    }
}
