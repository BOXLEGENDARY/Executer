package com.google.android.gms.measurement.internal;

final class X2 implements Runnable {

    final S2 f16570d;

    final long f16571e;

    final Z2 f16572i;

    X2(Z2 z22, S2 s22, long j7) {
        this.f16572i = z22;
        this.f16570d = s22;
        this.f16571e = j7;
    }

    @Override
    public final void run() {
        this.f16572i.q(this.f16570d, false, this.f16571e);
        Z2 z22 = this.f16572i;
        z22.f16670e = null;
        z22.f16818a.L().u(null);
    }
}
