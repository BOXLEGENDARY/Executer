package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2651i;

public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR = new r();

    public final String f17142d;

    public final zzar f17143e;

    public final String f17144i;

    public final long f17145v;

    zzat(zzat zzatVar, long j7) {
        C2651i.l(zzatVar);
        this.f17142d = zzatVar.f17142d;
        this.f17143e = zzatVar.f17143e;
        this.f17144i = zzatVar.f17144i;
        this.f17145v = j7;
    }

    public final String toString() {
        String str = this.f17144i;
        String str2 = this.f17142d;
        String strValueOf = String.valueOf(this.f17143e);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + strValueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        r.a(this, parcel, i7);
    }

    public zzat(String str, zzar zzarVar, String str2, long j7) {
        this.f17142d = str;
        this.f17143e = zzarVar;
        this.f17144i = str2;
        this.f17145v = j7;
    }
}
