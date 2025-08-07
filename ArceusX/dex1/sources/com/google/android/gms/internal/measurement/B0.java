package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;

final class B0 extends M0 {

    final BinderC1850d0 f14653w;

    final W0 f14654y;

    B0(W0 w02, BinderC1850d0 binderC1850d0) {
        super(w02, true);
        this.f14654y = w02;
        this.f14653w = binderC1850d0;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14654y.f15066i)).generateEventId(this.f14653w);
    }

    @Override
    protected final void b() {
        this.f14653w.P(null);
    }
}
