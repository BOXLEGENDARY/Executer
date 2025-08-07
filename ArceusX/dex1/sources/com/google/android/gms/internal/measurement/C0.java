package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;

final class C0 extends M0 {

    final BinderC1850d0 f14678w;

    final W0 f14679y;

    C0(W0 w02, BinderC1850d0 binderC1850d0) {
        super(w02, true);
        this.f14679y = w02;
        this.f14678w = binderC1850d0;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14679y.f15066i)).getCurrentScreenName(this.f14678w);
    }

    @Override
    protected final void b() {
        this.f14678w.P(null);
    }
}
