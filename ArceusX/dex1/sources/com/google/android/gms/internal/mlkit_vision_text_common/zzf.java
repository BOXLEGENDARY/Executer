package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.C1291e2;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C1291e2();

    public final int f15706d;

    public final int f15707e;

    public final int f15708i;

    public final int f15709v;

    public final float f15710w;

    public zzf(int i7, int i8, int i9, int i10, float f7) {
        this.f15706d = i7;
        this.f15707e = i8;
        this.f15708i = i9;
        this.f15709v = i10;
        this.f15710w = f7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f15706d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, i8);
        C2679b.m(parcel, 3, this.f15707e);
        C2679b.m(parcel, 4, this.f15708i);
        C2679b.m(parcel, 5, this.f15709v);
        C2679b.j(parcel, 6, this.f15710w);
        C2679b.b(parcel, iA);
    }
}
