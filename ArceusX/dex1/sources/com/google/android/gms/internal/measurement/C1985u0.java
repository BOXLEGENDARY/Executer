package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import n3.C2651i;

final class C1985u0 extends M0 {

    final Bundle f15340w;

    final W0 f15341y;

    C1985u0(W0 w02, Bundle bundle) {
        super(w02, true);
        this.f15341y = w02;
        this.f15340w = bundle;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f15341y.f15066i)).setConsent(this.f15340w, this.f14828d);
    }
}
