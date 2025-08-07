package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class RunnableC2118o1 implements Runnable {

    final Future f16105d;

    final InterfaceC2112n1 f16106e;

    RunnableC2118o1(Future future, InterfaceC2112n1 interfaceC2112n1) {
        this.f16105d = future;
        this.f16106e = interfaceC2112n1;
    }

    @Override
    public final void run() {
        Object obj;
        Throwable thA;
        Object obj2 = this.f16105d;
        if ((obj2 instanceof N1) && (thA = O1.a((N1) obj2)) != null) {
            this.f16106e.a(thA);
            return;
        }
        try {
            Future future = this.f16105d;
            if (!future.isDone()) {
                throw new IllegalStateException(C2151u.a("Future was expected to be done: %s", future));
            }
            boolean z7 = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z7 = true;
                } catch (Throwable th) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z7) {
                Thread.currentThread().interrupt();
            }
            this.f16106e.c(obj);
        } catch (ExecutionException e7) {
            this.f16106e.a(e7.getCause());
        } catch (Throwable th2) {
            this.f16106e.a(th2);
        }
    }

    public final String toString() {
        C2122p c2122pA = r.a(this);
        c2122pA.a(this.f16106e);
        return c2122pA.toString();
    }
}
