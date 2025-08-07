package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;

final class I0 extends M0 {

    final String f14785w;

    final BinderC1850d0 f14786y;

    final W0 f14787z;

    I0(W0 w02, String str, BinderC1850d0 binderC1850d0) {
        super(w02, true);
        this.f14787z = w02;
        this.f14785w = str;
        this.f14786y = binderC1850d0;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14787z.f15066i)).getMaxUserProperties(this.f14785w, this.f14786y);
    }

    @Override
    protected final void b() {
        this.f14786y.P(null);
    }
}
