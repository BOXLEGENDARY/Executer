package com.google.android.gms.common.api.internal;

final class q implements Runnable {

    final int f14168d;

    final t f14169e;

    q(t tVar, int i7) {
        this.f14169e = tVar;
        this.f14168d = i7;
    }

    @Override
    public final void run() {
        this.f14169e.i(this.f14168d);
    }
}
