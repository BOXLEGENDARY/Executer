package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;

final class D0 extends M0 {

    final BinderC1850d0 f14691w;

    final W0 f14692y;

    D0(W0 w02, BinderC1850d0 binderC1850d0) {
        super(w02, true);
        this.f14692y = w02;
        this.f14691w = binderC1850d0;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14692y.f15066i)).getCurrentScreenClass(this.f14691w);
    }

    @Override
    protected final void b() {
        this.f14691w.P(null);
    }
}
