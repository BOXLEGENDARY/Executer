package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import n3.C2651i;

final class RunnableC2271q3 implements Runnable {

    final AtomicReference f16978d;

    final String f16979e;

    final String f16980i;

    final zzp f16981v;

    final C2315z3 f16982w;

    RunnableC2271q3(C2315z3 c2315z3, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar) {
        this.f16982w = c2315z3;
        this.f16978d = atomicReference;
        this.f16979e = str2;
        this.f16980i = str3;
        this.f16981v = zzpVar;
    }

    @Override
    public final void run() {
        AtomicReference atomicReference;
        W3.d dVar;
        synchronized (this.f16978d) {
            try {
                try {
                    dVar = this.f16982w.f17124d;
                } catch (RemoteException e7) {
                    this.f16982w.f16818a.b().r().d("(legacy) Failed to get conditional properties; remote exception", null, this.f16979e, e7);
                    this.f16978d.set(Collections.emptyList());
                    atomicReference = this.f16978d;
                }
                if (dVar == null) {
                    this.f16982w.f16818a.b().r().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f16979e, this.f16980i);
                    this.f16978d.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    C2651i.l(this.f16981v);
                    this.f16978d.set(dVar.c3(this.f16979e, this.f16980i, this.f16981v));
                } else {
                    this.f16978d.set(dVar.z2(null, this.f16979e, this.f16980i));
                }
                this.f16982w.E();
                atomicReference = this.f16978d;
                atomicReference.notify();
            } finally {
                this.f16978d.notify();
            }
        }
    }
}
