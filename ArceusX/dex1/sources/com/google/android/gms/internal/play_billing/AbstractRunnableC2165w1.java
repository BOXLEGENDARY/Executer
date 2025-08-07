package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

abstract class AbstractRunnableC2165w1 extends AtomicReference implements Runnable {

    private static final Runnable f16157d = new RunnableC2153u1(null);

    private static final Runnable f16158e = new RunnableC2153u1(null);

    AbstractRunnableC2165w1() {
    }

    private final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC2147t1 runnableC2147t1 = null;
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (!(runnable instanceof RunnableC2147t1)) {
                if (runnable != f16158e) {
                    break;
                }
            } else {
                runnableC2147t1 = (RunnableC2147t1) runnable;
            }
            i7++;
            if (i7 > 1000) {
                Runnable runnable2 = f16158e;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z7 = Thread.interrupted() || z7;
                    LockSupport.park(runnableC2147t1);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z7) {
            thread.interrupt();
        }
    }

    abstract Object a() throws Exception;

    abstract String b();

    abstract void c(Throwable th);

    abstract void d(Object obj);

    final void e() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC2147t1 runnableC2147t1 = new RunnableC2147t1(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, runnableC2147t1)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f16157d)) == f16158e) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f16157d)) == f16158e) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    abstract boolean f();

    @Override
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zF = f();
            if (!zF) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, f16157d)) {
                            g(threadCurrentThread);
                        }
                        c(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f16157d)) {
                            g(threadCurrentThread);
                        }
                        d(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f16157d)) {
                g(threadCurrentThread);
            }
            if (zF) {
                return;
            }
            d(objA);
        }
    }

    @Override
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f16157d) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC2147t1) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
