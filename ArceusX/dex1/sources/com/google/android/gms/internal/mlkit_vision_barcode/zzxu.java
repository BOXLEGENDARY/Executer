package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.X9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzxu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxu> CREATOR = new X9();

    private final int f15518d;

    private final String f15519e;

    private final String f15520i;

    private final String f15521v;

    public zzxu(int i7, String str, String str2, String str3) {
        this.f15518d = i7;
        this.f15519e = str;
        this.f15520i = str2;
        this.f15521v = str3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15518d);
        C2679b.u(parcel, 2, this.f15519e, false);
        C2679b.u(parcel, 3, this.f15520i, false);
        C2679b.u(parcel, 4, this.f15521v, false);
        C2679b.b(parcel, iA);
    }
}
