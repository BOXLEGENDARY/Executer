package com.google.common.util.concurrent;

import com.google.common.util.concurrent.a;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class f<OutputT> extends a.j<OutputT> {

    private static final b f18953C;

    private static final Logger f18954D = Logger.getLogger(f.class.getName());

    private volatile Set<Throwable> f18955A = null;

    private volatile int f18956B;

    private static abstract class b {
        private b() {
        }

        abstract void a(f<?> fVar, Set<Throwable> set, Set<Throwable> set2);

        abstract int b(f<?> fVar);
    }

    private static final class c extends b {

        final AtomicReferenceFieldUpdater<f<?>, Set<Throwable>> f18957a;

        final AtomicIntegerFieldUpdater<f<?>> f18958b;

        c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f18957a = atomicReferenceFieldUpdater;
            this.f18958b = atomicIntegerFieldUpdater;
        }

        @Override
        void a(f<?> fVar, Set<Throwable> set, Set<Throwable> set2) {
            androidx.concurrent.futures.b.a(this.f18957a, fVar, set, set2);
        }

        @Override
        int b(f<?> fVar) {
            return this.f18958b.decrementAndGet(fVar);
        }
    }

    private static final class d extends b {
        private d() {
            super();
        }

        @Override
        void a(f<?> fVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (fVar) {
                try {
                    if (((f) fVar).f18955A == set) {
                        ((f) fVar).f18955A = set2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        int b(f<?> fVar) {
            int iJ;
            synchronized (fVar) {
                iJ = f.J(fVar);
            }
            return iJ;
        }
    }

    static {
        b dVar;
        Throwable th = null;
        Object[] objArr = 0;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(f.class, Set.class, "A"), AtomicIntegerFieldUpdater.newUpdater(f.class, "B"));
        } catch (Throwable th2) {
            dVar = new d();
            th = th2;
        }
        f18953C = dVar;
        if (th != null) {
            f18954D.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    f(int i7) {
        this.f18956B = i7;
    }

    static int J(f fVar) {
        int i7 = fVar.f18956B - 1;
        fVar.f18956B = i7;
        return i7;
    }

    abstract void K(Set<Throwable> set);

    final void L() {
        this.f18955A = null;
    }

    final int M() {
        return f18953C.b(this);
    }

    final Set<Throwable> N() {
        Set<Throwable> set = this.f18955A;
        if (set != null) {
            return set;
        }
        Set<Throwable> setA = L4.i.a();
        K(setA);
        f18953C.a(this, null, setA);
        Set<Throwable> set2 = this.f18955A;
        Objects.requireNonNull(set2);
        return set2;
    }
}
