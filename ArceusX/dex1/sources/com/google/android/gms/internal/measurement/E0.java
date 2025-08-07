package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import n3.C2651i;

final class E0 extends M0 {

    final BinderC1850d0 f14704A;

    final W0 f14705B;

    final String f14706w;

    final String f14707y;

    final boolean f14708z;

    E0(W0 w02, String str, String str2, boolean z7, BinderC1850d0 binderC1850d0) {
        super(w02, true);
        this.f14705B = w02;
        this.f14706w = str;
        this.f14707y = str2;
        this.f14708z = z7;
        this.f14704A = binderC1850d0;
    }

    @Override
    final void a() throws RemoteException {
        ((InterfaceC1882h0) C2651i.l(this.f14705B.f15066i)).getUserProperties(this.f14706w, this.f14707y, this.f14708z, this.f14704A);
    }

    @Override
    protected final void b() {
        this.f14704A.P(null);
    }
}
