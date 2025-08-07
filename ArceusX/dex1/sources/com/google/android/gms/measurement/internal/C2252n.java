package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import n3.C2651i;

public final class C2252n {

    final String f16914a;

    final String f16915b;

    final String f16916c;

    final long f16917d;

    final long f16918e;

    final zzar f16919f;

    C2252n(N1 n1, String str, String str2, String str3, long j7, long j8, Bundle bundle) {
        zzar zzarVar;
        C2651i.f(str2);
        C2651i.f(str3);
        this.f16914a = str2;
        this.f16915b = str3;
        this.f16916c = true == TextUtils.isEmpty(str) ? null : str;
        this.f16917d = j7;
        this.f16918e = j8;
        if (j8 != 0 && j8 > j7) {
            n1.b().w().b("Event created with reverse previous/current timestamps. appId", C2234j1.z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzarVar = new zzar(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    n1.b().r().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objO = n1.N().o(next, bundle2.get(next));
                    if (objO == null) {
                        n1.b().w().b("Param value can't be null", n1.D().e(next));
                        it.remove();
                    } else {
                        n1.N().B(bundle2, next, objO);
                    }
                }
            }
            zzarVar = new zzar(bundle2);
        }
        this.f16919f = zzarVar;
    }

    final C2252n a(N1 n1, long j7) {
        return new C2252n(n1, this.f16916c, this.f16914a, this.f16915b, this.f16917d, j7, this.f16919f);
    }

    public final String toString() {
        String str = this.f16914a;
        String str2 = this.f16915b;
        String string = this.f16919f.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + string.length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }

    private C2252n(N1 n1, String str, String str2, String str3, long j7, long j8, zzar zzarVar) {
        C2651i.f(str2);
        C2651i.f(str3);
        C2651i.l(zzarVar);
        this.f16914a = str2;
        this.f16915b = str3;
        this.f16916c = true == TextUtils.isEmpty(str) ? null : str;
        this.f16917d = j7;
        this.f16918e = j8;
        if (j8 != 0 && j8 > j7) {
            n1.b().w().c("Event created with reverse previous/current timestamps. appId, name", C2234j1.z(str2), C2234j1.z(str3));
        }
        this.f16919f = zzarVar;
    }
}
