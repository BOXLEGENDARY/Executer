package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.o;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new o();

    private final int f15567d;

    private final String[] f15568e;

    public zze(int i7, String[] strArr) {
        this.f15567d = i7;
        this.f15568e = strArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15567d);
        C2679b.v(parcel, 2, this.f15568e, false);
        C2679b.b(parcel, iA);
    }
}
