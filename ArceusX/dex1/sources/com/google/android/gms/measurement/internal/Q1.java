package com.google.android.gms.measurement.internal;

final class Q1 implements Runnable {

    final zzab f16468d;

    final BinderC2220g2 f16469e;

    Q1(BinderC2220g2 binderC2220g2, zzab zzabVar) {
        this.f16469e = binderC2220g2;
        this.f16468d = zzabVar;
    }

    @Override
    public final void run() {
        this.f16469e.f16802d.e();
        if (this.f16468d.f17136i.l() == null) {
            this.f16469e.f16802d.r(this.f16468d);
        } else {
            this.f16469e.f16802d.w(this.f16468d);
        }
    }
}
