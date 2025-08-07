package com.google.android.gms.measurement.internal;

final class J2 implements Runnable {

    final W3.a f16344d;

    final int f16345e;

    final long f16346i;

    final boolean f16347v;

    final N2 f16348w;

    J2(N2 n22, W3.a aVar, int i7, long j7, boolean z7) {
        this.f16348w = n22;
        this.f16344d = aVar;
        this.f16345e = i7;
        this.f16346i = j7;
        this.f16347v = z7;
    }

    @Override
    public final void run() {
        this.f16348w.K(this.f16344d);
        N2.d0(this.f16348w, this.f16344d, this.f16345e, this.f16346i, false, this.f16347v);
    }
}
