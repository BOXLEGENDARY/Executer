package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;
import y3.BinderC3024b;

final class F0 extends M0 {

    final String f14715w;

    final Object f14716y;

    final W0 f14717z;

    F0(W0 w02, boolean z7, int i7, String str, Object obj, Object obj2, Object obj3) {
        super(w02, false);
        this.f14717z = w02;
        this.f14715w = str;
        this.f14716y = obj;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14717z.f15066i)).logHealthData(5, this.f14715w, BinderC3024b.h3(this.f14716y), BinderC3024b.h3(null), BinderC3024b.h3(null));
    }
}
