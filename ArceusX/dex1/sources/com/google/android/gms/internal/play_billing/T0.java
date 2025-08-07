package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class T0 extends P0 {

    final AtomicReferenceFieldUpdater<Z0, Thread> f15936a;

    final AtomicReferenceFieldUpdater<Z0, Z0> f15937b;

    final AtomicReferenceFieldUpdater<? super AbstractC2034a1<?>, Z0> f15938c;

    final AtomicReferenceFieldUpdater<? super AbstractC2034a1<?>, S0> f15939d;

    final AtomicReferenceFieldUpdater<? super AbstractC2034a1<?>, Object> f15940e;

    T0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f15936a = atomicReferenceFieldUpdater;
        this.f15937b = atomicReferenceFieldUpdater2;
        this.f15938c = atomicReferenceFieldUpdater3;
        this.f15939d = atomicReferenceFieldUpdater4;
        this.f15940e = atomicReferenceFieldUpdater5;
    }

    @Override
    final S0 a(AbstractC2034a1 abstractC2034a1, S0 s02) {
        return this.f15939d.getAndSet(abstractC2034a1, s02);
    }

    @Override
    final Z0 b(AbstractC2034a1 abstractC2034a1, Z0 z02) {
        return this.f15938c.getAndSet(abstractC2034a1, z02);
    }

    @Override
    final void c(Z0 z02, Z0 z03) {
        this.f15937b.lazySet(z02, z03);
    }

    @Override
    final void d(Z0 z02, Thread thread) {
        this.f15936a.lazySet(z02, thread);
    }

    @Override
    final boolean e(AbstractC2034a1 abstractC2034a1, S0 s02, S0 s03) {
        return C2040b1.a(this.f15939d, abstractC2034a1, s02, s03);
    }

    @Override
    final boolean f(AbstractC2034a1 abstractC2034a1, Object obj, Object obj2) {
        return C2040b1.a(this.f15940e, abstractC2034a1, obj, obj2);
    }

    @Override
    final boolean g(AbstractC2034a1 abstractC2034a1, Z0 z02, Z0 z03) {
        return C2040b1.a(this.f15938c, abstractC2034a1, z02, z03);
    }
}
