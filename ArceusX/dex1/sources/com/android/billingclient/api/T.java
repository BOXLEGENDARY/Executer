package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import e2.InterfaceC2411A;

final class T {

    private final Context f13402a;

    private final e2.i f13403b;

    private final I f13404c;

    private final S f13405d = new S(this, true);

    private final S f13406e = new S(this, false);

    private boolean f13407f;

    T(Context context, e2.i iVar, InterfaceC2411A interfaceC2411A, e2.o oVar, e2.l lVar, I i7) {
        this.f13402a = context;
        this.f13403b = iVar;
        this.f13404c = i7;
    }

    static e2.o a(T t7) {
        t7.getClass();
        return null;
    }

    static e2.l e(T t7) {
        t7.getClass();
        return null;
    }

    final e2.i d() {
        return this.f13403b;
    }

    final void f(boolean z7) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f13407f = z7;
        this.f13406e.a(this.f13402a, intentFilter2);
        if (this.f13407f) {
            this.f13405d.b(this.f13402a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f13405d.a(this.f13402a, intentFilter);
        }
    }
}
