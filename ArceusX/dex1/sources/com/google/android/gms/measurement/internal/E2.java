package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class E2 implements Runnable {

    final AtomicReference f16291d;

    final N2 f16292e;

    E2(N2 n22, AtomicReference atomicReference) {
        this.f16292e = n22;
        this.f16291d = atomicReference;
    }

    @Override
    public final void run() {
        synchronized (this.f16291d) {
            try {
                try {
                    this.f16291d.set(Integer.valueOf(this.f16292e.f16818a.z().o(this.f16292e.f16818a.B().s(), Y0.f16594O)));
                } finally {
                    this.f16291d.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
