package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class RunnableC2309y2 implements Runnable {

    final AtomicReference f17110d;

    final N2 f17111e;

    RunnableC2309y2(N2 n22, AtomicReference atomicReference) {
        this.f17111e = n22;
        this.f17110d = atomicReference;
    }

    @Override
    public final void run() {
        synchronized (this.f17110d) {
            try {
                try {
                    this.f17110d.set(Boolean.valueOf(this.f17111e.f16818a.z().B(this.f17111e.f16818a.B().s(), Y0.f16591L)));
                } finally {
                    this.f17110d.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
