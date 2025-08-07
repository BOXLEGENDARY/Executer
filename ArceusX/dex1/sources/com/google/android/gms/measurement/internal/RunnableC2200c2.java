package com.google.android.gms.measurement.internal;

final class RunnableC2200c2 implements Runnable {

    final zzkv f16725d;

    final zzp f16726e;

    final BinderC2220g2 f16727i;

    RunnableC2200c2(BinderC2220g2 binderC2220g2, zzkv zzkvVar, zzp zzpVar) {
        this.f16727i = binderC2220g2;
        this.f16725d = zzkvVar;
        this.f16726e = zzpVar;
    }

    @Override
    public final void run() {
        this.f16727i.f16802d.e();
        if (this.f16725d.l() == null) {
            this.f16727i.f16802d.t(this.f16725d, this.f16726e);
        } else {
            this.f16727i.f16802d.z(this.f16725d, this.f16726e);
        }
    }
}
