package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import n3.C2651i;

final class RunnableC2201c3 implements Runnable {

    final zzp f16728d;

    final C2315z3 f16729e;

    RunnableC2201c3(C2315z3 c2315z3, zzp zzpVar) {
        this.f16729e = c2315z3;
        this.f16728d = zzpVar;
    }

    @Override
    public final void run() {
        W3.d dVar = this.f16729e.f17124d;
        if (dVar == null) {
            this.f16729e.f16818a.b().r().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C2651i.l(this.f16728d);
            dVar.I1(this.f16728d);
        } catch (RemoteException e7) {
            this.f16729e.f16818a.b().r().b("Failed to reset data on the service: remote exception", e7);
        }
        this.f16729e.E();
    }
}
