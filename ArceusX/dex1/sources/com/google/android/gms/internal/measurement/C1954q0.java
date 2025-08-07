package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import n3.C2651i;

final class C1954q0 extends M0 {

    final Bundle f15273w;

    final W0 f15274y;

    C1954q0(W0 w02, Bundle bundle) {
        super(w02, true);
        this.f15274y = w02;
        this.f15273w = bundle;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f15274y.f15066i)).setConditionalUserProperty(this.f15273w, this.f14828d);
    }
}
