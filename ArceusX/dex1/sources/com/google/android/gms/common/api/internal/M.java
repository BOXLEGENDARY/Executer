package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import n3.C2651i;

final class M implements Runnable {

    private final K f14096d;

    final N f14097e;

    M(N n7, K k7) {
        this.f14097e = n7;
        this.f14096d = k7;
    }

    @Override
    public final void run() {
        if (this.f14097e.f14098e) {
            ConnectionResult connectionResultB = this.f14096d.b();
            if (connectionResultB.p()) {
                N n7 = this.f14097e;
                n7.f14095d.startActivityForResult(GoogleApiActivity.a(n7.b(), (PendingIntent) C2651i.l(connectionResultB.o()), this.f14096d.a(), false), 1);
                return;
            }
            N n8 = this.f14097e;
            if (n8.f14101w.b(n8.b(), connectionResultB.l(), null) != null) {
                N n9 = this.f14097e;
                n9.f14101w.w(n9.b(), n9.f14095d, connectionResultB.l(), 2, this.f14097e);
                return;
            }
            if (connectionResultB.l() != 18) {
                this.f14097e.l(connectionResultB, this.f14096d.a());
                return;
            }
            N n10 = this.f14097e;
            Dialog dialogR = n10.f14101w.r(n10.b(), n10);
            N n11 = this.f14097e;
            n11.f14101w.s(n11.b().getApplicationContext(), new L(this, dialogR));
        }
    }
}
