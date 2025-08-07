package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.ga;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzxz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxz> CREATOR = new ga();

    private final String f15535d;

    private final String f15536e;

    public zzxz(String str, String str2) {
        this.f15535d = str;
        this.f15536e = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15535d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.u(parcel, 2, this.f15536e, false);
        C2679b.b(parcel, iA);
    }
}
