package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import x3.C2988b;
import x3.C2989c;

public final class A1 {

    final N1 f16247a;

    A1(c4 c4Var) {
        this.f16247a = c4Var.b0();
    }

    final boolean a() {
        try {
            C2988b c2988bA = C2989c.a(this.f16247a.f());
            if (c2988bA != null) {
                return c2988bA.f("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f16247a.b().v().a(JmBUOGMwkkxg.wgIrlszPvjR);
            return false;
        } catch (Exception e7) {
            this.f16247a.b().v().b("Failed to retrieve Play Store version for Install Referrer", e7);
            return false;
        }
    }
}
