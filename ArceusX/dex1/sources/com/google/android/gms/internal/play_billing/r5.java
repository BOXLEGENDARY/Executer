package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class r5 implements InterfaceFutureC2177y1 {

    final WeakReference f16145d;

    private final n5 f16146e = new q5(this);

    r5(o5 o5Var) {
        this.f16145d = new WeakReference(o5Var);
    }

    final boolean a(Object obj) {
        return this.f16146e.d(obj);
    }

    final boolean b(Throwable th) {
        C2078h3 c2078h3 = new C2078h3(th);
        E1 e12 = n5.f16097y;
        n5 n5Var = this.f16146e;
        if (!e12.d(n5Var, null, c2078h3)) {
            return false;
        }
        n5.b(n5Var);
        return true;
    }

    @Override
    public final boolean cancel(boolean z7) {
        o5 o5Var = (o5) this.f16145d.get();
        boolean zCancel = this.f16146e.cancel(z7);
        if (!zCancel || o5Var == null) {
            return zCancel;
        }
        o5Var.a();
        return true;
    }

    @Override
    public final void f(Runnable runnable, Executor executor) {
        this.f16146e.f(runnable, executor);
    }

    @Override
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f16146e.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f16146e.f16099d instanceof C2065f2;
    }

    @Override
    public final boolean isDone() {
        return this.f16146e.isDone();
    }

    public final String toString() {
        return this.f16146e.toString();
    }

    @Override
    public final Object get(long j7, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f16146e.get(j7, timeUnit);
    }
}
