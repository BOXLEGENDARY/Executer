package com.google.android.gms.measurement.internal;

final class I2 implements Runnable {

    final W3.a f16330d;

    final int f16331e;

    final long f16332i;

    final boolean f16333v;

    final N2 f16334w;

    I2(N2 n22, W3.a aVar, int i7, long j7, boolean z7) {
        this.f16334w = n22;
        this.f16330d = aVar;
        this.f16331e = i7;
        this.f16332i = j7;
        this.f16333v = z7;
    }

    @Override
    public final void run() {
        this.f16334w.K(this.f16330d);
        N2.d0(this.f16334w, this.f16330d, this.f16331e, this.f16332i, false, this.f16333v);
    }
}
