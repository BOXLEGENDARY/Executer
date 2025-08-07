package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

final class K2 implements Runnable {

    final boolean f16357d;

    final Uri f16358e;

    final String f16359i;

    final String f16360v;

    final L2 f16361w;

    K2(L2 l22, boolean z7, Uri uri, String str, String str2) {
        this.f16361w = l22;
        this.f16357d = z7;
        this.f16358e = uri;
        this.f16359i = str;
        this.f16360v = str2;
    }

    @Override
    public final void run() {
        Bundle bundleT0;
        Bundle bundleT02;
        L2 l22 = this.f16361w;
        boolean z7 = this.f16357d;
        Uri uri = this.f16358e;
        String str = this.f16359i;
        String str2 = this.f16360v;
        l22.f16376d.h();
        try {
            i4 i4VarN = l22.f16376d.f16818a.N();
            if (TextUtils.isEmpty(str2)) {
                bundleT0 = null;
            } else if (str2.contains("gclid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium")) {
                bundleT0 = i4VarN.t0(Uri.parse(str2.length() != 0 ? "https://google.com/search?".concat(str2) : new String("https://google.com/search?")));
                if (bundleT0 != null) {
                    bundleT0.putString("_cis", "referrer");
                }
            } else {
                i4VarN.f16818a.b().q().a("Activity created with data 'referrer' without required params");
                bundleT0 = null;
            }
            if (z7 && (bundleT02 = l22.f16376d.f16818a.N().t0(uri)) != null) {
                bundleT02.putString("_cis", "intent");
                if (!bundleT02.containsKey("gclid") && bundleT0 != null && bundleT0.containsKey("gclid")) {
                    bundleT02.putString("_cer", String.format("gclid=%s", bundleT0.getString("gclid")));
                }
                l22.f16376d.u(str, "_cmp", bundleT02);
                l22.f16376d.f16437n.a(str, bundleT02);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            l22.f16376d.f16818a.b().q().b("Activity created with referrer", str2);
            if (l22.f16376d.f16818a.z().B(null, Y0.f16611c0)) {
                if (bundleT0 != null) {
                    l22.f16376d.u(str, "_cmp", bundleT0);
                    l22.f16376d.f16437n.a(str, bundleT0);
                } else {
                    l22.f16376d.f16818a.b().q().b("Referrer does not contain valid parameters", str2);
                }
                l22.f16376d.L("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                l22.f16376d.f16818a.b().q().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                l22.f16376d.L("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e7) {
            l22.f16376d.f16818a.b().r().b("Throwable caught in handleReferrerForOnActivityCreated", e7);
        }
    }
}
