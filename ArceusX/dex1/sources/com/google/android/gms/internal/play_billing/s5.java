package com.google.android.gms.internal.play_billing;

public final class s5 {
    public static InterfaceFutureC2177y1 a(com.android.billingclient.api.A a2) {
        o5 o5Var = new o5();
        r5 r5Var = new r5(o5Var);
        o5Var.f16111b = r5Var;
        o5Var.f16110a = a2.getClass();
        try {
            o5Var.f16110a = a2.a(o5Var);
        } catch (Exception e7) {
            r5Var.b(e7);
        }
        return r5Var;
    }
}
