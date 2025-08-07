package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.S9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzyd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyd> CREATOR = new S9();

    private final int f15555d;

    private final boolean f15556e;

    public zzyd(int i7, boolean z7) {
        this.f15555d = i7;
        this.f15556e = z7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f15555d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, i8);
        C2679b.c(parcel, 2, this.f15556e);
        C2679b.b(parcel, iA);
    }
}
