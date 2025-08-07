package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import n3.C2651i;

final class RunnableC2251m3 implements Runnable {

    final zzp f16910d;

    final C2315z3 f16911e;

    RunnableC2251m3(C2315z3 c2315z3, zzp zzpVar) {
        this.f16911e = c2315z3;
        this.f16910d = zzpVar;
    }

    @Override
    public final void run() {
        W3.d dVar = this.f16911e.f17124d;
        if (dVar == null) {
            this.f16911e.f16818a.b().r().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C2651i.l(this.f16910d);
            dVar.r3(this.f16910d);
            this.f16911e.E();
        } catch (RemoteException e7) {
            this.f16911e.f16818a.b().r().b("Failed to send measurementEnabled to the service", e7);
        }
    }
}
