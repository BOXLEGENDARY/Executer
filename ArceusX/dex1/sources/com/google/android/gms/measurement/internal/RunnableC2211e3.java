package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1906k0;
import n3.C2651i;

final class RunnableC2211e3 implements Runnable {

    final zzp f16776d;

    final InterfaceC1906k0 f16777e;

    final C2315z3 f16778i;

    RunnableC2211e3(C2315z3 c2315z3, zzp zzpVar, InterfaceC1906k0 interfaceC1906k0) {
        this.f16778i = c2315z3;
        this.f16776d = zzpVar;
        this.f16777e = interfaceC1906k0;
    }

    @Override
    public final void run() {
        N1 n1;
        String strU1 = null;
        try {
            try {
                if (this.f16778i.f16818a.F().q().k()) {
                    W3.d dVar = this.f16778i.f17124d;
                    if (dVar == null) {
                        this.f16778i.f16818a.b().r().a("Failed to get app instance id");
                        n1 = this.f16778i.f16818a;
                    } else {
                        C2651i.l(this.f16776d);
                        strU1 = dVar.U1(this.f16776d);
                        if (strU1 != null) {
                            this.f16778i.f16818a.I().C(strU1);
                            this.f16778i.f16818a.F().f17085g.b(strU1);
                        }
                        this.f16778i.E();
                        n1 = this.f16778i.f16818a;
                    }
                } else {
                    this.f16778i.f16818a.b().x().a("Analytics storage consent denied; will not get app instance id");
                    this.f16778i.f16818a.I().C(null);
                    this.f16778i.f16818a.F().f17085g.b(null);
                    n1 = this.f16778i.f16818a;
                }
            } catch (RemoteException e7) {
                this.f16778i.f16818a.b().r().b("Failed to get app instance id", e7);
                n1 = this.f16778i.f16818a;
            }
            n1.N().I(this.f16777e, strU1);
        } catch (Throwable th) {
            this.f16778i.f16818a.N().I(this.f16777e, null);
            throw th;
        }
    }
}
