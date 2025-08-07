package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;

final class C2001w0 extends M0 {

    final String f15365w;

    final W0 f15366y;

    C2001w0(W0 w02, String str) {
        super(w02, true);
        this.f15366y = w02;
        this.f15365w = str;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f15366y.f15066i)).beginAdUnitExposure(this.f15365w, this.f14829e);
    }
}
