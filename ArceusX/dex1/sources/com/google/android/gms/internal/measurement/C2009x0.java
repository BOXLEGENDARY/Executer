package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;

final class C2009x0 extends M0 {

    final String f15372w;

    final W0 f15373y;

    C2009x0(W0 w02, String str) {
        super(w02, true);
        this.f15373y = w02;
        this.f15372w = str;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f15373y.f15066i)).endAdUnitExposure(this.f15372w, this.f14829e);
    }
}
