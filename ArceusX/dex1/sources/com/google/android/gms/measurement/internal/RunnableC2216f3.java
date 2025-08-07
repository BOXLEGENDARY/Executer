package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import n3.C2651i;

final class RunnableC2216f3 implements Runnable {

    final zzp f16788d;

    final C2315z3 f16789e;

    RunnableC2216f3(C2315z3 c2315z3, zzp zzpVar) {
        this.f16789e = c2315z3;
        this.f16788d = zzpVar;
    }

    @Override
    public final void run() {
        W3.d dVar = this.f16789e.f17124d;
        if (dVar == null) {
            this.f16789e.f16818a.b().r().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C2651i.l(this.f16788d);
            dVar.a3(this.f16788d);
            this.f16789e.f16818a.C().t();
            this.f16789e.r(dVar, null, this.f16788d);
            this.f16789e.E();
        } catch (RemoteException e7) {
            this.f16789e.f16818a.b().r().b("Failed to send app launch to the service", e7);
        }
    }
}
