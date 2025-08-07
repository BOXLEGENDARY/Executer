package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.C1349j5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C1349j5();

    public final int f15711A;

    public final boolean f15712B;

    public final int f15713C;

    public final int f15714D;

    public final zzr[] f15715d;

    public final zzf f15716e;

    public final zzf f15717i;

    public final zzf f15718v;

    public final String f15719w;

    public final float f15720y;

    public final String f15721z;

    public zzl(zzr[] zzrVarArr, zzf zzfVar, zzf zzfVar2, zzf zzfVar3, String str, float f7, String str2, int i7, boolean z7, int i8, int i9) {
        this.f15715d = zzrVarArr;
        this.f15716e = zzfVar;
        this.f15717i = zzfVar2;
        this.f15718v = zzfVar3;
        this.f15719w = str;
        this.f15720y = f7;
        this.f15721z = str2;
        this.f15711A = i7;
        this.f15712B = z7;
        this.f15713C = i8;
        this.f15714D = i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        zzr[] zzrVarArr = this.f15715d;
        int iA = C2679b.a(parcel);
        C2679b.x(parcel, 2, zzrVarArr, i7, false);
        C2679b.s(parcel, 3, this.f15716e, i7, false);
        C2679b.s(parcel, 4, this.f15717i, i7, false);
        C2679b.s(parcel, 5, this.f15718v, i7, false);
        C2679b.u(parcel, 6, this.f15719w, false);
        C2679b.j(parcel, 7, this.f15720y);
        C2679b.u(parcel, 8, this.f15721z, false);
        C2679b.m(parcel, 9, this.f15711A);
        C2679b.c(parcel, 10, this.f15712B);
        C2679b.m(parcel, 11, this.f15713C);
        C2679b.m(parcel, 12, this.f15714D);
        C2679b.b(parcel, iA);
    }
}
