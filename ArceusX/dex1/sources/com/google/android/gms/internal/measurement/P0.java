package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import n3.C2651i;
import y3.BinderC3024b;

final class P0 extends M0 {

    final Activity f14983w;

    final V0 f14984y;

    P0(V0 v02, Activity activity) {
        super(v02.f15051d, true);
        this.f14984y = v02;
        this.f14983w = activity;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14984y.f15051d.f15066i)).onActivityResumed(BinderC3024b.h3(this.f14983w), this.f14829e);
    }
}
