package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;

final class C1969s0 extends M0 {

    final W0 f15303A;

    final String f15304w;

    final String f15305y;

    final BinderC1850d0 f15306z;

    C1969s0(W0 w02, String str, String str2, BinderC1850d0 binderC1850d0) {
        super(w02, true);
        this.f15303A = w02;
        this.f15304w = str;
        this.f15305y = str2;
        this.f15306z = binderC1850d0;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f15303A.f15066i)).getConditionalUserProperties(this.f15304w, this.f15305y, this.f15306z);
    }

    @Override
    protected final void b() {
        this.f15306z.P(null);
    }
}
