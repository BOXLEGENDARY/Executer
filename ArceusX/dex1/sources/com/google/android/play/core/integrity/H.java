package com.google.android.play.core.integrity;

import a4.C1574k;
import android.os.Bundle;
import android.os.RemoteException;
import l3.C2527b;

final class H extends E {

    private final H4.U f18794i;

    final J f18795v;

    H(J j7, C1574k c1574k) {
        super(j7, c1574k);
        this.f18795v = j7;
        this.f18794i = new H4.U("OnWarmUpIntegrityTokenCallback");
    }

    @Override
    public final void D4(Bundle bundle) throws RemoteException {
        super.D4(bundle);
        this.f18794i.c("onWarmUpExpressIntegrityToken", new Object[0]);
        C2527b c2527bN0 = this.f18795v.f18801e.n0(bundle);
        if (c2527bN0 != null) {
            this.f18788d.d(c2527bN0);
        } else {
            this.f18788d.e(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
