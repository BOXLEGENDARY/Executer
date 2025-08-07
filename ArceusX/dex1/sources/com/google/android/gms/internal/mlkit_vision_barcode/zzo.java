package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.C0577c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C0577c();

    public double f15445d;

    public double f15446e;

    public zzo() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.h(parcel, 2, this.f15445d);
        C2679b.h(parcel, 3, this.f15446e);
        C2679b.b(parcel, iA);
    }

    public zzo(double d7, double d8) {
        this.f15445d = d7;
        this.f15446e = d8;
    }
}
