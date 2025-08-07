package com.google.android.gms.measurement.internal;

final class G2 implements Runnable {

    final Boolean f16305d;

    final N2 f16306e;

    G2(N2 n22, Boolean bool) {
        this.f16306e = n22;
        this.f16305d = bool;
    }

    @Override
    public final void run() throws IllegalStateException {
        this.f16306e.Q(this.f16305d, true);
    }
}
