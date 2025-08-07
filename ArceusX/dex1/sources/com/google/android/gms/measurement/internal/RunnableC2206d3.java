package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import n3.C2651i;

final class RunnableC2206d3 implements Runnable {

    final AtomicReference f16765d;

    final zzp f16766e;

    final C2315z3 f16767i;

    RunnableC2206d3(C2315z3 c2315z3, AtomicReference atomicReference, zzp zzpVar) {
        this.f16767i = c2315z3;
        this.f16765d = atomicReference;
        this.f16766e = zzpVar;
    }

    @Override
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f16765d) {
            try {
                try {
                } catch (RemoteException e7) {
                    this.f16767i.f16818a.b().r().b("Failed to get app instance id", e7);
                    atomicReference = this.f16765d;
                }
                if (!this.f16767i.f16818a.F().q().k()) {
                    this.f16767i.f16818a.b().x().a("Analytics storage consent denied; will not get app instance id");
                    this.f16767i.f16818a.I().C(null);
                    this.f16767i.f16818a.F().f17085g.b(null);
                    this.f16765d.set(null);
                    return;
                }
                W3.d dVar = this.f16767i.f17124d;
                if (dVar == null) {
                    this.f16767i.f16818a.b().r().a("Failed to get app instance id");
                    return;
                }
                C2651i.l(this.f16766e);
                this.f16765d.set(dVar.U1(this.f16766e));
                String str = (String) this.f16765d.get();
                if (str != null) {
                    this.f16767i.f16818a.I().C(str);
                    this.f16767i.f16818a.F().f17085g.b(str);
                }
                this.f16767i.E();
                atomicReference = this.f16765d;
                atomicReference.notify();
            } finally {
                this.f16765d.notify();
            }
        }
    }
}
