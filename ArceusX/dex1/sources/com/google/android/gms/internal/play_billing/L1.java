package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;

final class L1 extends AbstractRunnableC2165w1 {

    private final Callable f15897i;

    final M1 f15898v;

    L1(M1 m1, Callable callable) {
        this.f15898v = m1;
        callable.getClass();
        this.f15897i = callable;
    }

    @Override
    final Object a() throws Exception {
        return this.f15897i.call();
    }

    @Override
    final String b() {
        return this.f15897i.toString();
    }

    @Override
    final void c(Throwable th) {
        this.f15898v.p(th);
    }

    @Override
    final void d(Object obj) {
        this.f15898v.o(obj);
    }

    @Override
    final boolean f() {
        return this.f15898v.isDone();
    }
}
