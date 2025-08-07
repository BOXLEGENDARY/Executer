package com.google.android.gms.measurement.internal;

final class RunnableC2210e2 implements Runnable {

    final zzp f16774d;

    final BinderC2220g2 f16775e;

    RunnableC2210e2(BinderC2220g2 binderC2220g2, zzp zzpVar) {
        this.f16775e = binderC2220g2;
        this.f16774d = zzpVar;
    }

    @Override
    public final void run() {
        this.f16775e.f16802d.e();
        this.f16775e.f16802d.p(this.f16774d);
    }
}
