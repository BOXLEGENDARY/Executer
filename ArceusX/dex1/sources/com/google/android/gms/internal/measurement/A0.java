package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;

final class A0 extends M0 {

    final BinderC1850d0 f14646w;

    final W0 f14647y;

    A0(W0 w02, BinderC1850d0 binderC1850d0) {
        super(w02, true);
        this.f14647y = w02;
        this.f14646w = binderC1850d0;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14647y.f15066i)).getCachedAppInstanceId(this.f14646w);
    }

    @Override
    protected final void b() {
        this.f14646w.P(null);
    }
}
