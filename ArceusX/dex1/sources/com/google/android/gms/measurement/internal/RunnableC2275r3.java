package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1906k0;
import java.util.ArrayList;
import n3.C2651i;

final class RunnableC2275r3 implements Runnable {

    final String f16994d;

    final String f16995e;

    final zzp f16996i;

    final InterfaceC1906k0 f16997v;

    final C2315z3 f16998w;

    RunnableC2275r3(C2315z3 c2315z3, String str, String str2, zzp zzpVar, InterfaceC1906k0 interfaceC1906k0) {
        this.f16998w = c2315z3;
        this.f16994d = str;
        this.f16995e = str2;
        this.f16996i = zzpVar;
        this.f16997v = interfaceC1906k0;
    }

    @Override
    public final void run() {
        N1 n1;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                W3.d dVar = this.f16998w.f17124d;
                if (dVar == null) {
                    this.f16998w.f16818a.b().r().c("Failed to get conditional properties; not connected to service", this.f16994d, this.f16995e);
                    n1 = this.f16998w.f16818a;
                } else {
                    C2651i.l(this.f16996i);
                    arrayList = i4.u(dVar.c3(this.f16994d, this.f16995e, this.f16996i));
                    this.f16998w.E();
                    n1 = this.f16998w.f16818a;
                }
            } catch (RemoteException e7) {
                this.f16998w.f16818a.b().r().d("Failed to get conditional properties; remote exception", this.f16994d, this.f16995e, e7);
                n1 = this.f16998w.f16818a;
            }
            n1.N().D(this.f16997v, arrayList);
        } catch (Throwable th) {
            this.f16998w.f16818a.N().D(this.f16997v, arrayList);
            throw th;
        }
    }
}
