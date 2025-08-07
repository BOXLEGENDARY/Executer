package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import n3.C2651i;
import y3.BinderC3024b;

final class C1977t0 extends M0 {

    final W0 f15320A;

    final Activity f15321w;

    final String f15322y;

    final String f15323z;

    C1977t0(W0 w02, Activity activity, String str, String str2) {
        super(w02, true);
        this.f15320A = w02;
        this.f15321w = activity;
        this.f15322y = str;
        this.f15323z = str2;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f15320A.f15066i)).setCurrentScreen(BinderC3024b.h3(this.f15321w), this.f15322y, this.f15323z, this.f14828d);
    }
}
