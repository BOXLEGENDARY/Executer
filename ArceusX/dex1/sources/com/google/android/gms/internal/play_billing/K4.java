package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class K4 extends E1 {

    final AtomicReferenceFieldUpdater f15892a;

    final AtomicReferenceFieldUpdater f15893b;

    final AtomicReferenceFieldUpdater f15894c;

    final AtomicReferenceFieldUpdater f15895d;

    final AtomicReferenceFieldUpdater f15896e;

    K4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f15892a = atomicReferenceFieldUpdater;
        this.f15893b = atomicReferenceFieldUpdater2;
        this.f15894c = atomicReferenceFieldUpdater3;
        this.f15895d = atomicReferenceFieldUpdater4;
        this.f15896e = atomicReferenceFieldUpdater5;
    }

    @Override
    final void a(l5 l5Var, l5 l5Var2) {
        this.f15893b.lazySet(l5Var, l5Var2);
    }

    @Override
    final void b(l5 l5Var, Thread thread) {
        this.f15892a.lazySet(l5Var, thread);
    }

    @Override
    final boolean c(n5 n5Var, I3 i32, I3 i33) {
        return C2091j4.a(this.f15895d, n5Var, i32, i33);
    }

    @Override
    final boolean d(n5 n5Var, Object obj, Object obj2) {
        return C2091j4.a(this.f15896e, n5Var, obj, obj2);
    }

    @Override
    final boolean e(n5 n5Var, l5 l5Var, l5 l5Var2) {
        return C2091j4.a(this.f15894c, n5Var, l5Var, l5Var2);
    }
}
