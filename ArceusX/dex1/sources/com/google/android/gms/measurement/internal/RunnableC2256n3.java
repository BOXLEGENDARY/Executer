package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import n3.C2651i;

final class RunnableC2256n3 implements Runnable {

    final zzp f16929d;

    final C2315z3 f16930e;

    RunnableC2256n3(C2315z3 c2315z3, zzp zzpVar) {
        this.f16930e = c2315z3;
        this.f16929d = zzpVar;
    }

    @Override
    public final void run() {
        W3.d dVar = this.f16930e.f17124d;
        if (dVar == null) {
            this.f16930e.f16818a.b().r().a("Failed to send consent settings to service");
            return;
        }
        try {
            C2651i.l(this.f16929d);
            dVar.f4(this.f16929d);
            this.f16930e.E();
        } catch (RemoteException e7) {
            this.f16930e.f16818a.b().r().b("Failed to send consent settings to the service", e7);
        }
    }
}
