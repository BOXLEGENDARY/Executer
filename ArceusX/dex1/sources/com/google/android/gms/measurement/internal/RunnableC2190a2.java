package com.google.android.gms.measurement.internal;

final class RunnableC2190a2 implements Runnable {

    final zzat f16688d;

    final String f16689e;

    final BinderC2220g2 f16690i;

    RunnableC2190a2(BinderC2220g2 binderC2220g2, zzat zzatVar, String str) {
        this.f16690i = binderC2220g2;
        this.f16688d = zzatVar;
        this.f16689e = str;
    }

    @Override
    public final void run() {
        this.f16690i.f16802d.e();
        this.f16690i.f16802d.j(this.f16688d, this.f16689e);
    }
}
