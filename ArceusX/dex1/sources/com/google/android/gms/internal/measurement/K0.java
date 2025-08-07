package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import n3.C2651i;

final class K0 extends M0 {

    final Bundle f14805A;

    final boolean f14806B;

    final boolean f14807C;

    final W0 f14808D;

    final Long f14809w;

    final String f14810y;

    final String f14811z;

    K0(W0 w02, Long l7, String str, String str2, Bundle bundle, boolean z7, boolean z8) {
        super(w02, true);
        this.f14808D = w02;
        this.f14809w = l7;
        this.f14810y = str;
        this.f14811z = str2;
        this.f14805A = bundle;
        this.f14806B = z7;
        this.f14807C = z8;
    }

    @Override
    final void a() throws RemoteException {
        Long l7 = this.f14809w;
        ((InterfaceC1882h0) C2651i.l(this.f14808D.f15066i)).logEvent(this.f14810y, this.f14811z, this.f14805A, this.f14806B, this.f14807C, l7 == null ? this.f14828d : l7.longValue());
    }
}
