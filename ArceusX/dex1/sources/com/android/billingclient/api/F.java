package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.AbstractBinderC2080i;
import com.google.android.gms.internal.play_billing.C2046c1;

final class F implements ServiceConnection {

    final G f13333d;

    F(G g7, e2.t tVar) {
        this.f13333d = g7;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2046c1.i("BillingClientTesting", "Billing Override Service connected.");
        this.f13333d.f13336I = AbstractBinderC2080i.O0(iBinder);
        this.f13333d.f13335H = 2;
        this.f13333d.f1(26);
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        C2046c1.j("BillingClientTesting", "Billing Override Service disconnected.");
        this.f13333d.f13336I = null;
        this.f13333d.f13335H = 0;
    }
}
