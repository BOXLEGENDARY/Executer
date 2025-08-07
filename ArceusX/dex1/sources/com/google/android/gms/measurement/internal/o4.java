package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import f6.ck.ZJZXBWla;

public final class o4 {

    private final N1 f16950a;

    public o4(N1 n1) {
        this.f16950a = n1;
    }

    final void a(String str, Bundle bundle) {
        String string;
        this.f16950a.a().h();
        if (this.f16950a.o()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f16950a.F().f17099u.b(string);
        this.f16950a.F().f17100v.b(this.f16950a.c().a());
    }

    final void b() {
        this.f16950a.a().h();
        if (d()) {
            boolean zE = e();
            String str = ZJZXBWla.elZDGRyzVekP;
            if (zE) {
                this.f16950a.F().f17099u.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong(str, 1L);
                this.f16950a.I().u("auto", "_cmpx", bundle);
            } else {
                String strA = this.f16950a.F().f17099u.a();
                if (TextUtils.isEmpty(strA)) {
                    this.f16950a.b().t().a("Cache still valid but referrer not found");
                } else {
                    long jA = ((this.f16950a.F().f17100v.a() / 3600000) - 1) * 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str2 : uri.getQueryParameterNames()) {
                        bundle2.putString(str2, uri.getQueryParameter(str2));
                    }
                    ((Bundle) pair.second).putLong(str, jA);
                    Object obj = pair.first;
                    this.f16950a.I().u(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f16950a.F().f17099u.b(null);
            }
            this.f16950a.F().f17100v.b(0L);
        }
    }

    final void c() {
        if (d() && e()) {
            this.f16950a.F().f17099u.b(null);
        }
    }

    final boolean d() {
        return this.f16950a.F().f17100v.a() > 0;
    }

    final boolean e() {
        return d() && this.f16950a.c().a() - this.f16950a.F().f17100v.a() > this.f16950a.z().r(null, Y0.f16598S);
    }
}
