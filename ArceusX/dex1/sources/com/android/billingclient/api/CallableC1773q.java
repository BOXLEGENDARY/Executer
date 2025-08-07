package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC2057e0;
import java.util.concurrent.Callable;

final class CallableC1773q implements Callable {

    final String f13550d;

    final e2.h f13551e;

    final C1759c f13552i;

    CallableC1773q(C1759c c1759c, String str, e2.h hVar) {
        this.f13550d = str;
        this.f13551e = hVar;
        this.f13552i = c1759c;
    }

    @Override
    public final Object call() throws Exception {
        e2.C cY = this.f13552i.Y(this.f13550d, 9);
        if (cY.b() != null) {
            this.f13551e.a(cY.a(), cY.b());
            return null;
        }
        this.f13551e.a(cY.a(), AbstractC2057e0.r());
        return null;
    }
}
