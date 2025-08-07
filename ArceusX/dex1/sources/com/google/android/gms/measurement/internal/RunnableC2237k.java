package com.google.android.gms.measurement.internal;

final class RunnableC2237k implements Runnable {

    final InterfaceC2235j2 f16864d;

    final AbstractC2242l f16865e;

    RunnableC2237k(AbstractC2242l abstractC2242l, InterfaceC2235j2 interfaceC2235j2) {
        this.f16865e = abstractC2242l;
        this.f16864d = interfaceC2235j2;
    }

    @Override
    public final void run() throws IllegalStateException {
        this.f16864d.d();
        if (C2192b.a()) {
            this.f16864d.a().z(this);
            return;
        }
        boolean zE = this.f16865e.e();
        this.f16865e.f16882c = 0L;
        if (zE) {
            this.f16865e.c();
        }
    }
}
