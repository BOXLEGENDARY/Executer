package com.google.android.gms.measurement.internal;

import n3.C2651i;

final class RunnableC2196b3 implements Runnable {

    final zzp f16714d;

    final boolean f16715e;

    final zzkv f16716i;

    final C2315z3 f16717v;

    RunnableC2196b3(C2315z3 c2315z3, zzp zzpVar, boolean z7, zzkv zzkvVar) {
        this.f16717v = c2315z3;
        this.f16714d = zzpVar;
        this.f16715e = z7;
        this.f16716i = zzkvVar;
    }

    @Override
    public final void run() {
        W3.d dVar = this.f16717v.f17124d;
        if (dVar == null) {
            this.f16717v.f16818a.b().r().a("Discarding data. Failed to set user property");
            return;
        }
        C2651i.l(this.f16714d);
        this.f16717v.r(dVar, this.f16715e ? null : this.f16716i, this.f16714d);
        this.f16717v.E();
    }
}
