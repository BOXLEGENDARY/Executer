package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import java.util.Set;
import l3.C2526a;
import m3.C2571b;
import m3.InterfaceC2563D;

final class w implements b.c, InterfaceC2563D {

    private final C2526a.f f14189a;

    private final C2571b f14190b;

    private com.google.android.gms.common.internal.e f14191c = null;

    private Set f14192d = null;

    private boolean f14193e = false;

    final C1803c f14194f;

    public w(C1803c c1803c, C2526a.f fVar, C2571b c2571b) {
        this.f14194f = c1803c;
        this.f14189a = fVar;
        this.f14190b = c2571b;
    }

    public final void i() {
        com.google.android.gms.common.internal.e eVar;
        if (!this.f14193e || (eVar = this.f14191c) == null) {
            return;
        }
        this.f14189a.d(eVar, this.f14192d);
    }

    @Override
    public final void a(ConnectionResult connectionResult) {
        this.f14194f.f14120G.post(new v(this, connectionResult));
    }

    @Override
    public final void b(ConnectionResult connectionResult) {
        t tVar = (t) this.f14194f.f14116C.get(this.f14190b);
        if (tVar != null) {
            tVar.G(connectionResult);
        }
    }

    @Override
    public final void c(com.google.android.gms.common.internal.e eVar, Set set) {
        if (eVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new ConnectionResult(4));
        } else {
            this.f14191c = eVar;
            this.f14192d = set;
            i();
        }
    }

    @Override
    public final void d(int i7) {
        t tVar = (t) this.f14194f.f14116C.get(this.f14190b);
        if (tVar != null) {
            if (tVar.f14173B) {
                tVar.G(new ConnectionResult(17));
            } else {
                tVar.E0(i7);
            }
        }
    }
}
