package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import n3.C2651i;
import y3.BinderC3024b;

final class O0 extends M0 {

    final Activity f14976w;

    final V0 f14977y;

    O0(V0 v02, Activity activity) {
        super(v02.f15051d, true);
        this.f14977y = v02;
        this.f14976w = activity;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14977y.f15051d.f15066i)).onActivityStarted(BinderC3024b.h3(this.f14976w), this.f14829e);
    }
}
