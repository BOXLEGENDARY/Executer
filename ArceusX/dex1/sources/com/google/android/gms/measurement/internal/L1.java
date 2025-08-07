package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import n3.C2651i;

public final class L1 extends AbstractC2230i2 {

    private static final AtomicLong f16366l = new AtomicLong(Long.MIN_VALUE);

    private K1 f16367c;

    private K1 f16368d;

    private final PriorityBlockingQueue<J1<?>> f16369e;

    private final BlockingQueue<J1<?>> f16370f;

    private final Thread.UncaughtExceptionHandler f16371g;

    private final Thread.UncaughtExceptionHandler f16372h;

    private final Object f16373i;

    private final Semaphore f16374j;

    private volatile boolean f16375k;

    L1(N1 n1) {
        super(n1);
        this.f16373i = new Object();
        this.f16374j = new Semaphore(2);
        this.f16369e = new PriorityBlockingQueue<>();
        this.f16370f = new LinkedBlockingQueue();
        this.f16371g = new I1(this, "Thread death: Uncaught exception on worker thread");
        this.f16372h = new I1(this, "Thread death: Uncaught exception on network thread");
    }

    static boolean B(L1 l1) {
        boolean z7 = l1.f16375k;
        return false;
    }

    private final void D(J1<?> j12) {
        synchronized (this.f16373i) {
            try {
                this.f16369e.add(j12);
                K1 k1 = this.f16367c;
                if (k1 == null) {
                    K1 k12 = new K1(this, "Measurement Worker", this.f16369e);
                    this.f16367c = k12;
                    k12.setUncaughtExceptionHandler(this.f16371g);
                    this.f16367c.start();
                } else {
                    k1.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(Runnable runnable) throws IllegalStateException {
        k();
        C2651i.l(runnable);
        D(new J1<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean C() {
        return Thread.currentThread() == this.f16367c;
    }

    @Override
    public final void g() {
        if (Thread.currentThread() != this.f16368d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override
    public final void h() {
        if (Thread.currentThread() != this.f16367c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override
    protected final boolean j() {
        return false;
    }

    final <T> T r(AtomicReference<T> atomicReference, long j7, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f16818a.a().z(runnable);
            try {
                atomicReference.wait(j7);
            } catch (InterruptedException unused) {
                this.f16818a.b().w().a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t7 = atomicReference.get();
        if (t7 == null) {
            this.f16818a.b().w().a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t7;
    }

    public final <V> Future<V> s(Callable<V> callable) throws IllegalStateException {
        k();
        C2651i.l(callable);
        J1<?> j12 = new J1<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f16367c) {
            if (!this.f16369e.isEmpty()) {
                this.f16818a.b().w().a("Callable skipped the worker queue.");
            }
            j12.run();
        } else {
            D(j12);
        }
        return j12;
    }

    public final <V> Future<V> t(Callable<V> callable) throws IllegalStateException {
        k();
        C2651i.l(callable);
        J1<?> j12 = new J1<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f16367c) {
            j12.run();
        } else {
            D(j12);
        }
        return j12;
    }

    public final void y(Runnable runnable) throws IllegalStateException {
        k();
        C2651i.l(runnable);
        J1<?> j12 = new J1<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f16373i) {
            try {
                this.f16370f.add(j12);
                K1 k1 = this.f16368d;
                if (k1 == null) {
                    K1 k12 = new K1(this, "Measurement Network", this.f16370f);
                    this.f16368d = k12;
                    k12.setUncaughtExceptionHandler(this.f16372h);
                    this.f16368d.start();
                } else {
                    k1.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Runnable runnable) throws IllegalStateException {
        k();
        C2651i.l(runnable);
        D(new J1<>(this, runnable, false, "Task exception on worker thread"));
    }
}
