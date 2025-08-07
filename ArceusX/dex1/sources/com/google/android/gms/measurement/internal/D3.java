package com.google.android.gms.measurement.internal;

final class D3 implements Runnable {

    final c4 f16286d;

    final Runnable f16287e;

    D3(E3 e32, c4 c4Var, Runnable runnable) {
        this.f16286d = c4Var;
        this.f16287e = runnable;
    }

    @Override
    public final void run() {
        this.f16286d.e();
        this.f16286d.k0(this.f16287e);
        this.f16286d.A();
    }
}
