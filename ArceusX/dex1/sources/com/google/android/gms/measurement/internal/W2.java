package com.google.android.gms.measurement.internal;

final class W2 implements Runnable {

    final long f16555d;

    final Z2 f16556e;

    W2(Z2 z22, long j7) {
        this.f16556e = z22;
        this.f16555d = j7;
    }

    @Override
    public final void run() {
        this.f16556e.f16818a.y().n(this.f16555d);
        this.f16556e.f16670e = null;
    }
}
