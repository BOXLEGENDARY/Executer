package com.google.android.gms.measurement.internal;

final class Z implements Runnable {

    final long f16663d;

    final A0 f16664e;

    Z(A0 a02, long j7) {
        this.f16664e = a02;
        this.f16663d = j7;
    }

    @Override
    public final void run() {
        this.f16664e.q(this.f16663d);
    }
}
