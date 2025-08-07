package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.Y9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzxv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxv> CREATOR = new Y9();

    private final double f15522d;

    private final double f15523e;

    public zzxv(double d7, double d8) {
        this.f15522d = d7;
        this.f15523e = d8;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.h(parcel, 1, this.f15522d);
        C2679b.h(parcel, 2, this.f15523e);
        C2679b.b(parcel, iA);
    }
}
