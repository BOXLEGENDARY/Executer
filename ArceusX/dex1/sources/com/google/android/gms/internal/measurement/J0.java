package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;

final class J0 extends M0 {

    final boolean f14798w;

    final W0 f14799y;

    J0(W0 w02, boolean z7) {
        super(w02, true);
        this.f14799y = w02;
        this.f14798w = z7;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14799y.f15066i)).setDataCollectionEnabled(this.f14798w);
    }
}
