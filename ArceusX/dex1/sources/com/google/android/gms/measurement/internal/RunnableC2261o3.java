package com.google.android.gms.measurement.internal;

import n3.C2651i;

final class RunnableC2261o3 implements Runnable {

    final zzp f16945d;

    final boolean f16946e;

    final zzat f16947i;

    final String f16948v;

    final C2315z3 f16949w;

    RunnableC2261o3(C2315z3 c2315z3, boolean z7, zzp zzpVar, boolean z8, zzat zzatVar, String str) {
        this.f16949w = c2315z3;
        this.f16945d = zzpVar;
        this.f16946e = z8;
        this.f16947i = zzatVar;
        this.f16948v = str;
    }

    @Override
    public final void run() {
        W3.d dVar = this.f16949w.f17124d;
        if (dVar == null) {
            this.f16949w.f16818a.b().r().a("Discarding data. Failed to send event to service");
            return;
        }
        C2651i.l(this.f16945d);
        this.f16949w.r(dVar, this.f16946e ? null : this.f16947i, this.f16945d);
        this.f16949w.E();
    }
}
