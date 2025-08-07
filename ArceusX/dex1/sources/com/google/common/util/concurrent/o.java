package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

abstract class o<T> extends AtomicReference<Runnable> implements Runnable {

    private static final Runnable f18968d;

    private static final Runnable f18969e;

    static final class b extends AbstractOwnableSynchronizer implements Runnable {

        private final o<?> f18970d;

        public void b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        @Override
        public void run() {
        }

        public String toString() {
            return this.f18970d.toString();
        }

        private b(o<?> oVar) {
            this.f18970d = oVar;
        }
    }

    private static final class c implements Runnable {
        private c() {
        }

        @Override
        public void run() {
        }
    }

    static {
        f18968d = new c();
        f18969e = new c();
    }

    o() {
    }

    private void g(Thread thread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            boolean z8 = runnable instanceof b;
            if (!z8 && runnable != f18969e) {
                break;
            }
            if (z8) {
                bVar = (b) runnable;
            }
            i7++;
            if (i7 > 1000) {
                Runnable runnable2 = f18969e;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z7 = Thread.interrupted() || z7;
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z7) {
            thread.interrupt();
        }
    }

    abstract void a(Throwable th);

    abstract void b(T t7);

    final void c() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.b(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f18968d) == f18969e) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    abstract boolean d();

    abstract T e() throws Exception;

    abstract String f();

    @Override
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, f18968d)) {
                        g(threadCurrentThread);
                    }
                    if (zD) {
                        return;
                    }
                    a(th);
                    return;
                }
            }
            if (!compareAndSet(threadCurrentThread, f18968d)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(r.a(objE));
        }
    }

    @Override
    public final String toString() {
        String string;
        Runnable runnable = get();
        if (runnable == f18968d) {
            string = "running=[DONE]";
        } else if (runnable instanceof b) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strF = f();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(strF).length());
        sb2.append(string);
        sb2.append(", ");
        sb2.append(strF);
        return sb2.toString();
    }
}
