package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class RunnableC2314z2 implements Runnable {

    final AtomicReference f17119d;

    final String f17120e;

    final String f17121i;

    final N2 f17122v;

    RunnableC2314z2(N2 n22, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f17122v = n22;
        this.f17119d = atomicReference;
        this.f17120e = str2;
        this.f17121i = str3;
    }

    @Override
    public final void run() throws IllegalStateException {
        this.f17122v.f16818a.L().U(this.f17119d, null, this.f17120e, this.f17121i);
    }
}
