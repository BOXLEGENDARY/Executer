package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import n3.C2651i;

final class C2269q1 extends BroadcastReceiver {

    private final c4 f16973a;

    private boolean f16974b;

    private boolean f16975c;

    C2269q1(c4 c4Var) {
        C2651i.l(c4Var);
        this.f16973a = c4Var;
    }

    public final void b() {
        this.f16973a.g();
        this.f16973a.a().h();
        if (this.f16974b) {
            return;
        }
        this.f16973a.f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f16975c = this.f16973a.X().m();
        this.f16973a.b().v().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f16975c));
        this.f16974b = true;
    }

    public final void c() {
        this.f16973a.g();
        this.f16973a.a().h();
        this.f16973a.a().h();
        if (this.f16974b) {
            this.f16973a.b().v().a("Unregistering connectivity change receiver");
            this.f16974b = false;
            this.f16975c = false;
            try {
                this.f16973a.f().unregisterReceiver(this);
            } catch (IllegalArgumentException e7) {
                this.f16973a.b().r().b("Failed to unregister the network broadcast receiver", e7);
            }
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) throws IllegalStateException {
        this.f16973a.g();
        String action = intent.getAction();
        this.f16973a.b().v().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f16973a.b().w().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM = this.f16973a.X().m();
        if (this.f16975c != zM) {
            this.f16975c = zM;
            this.f16973a.a().z(new RunnableC2264p1(this, zM));
        }
    }
}
