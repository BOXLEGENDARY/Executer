package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class C2 implements Runnable {

    final AtomicReference f16275d;

    final N2 f16276e;

    C2(N2 n22, AtomicReference atomicReference) {
        this.f16276e = n22;
        this.f16275d = atomicReference;
    }

    @Override
    public final void run() {
        synchronized (this.f16275d) {
            try {
                try {
                    this.f16275d.set(this.f16276e.f16818a.z().x(this.f16276e.f16818a.B().s(), Y0.f16592M));
                } finally {
                    this.f16275d.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
