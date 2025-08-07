package com.google.android.gms.measurement.internal;

final class V3 implements Runnable {

    final d4 f16549d;

    final c4 f16550e;

    V3(c4 c4Var, d4 d4Var) {
        this.f16550e = c4Var;
        this.f16549d = d4Var;
    }

    @Override
    public final void run() {
        c4.j0(this.f16550e, this.f16549d);
        this.f16550e.v();
    }
}
