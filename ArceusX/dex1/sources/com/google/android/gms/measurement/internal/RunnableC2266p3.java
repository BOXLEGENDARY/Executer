package com.google.android.gms.measurement.internal;

import n3.C2651i;

final class RunnableC2266p3 implements Runnable {

    final zzp f16959d;

    final boolean f16960e;

    final zzab f16961i;

    final zzab f16962v;

    final C2315z3 f16963w;

    RunnableC2266p3(C2315z3 c2315z3, boolean z7, zzp zzpVar, boolean z8, zzab zzabVar, zzab zzabVar2) {
        this.f16963w = c2315z3;
        this.f16959d = zzpVar;
        this.f16960e = z8;
        this.f16961i = zzabVar;
        this.f16962v = zzabVar2;
    }

    @Override
    public final void run() {
        W3.d dVar = this.f16963w.f17124d;
        if (dVar == null) {
            this.f16963w.f16818a.b().r().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C2651i.l(this.f16959d);
        this.f16963w.r(dVar, this.f16960e ? null : this.f16961i, this.f16959d);
        this.f16963w.E();
    }
}
