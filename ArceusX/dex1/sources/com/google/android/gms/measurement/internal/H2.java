package com.google.android.gms.measurement.internal;

final class H2 implements Runnable {

    final W3.a f16319d;

    final long f16320e;

    final int f16321i;

    final long f16322v;

    final boolean f16323w;

    final N2 f16324y;

    H2(N2 n22, W3.a aVar, long j7, int i7, long j8, boolean z7) {
        this.f16324y = n22;
        this.f16319d = aVar;
        this.f16320e = j7;
        this.f16321i = i7;
        this.f16322v = j8;
        this.f16323w = z7;
    }

    @Override
    public final void run() {
        this.f16324y.K(this.f16319d);
        this.f16324y.z(this.f16320e, false);
        N2.d0(this.f16324y, this.f16319d, this.f16321i, this.f16322v, true, this.f16323w);
    }
}
