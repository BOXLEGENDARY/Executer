package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class RunnableC2294v2 implements Runnable {

    final long f17066d;

    final N2 f17067e;

    RunnableC2294v2(N2 n22, long j7) {
        this.f17067e = n22;
        this.f17066d = j7;
    }

    @Override
    public final void run() {
        this.f17067e.z(this.f17066d, true);
        this.f17067e.f16818a.L().S(new AtomicReference<>());
    }
}
