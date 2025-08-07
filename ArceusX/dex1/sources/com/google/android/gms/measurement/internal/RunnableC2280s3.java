package com.google.android.gms.measurement.internal;

import H3.QdLC.QcdySgfdST;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import n3.C2651i;

final class RunnableC2280s3 implements Runnable {

    final AtomicReference f17009d;

    final String f17010e;

    final String f17011i;

    final zzp f17012v;

    final boolean f17013w;

    final C2315z3 f17014y;

    RunnableC2280s3(C2315z3 c2315z3, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar, boolean z7) {
        this.f17014y = c2315z3;
        this.f17009d = atomicReference;
        this.f17010e = str2;
        this.f17011i = str3;
        this.f17012v = zzpVar;
        this.f17013w = z7;
    }

    @Override
    public final void run() {
        AtomicReference atomicReference;
        W3.d dVar;
        synchronized (this.f17009d) {
            try {
                try {
                    dVar = this.f17014y.f17124d;
                } catch (RemoteException e7) {
                    this.f17014y.f16818a.b().r().d(QcdySgfdST.BlrzioVFv, null, this.f17010e, e7);
                    this.f17009d.set(Collections.emptyList());
                    atomicReference = this.f17009d;
                }
                if (dVar == null) {
                    this.f17014y.f16818a.b().r().d("(legacy) Failed to get user properties; not connected to service", null, this.f17010e, this.f17011i);
                    this.f17009d.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    C2651i.l(this.f17012v);
                    this.f17009d.set(dVar.r4(this.f17010e, this.f17011i, this.f17013w, this.f17012v));
                } else {
                    this.f17009d.set(dVar.y1(null, this.f17010e, this.f17011i, this.f17013w));
                }
                this.f17014y.E();
                atomicReference = this.f17009d;
                atomicReference.notify();
            } finally {
                this.f17009d.notify();
            }
        }
    }
}
