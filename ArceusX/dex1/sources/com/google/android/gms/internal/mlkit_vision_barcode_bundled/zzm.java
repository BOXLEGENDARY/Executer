package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new h();

    private final int f15618d;

    private final String f15619e;

    public zzm(int i7, String str) {
        this.f15618d = i7;
        this.f15619e = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15618d);
        C2679b.u(parcel, 2, this.f15619e, false);
        C2679b.b(parcel, iA);
    }
}
