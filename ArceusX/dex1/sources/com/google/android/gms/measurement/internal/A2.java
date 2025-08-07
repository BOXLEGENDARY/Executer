package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class A2 implements Runnable {

    final AtomicReference f16248d;

    final String f16249e;

    final String f16250i;

    final boolean f16251v;

    final N2 f16252w;

    A2(N2 n22, AtomicReference atomicReference, String str, String str2, String str3, boolean z7) {
        this.f16252w = n22;
        this.f16248d = atomicReference;
        this.f16249e = str2;
        this.f16250i = str3;
        this.f16251v = z7;
    }

    @Override
    public final void run() throws IllegalStateException {
        this.f16252w.f16818a.L().W(this.f16248d, null, this.f16249e, this.f16250i, this.f16251v);
    }
}
