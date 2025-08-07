package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class D2 implements Runnable {

    final AtomicReference f16284d;

    final N2 f16285e;

    D2(N2 n22, AtomicReference atomicReference) {
        this.f16285e = n22;
        this.f16284d = atomicReference;
    }

    @Override
    public final void run() {
        synchronized (this.f16284d) {
            try {
                try {
                    this.f16284d.set(Long.valueOf(this.f16285e.f16818a.z().r(this.f16285e.f16818a.B().s(), Y0.f16593N)));
                } finally {
                    this.f16284d.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
