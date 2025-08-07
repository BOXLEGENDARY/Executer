package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.K1;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new K1();

    public int f15403d;

    public String[] f15404e;

    public zzi() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, this.f15403d);
        C2679b.v(parcel, 3, this.f15404e, false);
        C2679b.b(parcel, iA);
    }

    public zzi(int i7, String[] strArr) {
        this.f15403d = i7;
        this.f15404e = strArr;
    }
}
