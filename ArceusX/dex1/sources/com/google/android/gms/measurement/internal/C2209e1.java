package com.google.android.gms.measurement.internal;

import W0.JWp.kNUgEaOjcPdX;
import android.os.Bundle;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import n3.C2651i;

public final class C2209e1 {

    protected static final AtomicReference<String[]> f16770b = new AtomicReference<>();

    protected static final AtomicReference<String[]> f16771c = new AtomicReference<>();

    protected static final AtomicReference<String[]> f16772d = new AtomicReference<>();

    private final W3.e f16773a;

    public C2209e1(W3.e eVar) {
        this.f16773a = eVar;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C2651i.l(strArr);
        C2651i.l(strArr2);
        C2651i.l(atomicReference);
        C2651i.a(strArr.length == strArr2.length);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (i4.Z(str, strArr[i7])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i7];
                        if (str2 == null) {
                            str2 = strArr2[i7] + "(" + strArr[i7] + ")";
                            strArr3[i7] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strB = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (strB != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strB);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f16773a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append(kNUgEaOjcPdX.rxVcbezTz);
        return sb.toString();
    }

    protected final String c(zzat zzatVar) {
        if (!this.f16773a.zza()) {
            return zzatVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzatVar.f17144i);
        sb.append(",name=");
        sb.append(d(zzatVar.f17142d));
        sb.append(",params=");
        zzar zzarVar = zzatVar.f17143e;
        sb.append(zzarVar == null ? null : !this.f16773a.zza() ? zzarVar.toString() : b(zzarVar.o()));
        return sb.toString();
    }

    protected final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f16773a.zza() ? str : g(str, W3.n.f7654c, W3.n.f7652a, f16770b);
    }

    protected final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f16773a.zza() ? str : g(str, W3.o.f7657b, W3.o.f7656a, f16771c);
    }

    protected final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f16773a.zza()) {
            return str;
        }
        if (!str.startsWith(tAjeAKSIqDqzNP.uZUzYp)) {
            return g(str, W3.p.f7661b, W3.p.f7660a, f16772d);
        }
        return "experiment_id(" + str + ")";
    }
}
