package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.ia;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzyu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyu> CREATOR = new ia();

    private final int f15557d;

    private final int f15558e;

    private final int f15559i;

    private final int f15560v;

    private final long f15561w;

    public zzyu(int i7, int i8, int i9, int i10, long j7) {
        this.f15557d = i7;
        this.f15558e = i8;
        this.f15559i = i9;
        this.f15560v = i10;
        this.f15561w = j7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f15557d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, i8);
        C2679b.m(parcel, 2, this.f15558e);
        C2679b.m(parcel, 3, this.f15559i);
        C2679b.m(parcel, 4, this.f15560v);
        C2679b.q(parcel, 5, this.f15561w);
        C2679b.b(parcel, iA);
    }
}
