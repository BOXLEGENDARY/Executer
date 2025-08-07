package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class q extends j {

    final b f14321g;

    public q(b bVar, int i7, Bundle bundle) {
        super(bVar, i7, null);
        this.f14321g = bVar;
    }

    @Override
    protected final void f(ConnectionResult connectionResult) {
        if (this.f14321g.t() && b.h0(this.f14321g)) {
            b.d0(this.f14321g, 16);
        } else {
            this.f14321g.f14275I.a(connectionResult);
            this.f14321g.L(connectionResult);
        }
    }

    @Override
    protected final boolean g() {
        this.f14321g.f14275I.a(ConnectionResult.f14034w);
        return true;
    }
}
