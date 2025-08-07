package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;
import y3.BinderC3024b;

final class L0 extends M0 {

    final boolean f14814A;

    final W0 f14815B;

    final String f14816w;

    final String f14817y;

    final Object f14818z;

    L0(W0 w02, String str, String str2, Object obj, boolean z7) {
        super(w02, true);
        this.f14815B = w02;
        this.f14816w = str;
        this.f14817y = str2;
        this.f14818z = obj;
        this.f14814A = z7;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14815B.f15066i)).setUserProperty(this.f14816w, this.f14817y, BinderC3024b.h3(this.f14818z), this.f14814A, this.f14828d);
    }
}
