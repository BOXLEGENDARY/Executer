package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class j extends m {

    public final int f14307d;

    public final Bundle f14308e;

    final b f14309f;

    protected j(b bVar, int i7, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f14309f = bVar;
        this.f14307d = i7;
        this.f14308e = bundle;
    }

    @Override
    protected final void a(Object obj) {
        if (this.f14307d != 0) {
            this.f14309f.i0(1, null);
            Bundle bundle = this.f14308e;
            f(new ConnectionResult(this.f14307d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f14309f.i0(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    @Override
    protected final void b() {
    }

    protected abstract void f(ConnectionResult connectionResult);

    protected abstract boolean g();
}
