package com.google.android.gms.measurement.internal;

final class F3 implements Runnable {

    final long f16299d;

    final O3 f16300e;

    F3(O3 o32, long j7) {
        this.f16300e = o32;
        this.f16299d = j7;
    }

    @Override
    public final void run() {
        O3.r(this.f16300e, this.f16299d);
    }
}
