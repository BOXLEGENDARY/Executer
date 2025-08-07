package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC2075h0;
import com.google.android.gms.internal.play_billing.C2085i4;
import com.google.android.gms.internal.play_billing.C2115n4;
import com.google.android.gms.internal.play_billing.C2162v4;
import com.google.android.gms.internal.play_billing.EnumC2174x4;
import com.google.android.gms.internal.play_billing.b5;
import com.google.android.gms.internal.play_billing.f5;

interface I {

    public static final int f13340a = 0;

    static {
        AbstractC2075h0.c("com.android.vending.billing.PURCHASES_UPDATED", EnumC2174x4.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", EnumC2174x4.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", EnumC2174x4.ALTERNATIVE_BILLING_ACTION);
    }

    void a(C2162v4 c2162v4);

    void b(f5 f5Var);

    void c(b5 b5Var);

    void d(C2085i4 c2085i4);

    void e(C2085i4 c2085i4, int i7);

    void f(C2115n4 c2115n4, int i7);

    void g(C2115n4 c2115n4);
}
