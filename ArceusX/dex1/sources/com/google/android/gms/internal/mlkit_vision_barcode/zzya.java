package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.ha;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzya extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzya> CREATOR = new ha();

    private final String f15537d;

    private final String f15538e;

    private final int f15539i;

    public zzya(String str, String str2, int i7) {
        this.f15537d = str;
        this.f15538e = str2;
        this.f15539i = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15537d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.u(parcel, 2, this.f15538e, false);
        C2679b.m(parcel, 3, this.f15539i);
        C2679b.b(parcel, iA);
    }
}
