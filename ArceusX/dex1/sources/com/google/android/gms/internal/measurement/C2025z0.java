package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;

final class C2025z0 extends M0 {

    final BinderC1850d0 f15381w;

    final W0 f15382y;

    C2025z0(W0 w02, BinderC1850d0 binderC1850d0) {
        super(w02, true);
        this.f15382y = w02;
        this.f15381w = binderC1850d0;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f15382y.f15066i)).getGmpAppId(this.f15381w);
    }

    @Override
    protected final void b() {
        this.f15381w.P(null);
    }
}
