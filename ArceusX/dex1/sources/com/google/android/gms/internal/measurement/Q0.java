package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import n3.C2651i;
import y3.BinderC3024b;

final class Q0 extends M0 {

    final Activity f15003w;

    final V0 f15004y;

    Q0(V0 v02, Activity activity) {
        super(v02.f15051d, true);
        this.f15004y = v02;
        this.f15003w = activity;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f15004y.f15051d.f15066i)).onActivityPaused(BinderC3024b.h3(this.f15003w), this.f14829e);
    }
}
