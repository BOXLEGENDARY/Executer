package com.google.android.gms.internal.play_billing;

final class U0<V> implements Runnable {

    final AbstractC2034a1<V> f15948d;

    final InterfaceFutureC2177y1<? extends V> f15949e;

    U0(AbstractC2034a1 abstractC2034a1, InterfaceFutureC2177y1 interfaceFutureC2177y1) {
        this.f15948d = abstractC2034a1;
        this.f15949e = interfaceFutureC2177y1;
    }

    @Override
    public final void run() {
        if (((AbstractC2034a1) this.f15948d).f15991d != this) {
            return;
        }
        InterfaceFutureC2177y1<? extends V> interfaceFutureC2177y1 = this.f15949e;
        if (AbstractC2034a1.f15989y.f(this.f15948d, this, AbstractC2034a1.s(interfaceFutureC2177y1))) {
            AbstractC2034a1.x(this.f15948d, false);
        }
    }
}
