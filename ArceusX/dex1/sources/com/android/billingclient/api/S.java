package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC2057e0;
import com.google.android.gms.internal.play_billing.C2;
import com.google.android.gms.internal.play_billing.C2046c1;
import com.google.android.gms.internal.play_billing.C2085i4;
import java.util.List;
import java.util.Objects;

final class S extends BroadcastReceiver {

    private boolean f13397a;

    private final boolean f13398b;

    final T f13399c;

    S(T t7, boolean z7) {
        this.f13399c = t7;
        this.f13398b = z7;
    }

    private final void c(Bundle bundle, C1761e c1761e, int i7) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f13399c.f13404c.d(C2085i4.D(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), C2.a()));
            } else {
                this.f13399c.f13404c.d(H.b(23, i7, c1761e));
            }
        } catch (Throwable unused) {
            C2046c1.j("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f13397a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f13398b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f13397a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        try {
            if (this.f13397a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f13398b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
            }
            this.f13397a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            C2046c1.j("BillingBroadcastManager", "Bundle is null.");
            I i7 = this.f13399c.f13404c;
            C1761e c1761e = J.f13358k;
            i7.d(H.b(11, 1, c1761e));
            T t7 = this.f13399c;
            if (t7.f13403b != null) {
                t7.f13403b.a(c1761e, null);
                return;
            }
            return;
        }
        C1761e c1761eE = C2046c1.e(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i8 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List<Purchase> listH = C2046c1.h(extras);
            if (c1761eE.b() == 0) {
                this.f13399c.f13404c.g(H.d(i8));
            } else {
                c(extras, c1761eE, i8);
            }
            this.f13399c.f13403b.a(c1761eE, listH);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (c1761eE.b() != 0) {
                c(extras, c1761eE, i8);
                this.f13399c.f13403b.a(c1761eE, AbstractC2057e0.r());
                return;
            }
            T t8 = this.f13399c;
            T.a(t8);
            T.e(t8);
            C2046c1.j("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
            I i9 = this.f13399c.f13404c;
            C1761e c1761e2 = J.f13358k;
            i9.d(H.b(77, i8, c1761e2));
            this.f13399c.f13403b.a(c1761e2, AbstractC2057e0.r());
        }
    }
}
