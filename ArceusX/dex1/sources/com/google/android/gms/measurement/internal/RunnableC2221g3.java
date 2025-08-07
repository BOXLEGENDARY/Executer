package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class RunnableC2221g3 implements Runnable {

    final S2 f16805d;

    final C2315z3 f16806e;

    RunnableC2221g3(C2315z3 c2315z3, S2 s22) {
        this.f16806e = c2315z3;
        this.f16805d = s22;
    }

    @Override
    public final void run() {
        W3.d dVar = this.f16806e.f17124d;
        if (dVar == null) {
            this.f16806e.f16818a.b().r().a("Failed to send current screen to service");
            return;
        }
        try {
            S2 s22 = this.f16805d;
            if (s22 == null) {
                dVar.j4(0L, null, null, this.f16806e.f16818a.f().getPackageName());
            } else {
                dVar.j4(s22.f16515c, s22.f16513a, s22.f16514b, this.f16806e.f16818a.f().getPackageName());
            }
            this.f16806e.E();
        } catch (RemoteException e7) {
            this.f16806e.f16818a.b().r().b("Failed to send current screen to the service", e7);
        }
    }
}
