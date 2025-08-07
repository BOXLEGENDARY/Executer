package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class F2 implements Runnable {

    final AtomicReference f16297d;

    final N2 f16298e;

    F2(N2 n22, AtomicReference atomicReference) {
        this.f16298e = n22;
        this.f16297d = atomicReference;
    }

    @Override
    public final void run() {
        synchronized (this.f16297d) {
            try {
                try {
                    this.f16297d.set(Double.valueOf(this.f16298e.f16818a.z().k(this.f16298e.f16818a.B().s(), Y0.f16595P)));
                } finally {
                    this.f16297d.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
