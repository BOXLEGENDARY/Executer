package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import n3.C2651i;

final class G0 extends M0 {

    final Bundle f14761w;

    final BinderC1850d0 f14762y;

    final W0 f14763z;

    G0(W0 w02, Bundle bundle, BinderC1850d0 binderC1850d0) {
        super(w02, true);
        this.f14763z = w02;
        this.f14761w = bundle;
        this.f14762y = binderC1850d0;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14763z.f15066i)).performAction(this.f14761w, this.f14762y, this.f14828d);
    }

    @Override
    protected final void b() {
        this.f14762y.P(null);
    }
}
