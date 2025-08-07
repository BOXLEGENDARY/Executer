package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new k();

    private final String f15624d;

    private final String f15625e;

    private final int f15626i;

    public zzp(String str, String str2, int i7) {
        this.f15624d = str;
        this.f15625e = str2;
        this.f15626i = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, this.f15624d, false);
        C2679b.u(parcel, 2, this.f15625e, false);
        C2679b.m(parcel, 3, this.f15626i);
        C2679b.b(parcel, iA);
    }
}
