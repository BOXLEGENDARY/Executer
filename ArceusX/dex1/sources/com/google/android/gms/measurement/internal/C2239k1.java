package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class C2239k1 {

    public final String f16867a;

    public final String f16868b;

    public final long f16869c;

    public final Bundle f16870d;

    public C2239k1(String str, String str2, Bundle bundle, long j7) {
        this.f16867a = str;
        this.f16868b = str2;
        this.f16870d = bundle;
        this.f16869c = j7;
    }

    public static C2239k1 b(zzat zzatVar) {
        return new C2239k1(zzatVar.f17142d, zzatVar.f17144i, zzatVar.f17143e.o(), zzatVar.f17145v);
    }

    public final zzat a() {
        return new zzat(this.f16867a, new zzar(new Bundle(this.f16870d)), this.f16868b, this.f16869c);
    }

    public final String toString() {
        String str = this.f16868b;
        String str2 = this.f16867a;
        String string = this.f16870d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + string.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(string);
        return sb.toString();
    }
}
