package com.google.android.play.core.integrity;

import a4.C1574k;
import android.os.Bundle;
import android.os.RemoteException;
import l3.C2527b;

final class G extends E {

    private final H4.U f18791i;

    private final long f18792v;

    final J f18793w;

    G(J j7, C1574k c1574k, long j8) {
        super(j7, c1574k);
        this.f18793w = j7;
        this.f18791i = new H4.U("OnRequestIntegrityTokenCallback");
        this.f18792v = j8;
    }

    @Override
    public final void U2(Bundle bundle) throws RemoteException {
        super.U2(bundle);
        this.f18791i.c("onRequestExpressIntegrityToken", new Object[0]);
        C2527b c2527bN0 = this.f18793w.f18801e.n0(bundle);
        if (c2527bN0 != null) {
            this.f18788d.d(c2527bN0);
            return;
        }
        F f7 = new F(this, this.f18793w.f18798b, bundle.getLong("request.token.sid"));
        C1574k c1574k = this.f18788d;
        C2341y c2341y = new C2341y();
        c2341y.b(bundle.getString("token"));
        c2341y.a(f7);
        c1574k.e(c2341y.c());
    }
}
