package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import n3.C2651i;

final class C1961r0 extends M0 {

    final W0 f15290A;

    final String f15291w;

    final String f15292y;

    final Bundle f15293z;

    C1961r0(W0 w02, String str, String str2, Bundle bundle) {
        super(w02, true);
        this.f15290A = w02;
        this.f15291w = str;
        this.f15292y = str2;
        this.f15293z = bundle;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f15290A.f15066i)).clearConditionalUserProperty(this.f15291w, this.f15292y, this.f15293z);
    }
}
