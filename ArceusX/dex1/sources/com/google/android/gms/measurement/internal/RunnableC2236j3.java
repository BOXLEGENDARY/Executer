package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1906k0;

final class RunnableC2236j3 implements Runnable {

    final zzat f16856d;

    final String f16857e;

    final InterfaceC1906k0 f16858i;

    final C2315z3 f16859v;

    RunnableC2236j3(C2315z3 c2315z3, zzat zzatVar, String str, InterfaceC1906k0 interfaceC1906k0) {
        this.f16859v = c2315z3;
        this.f16856d = zzatVar;
        this.f16857e = str;
        this.f16858i = interfaceC1906k0;
    }

    @Override
    public final void run() {
        N1 n1;
        byte[] bArrN2 = null;
        try {
            try {
                W3.d dVar = this.f16859v.f17124d;
                if (dVar == null) {
                    this.f16859v.f16818a.b().r().a("Discarding data. Failed to send event to service to bundle");
                    n1 = this.f16859v.f16818a;
                } else {
                    bArrN2 = dVar.N2(this.f16856d, this.f16857e);
                    this.f16859v.E();
                    n1 = this.f16859v.f16818a;
                }
            } catch (RemoteException e7) {
                this.f16859v.f16818a.b().r().b("Failed to send event to the service to bundle", e7);
                n1 = this.f16859v.f16818a;
            }
            n1.N().F(this.f16858i, bArrN2);
        } catch (Throwable th) {
            this.f16859v.f16818a.N().F(this.f16858i, bArrN2);
            throw th;
        }
    }
}
