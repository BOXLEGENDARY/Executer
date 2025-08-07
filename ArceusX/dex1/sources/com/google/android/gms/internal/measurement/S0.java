package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import n3.C2651i;
import y3.BinderC3024b;

final class S0 extends M0 {

    final Activity f15022w;

    final V0 f15023y;

    S0(V0 v02, Activity activity) {
        super(v02.f15051d, true);
        this.f15023y = v02;
        this.f15022w = activity;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f15023y.f15051d.f15066i)).onActivityStopped(BinderC3024b.h3(this.f15022w), this.f14829e);
    }
}
