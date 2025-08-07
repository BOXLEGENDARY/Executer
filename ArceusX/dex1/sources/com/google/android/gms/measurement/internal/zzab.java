package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2651i;
import o3.C2679b;

public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C2197c();

    public long f17130A;

    public zzat f17131B;

    public final long f17132C;

    public final zzat f17133D;

    public String f17134d;

    public String f17135e;

    public zzkv f17136i;

    public long f17137v;

    public boolean f17138w;

    public String f17139y;

    public final zzat f17140z;

    zzab(zzab zzabVar) {
        C2651i.l(zzabVar);
        this.f17134d = zzabVar.f17134d;
        this.f17135e = zzabVar.f17135e;
        this.f17136i = zzabVar.f17136i;
        this.f17137v = zzabVar.f17137v;
        this.f17138w = zzabVar.f17138w;
        this.f17139y = zzabVar.f17139y;
        this.f17140z = zzabVar.f17140z;
        this.f17130A = zzabVar.f17130A;
        this.f17131B = zzabVar.f17131B;
        this.f17132C = zzabVar.f17132C;
        this.f17133D = zzabVar.f17133D;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, this.f17134d, false);
        C2679b.u(parcel, 3, this.f17135e, false);
        C2679b.s(parcel, 4, this.f17136i, i7, false);
        C2679b.q(parcel, 5, this.f17137v);
        C2679b.c(parcel, 6, this.f17138w);
        C2679b.u(parcel, 7, this.f17139y, false);
        C2679b.s(parcel, 8, this.f17140z, i7, false);
        C2679b.q(parcel, 9, this.f17130A);
        C2679b.s(parcel, 10, this.f17131B, i7, false);
        C2679b.q(parcel, 11, this.f17132C);
        C2679b.s(parcel, 12, this.f17133D, i7, false);
        C2679b.b(parcel, iA);
    }

    zzab(String str, String str2, zzkv zzkvVar, long j7, boolean z7, String str3, zzat zzatVar, long j8, zzat zzatVar2, long j9, zzat zzatVar3) {
        this.f17134d = str;
        this.f17135e = str2;
        this.f17136i = zzkvVar;
        this.f17137v = j7;
        this.f17138w = z7;
        this.f17139y = str3;
        this.f17140z = zzatVar;
        this.f17130A = j8;
        this.f17131B = zzatVar2;
        this.f17132C = j9;
        this.f17133D = zzatVar3;
    }
}
