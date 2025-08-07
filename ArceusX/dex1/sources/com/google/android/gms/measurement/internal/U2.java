package com.google.android.gms.measurement.internal;

import java.lang.reflect.InvocationTargetException;

final class U2 implements Runnable {

    final S2 f16538d;

    final S2 f16539e;

    final long f16540i;

    final boolean f16541v;

    final Z2 f16542w;

    U2(Z2 z22, S2 s22, S2 s23, long j7, boolean z7) {
        this.f16542w = z22;
        this.f16538d = s22;
        this.f16539e = s23;
        this.f16540i = j7;
        this.f16541v = z7;
    }

    @Override
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f16542w.p(this.f16538d, this.f16539e, this.f16540i, this.f16541v, null);
    }
}
