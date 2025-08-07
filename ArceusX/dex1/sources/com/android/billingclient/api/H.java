package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.C2046c1;
import com.google.android.gms.internal.play_billing.C2073g4;
import com.google.android.gms.internal.play_billing.C2085i4;
import com.google.android.gms.internal.play_billing.C2103l4;
import com.google.android.gms.internal.play_billing.C2115n4;
import com.google.android.gms.internal.play_billing.C2121o4;
import com.google.android.gms.internal.play_billing.C2144s4;
import com.google.android.gms.internal.play_billing.C2151u;

public final class H {

    public static final int f13339a = 0;

    static {
        int i7 = I.f13340a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + C2151u.b(exc.getMessage());
            int i7 = C2046c1.f15998a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            C2046c1.k("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static C2085i4 b(int i7, int i8, C1761e c1761e) {
        try {
            C2073g4 c2073g4I = C2085i4.I();
            C2121o4 c2121o4I = C2144s4.I();
            c2121o4I.s(c1761e.b());
            c2121o4I.r(c1761e.a());
            c2121o4I.t(i7);
            c2073g4I.q(c2121o4I);
            c2073g4I.s(i8);
            return (C2085i4) c2073g4I.l();
        } catch (Exception e7) {
            C2046c1.k("BillingLogger", "Unable to create logging payload", e7);
            return null;
        }
    }

    public static C2085i4 c(int i7, int i8, C1761e c1761e, String str) {
        try {
            C2121o4 c2121o4I = C2144s4.I();
            c2121o4I.s(c1761e.b());
            c2121o4I.r(c1761e.a());
            c2121o4I.t(i7);
            if (str != null) {
                c2121o4I.q(str);
            }
            C2073g4 c2073g4I = C2085i4.I();
            c2073g4I.q(c2121o4I);
            c2073g4I.s(i8);
            return (C2085i4) c2073g4I.l();
        } catch (Throwable th) {
            C2046c1.k("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static C2115n4 d(int i7) {
        try {
            C2103l4 c2103l4H = C2115n4.H();
            c2103l4H.s(i7);
            return (C2115n4) c2103l4H.l();
        } catch (Exception e7) {
            C2046c1.k("BillingLogger", "Unable to create logging payload", e7);
            return null;
        }
    }
}
