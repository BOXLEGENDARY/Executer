package com.google.android.gms.measurement.internal;

final class G3 implements Runnable {

    final long f16307d;

    final O3 f16308e;

    G3(O3 o32, long j7) {
        this.f16308e = o32;
        this.f16307d = j7;
    }

    @Override
    public final void run() {
        O3.q(this.f16308e, this.f16307d);
    }
}
