package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new w();

    private final double f15609d;

    private final double f15610e;

    public zzk(double d7, double d8) {
        this.f15609d = d7;
        this.f15610e = d8;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.h(parcel, 1, this.f15609d);
        C2679b.h(parcel, 2, this.f15610e);
        C2679b.b(parcel, iA);
    }
}
