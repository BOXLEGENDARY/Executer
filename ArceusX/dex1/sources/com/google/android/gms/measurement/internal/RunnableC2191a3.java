package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1906k0;
import java.util.List;
import n3.C2651i;

final class RunnableC2191a3 implements Runnable {

    final String f16691d;

    final String f16692e;

    final zzp f16693i;

    final boolean f16694v;

    final InterfaceC1906k0 f16695w;

    final C2315z3 f16696y;

    RunnableC2191a3(C2315z3 c2315z3, String str, String str2, zzp zzpVar, boolean z7, InterfaceC1906k0 interfaceC1906k0) {
        this.f16696y = c2315z3;
        this.f16691d = str;
        this.f16692e = str2;
        this.f16693i = zzpVar;
        this.f16694v = z7;
        this.f16695w = interfaceC1906k0;
    }

    @Override
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e7;
        Bundle bundle2 = new Bundle();
        try {
            try {
                W3.d dVar = this.f16696y.f17124d;
                if (dVar == null) {
                    this.f16696y.f16818a.b().r().c("Failed to get user properties; not connected to service", this.f16691d, this.f16692e);
                    this.f16696y.f16818a.N().E(this.f16695w, bundle2);
                    return;
                }
                C2651i.l(this.f16693i);
                List<zzkv> listR4 = dVar.r4(this.f16691d, this.f16692e, this.f16694v, this.f16693i);
                bundle = new Bundle();
                if (listR4 != null) {
                    for (zzkv zzkvVar : listR4) {
                        String str = zzkvVar.f17150w;
                        if (str != null) {
                            bundle.putString(zzkvVar.f17147e, str);
                        } else {
                            Long l7 = zzkvVar.f17149v;
                            if (l7 != null) {
                                bundle.putLong(zzkvVar.f17147e, l7.longValue());
                            } else {
                                Double d7 = zzkvVar.f17152z;
                                if (d7 != null) {
                                    bundle.putDouble(zzkvVar.f17147e, d7.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.f16696y.E();
                    this.f16696y.f16818a.N().E(this.f16695w, bundle);
                } catch (RemoteException e8) {
                    e7 = e8;
                    this.f16696y.f16818a.b().r().c("Failed to get user properties; remote exception", this.f16691d, e7);
                    this.f16696y.f16818a.N().E(this.f16695w, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.f16696y.f16818a.N().E(this.f16695w, bundle2);
                throw th;
            }
        } catch (RemoteException e9) {
            bundle = bundle2;
            e7 = e9;
        } catch (Throwable th2) {
            th = th2;
            this.f16696y.f16818a.N().E(this.f16695w, bundle2);
            throw th;
        }
    }
}
