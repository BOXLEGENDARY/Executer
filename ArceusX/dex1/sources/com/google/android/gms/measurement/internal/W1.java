package com.google.android.gms.measurement.internal;

final class W1 implements Runnable {

    final zzp f16553d;

    final BinderC2220g2 f16554e;

    W1(BinderC2220g2 binderC2220g2, zzp zzpVar) {
        this.f16554e = binderC2220g2;
        this.f16553d = zzpVar;
    }

    @Override
    public final void run() {
        this.f16554e.f16802d.e();
        this.f16554e.f16802d.u(this.f16553d);
    }
}
