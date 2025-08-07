package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import n3.C2651i;
import y3.BinderC3024b;

final class T0 extends M0 {

    final Activity f15029w;

    final BinderC1850d0 f15030y;

    final V0 f15031z;

    T0(V0 v02, Activity activity, BinderC1850d0 binderC1850d0) {
        super(v02.f15051d, true);
        this.f15031z = v02;
        this.f15029w = activity;
        this.f15030y = binderC1850d0;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f15031z.f15051d.f15066i)).onActivitySaveInstanceState(BinderC3024b.h3(this.f15029w), this.f15030y, this.f14829e);
    }
}
