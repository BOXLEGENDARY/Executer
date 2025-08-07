package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.ea;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzxx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxx> CREATOR = new ea();

    private final int f15531d;

    private final String f15532e;

    public zzxx(int i7, String str) {
        this.f15531d = i7;
        this.f15532e = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15531d);
        C2679b.u(parcel, 2, this.f15532e, false);
        C2679b.b(parcel, iA);
    }
}
