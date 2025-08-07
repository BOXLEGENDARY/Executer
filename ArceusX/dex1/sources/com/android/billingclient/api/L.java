package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.C2046c1;
import com.google.android.gms.internal.play_billing.V4;

final class L {

    private boolean f13376a;

    private q2.f f13377b;

    L(Context context) {
        try {
            s2.t.f(context);
            this.f13377b = s2.t.c().g(com.google.android.datatransport.cct.a.f13872g).a("PLAY_BILLING_LIBRARY", V4.class, q2.b.b("proto"), new q2.e() {
                @Override
                public final Object apply(Object obj) {
                    return ((V4) obj).g();
                }
            });
        } catch (Throwable unused) {
            this.f13376a = true;
        }
    }

    public final void a(V4 v42) {
        if (this.f13376a) {
            C2046c1.j("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f13377b.a(q2.c.d(v42));
        } catch (Throwable unused) {
            C2046c1.j("BillingLogger", "logging failed.");
        }
    }
}
