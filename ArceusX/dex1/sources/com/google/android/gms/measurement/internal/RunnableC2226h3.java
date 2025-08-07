package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import n3.C2651i;

final class RunnableC2226h3 implements Runnable {

    final zzp f16819d;

    final Bundle f16820e;

    final C2315z3 f16821i;

    RunnableC2226h3(C2315z3 c2315z3, zzp zzpVar, Bundle bundle) {
        this.f16821i = c2315z3;
        this.f16819d = zzpVar;
        this.f16820e = bundle;
    }

    @Override
    public final void run() {
        W3.d dVar = this.f16821i.f17124d;
        String str = KwdswzaUHE.JVRqC;
        if (dVar == null) {
            this.f16821i.f16818a.b().r().a(str);
            return;
        }
        try {
            C2651i.l(this.f16819d);
            dVar.h1(this.f16820e, this.f16819d);
        } catch (RemoteException e7) {
            this.f16821i.f16818a.b().r().b(str, e7);
        }
    }
}
