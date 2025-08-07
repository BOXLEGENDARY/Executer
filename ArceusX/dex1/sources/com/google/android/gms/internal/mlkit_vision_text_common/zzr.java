package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.C1385m8;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C1385m8();

    public final zzn[] f15723d;

    public final zzf f15724e;

    public final zzf f15725i;

    public final String f15726v;

    public final float f15727w;

    public final String f15728y;

    public final boolean f15729z;

    public zzr(zzn[] zznVarArr, zzf zzfVar, zzf zzfVar2, String str, float f7, String str2, boolean z7) {
        this.f15723d = zznVarArr;
        this.f15724e = zzfVar;
        this.f15725i = zzfVar2;
        this.f15726v = str;
        this.f15727w = f7;
        this.f15728y = str2;
        this.f15729z = z7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        zzn[] zznVarArr = this.f15723d;
        int iA = C2679b.a(parcel);
        C2679b.x(parcel, 2, zznVarArr, i7, false);
        C2679b.s(parcel, 3, this.f15724e, i7, false);
        C2679b.s(parcel, 4, this.f15725i, i7, false);
        C2679b.u(parcel, 5, this.f15726v, false);
        C2679b.j(parcel, 6, this.f15727w);
        C2679b.u(parcel, 7, this.f15728y, false);
        C2679b.c(parcel, 8, this.f15729z);
        C2679b.b(parcel, iA);
    }
}
