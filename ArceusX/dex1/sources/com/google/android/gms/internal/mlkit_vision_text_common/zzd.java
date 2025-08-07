package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.C1279d1;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C1279d1();

    public int f15701d;

    public int f15702e;

    public int f15703i;

    public long f15704v;

    public int f15705w;

    public zzd(int i7, int i8, int i9, long j7, int i10) {
        this.f15701d = i7;
        this.f15702e = i8;
        this.f15703i = i9;
        this.f15704v = j7;
        this.f15705w = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, this.f15701d);
        C2679b.m(parcel, 3, this.f15702e);
        C2679b.m(parcel, 4, this.f15703i);
        C2679b.q(parcel, 5, this.f15704v);
        C2679b.m(parcel, 6, this.f15705w);
        C2679b.b(parcel, iA);
    }
}
