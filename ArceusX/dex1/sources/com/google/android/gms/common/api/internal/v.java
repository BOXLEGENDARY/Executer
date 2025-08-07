package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

final class v implements Runnable {

    final ConnectionResult f14187d;

    final w f14188e;

    v(w wVar, ConnectionResult connectionResult) {
        this.f14188e = wVar;
        this.f14187d = connectionResult;
    }

    @Override
    public final void run() {
        w wVar = this.f14188e;
        t tVar = (t) wVar.f14194f.f14116C.get(wVar.f14190b);
        if (tVar == null) {
            return;
        }
        if (!this.f14187d.q()) {
            tVar.F(this.f14187d, null);
            return;
        }
        this.f14188e.f14193e = true;
        if (this.f14188e.f14189a.o()) {
            this.f14188e.i();
            return;
        }
        try {
            w wVar2 = this.f14188e;
            wVar2.f14189a.d(null, wVar2.f14189a.c());
        } catch (SecurityException e7) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e7);
            this.f14188e.f14189a.e("Failed to get service from broker.");
            tVar.F(new ConnectionResult(10), null);
        }
    }
}
