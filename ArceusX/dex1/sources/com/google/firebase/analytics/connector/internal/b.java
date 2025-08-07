package com.google.firebase.analytics.connector.internal;

import W3.p;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import j0.tkB.pkcpMQSgx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ka.oik.UJEa;

public final class b {

    private static final Set<String> f18988a = new HashSet(Arrays.asList(jUbDmI.ivppC, "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", UJEa.UwC, "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    private static final List<String> f18989b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    private static final List<String> f18990c = Arrays.asList("auto", pkcpMQSgx.wsrPXLnK, "am");

    private static final List<String> f18991d = Arrays.asList("_r", "_dbg");

    private static final List<String> f18992e = Arrays.asList((String[]) v3.b.a(p.f7660a, p.f7661b));

    private static final List<String> f18993f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static void a(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean b(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.b.b(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    public static boolean c(String str, Bundle bundle) {
        if (f18989b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator<String> it = f18991d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str) {
        return !f18990c.contains(str);
    }

    public static boolean e(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f18992e.contains(str2)) {
            return false;
        }
        Iterator<String> it = f18993f.iterator();
        while (it.hasNext()) {
            if (str2.matches(it.next())) {
                return false;
            }
        }
        return true;
    }
}
