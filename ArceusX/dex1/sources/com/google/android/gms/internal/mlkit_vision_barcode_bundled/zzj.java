package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.v;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new v();

    private final int f15605d;

    private final String f15606e;

    private final String f15607i;

    private final String f15608v;

    public zzj(int i7, String str, String str2, String str3) {
        this.f15605d = i7;
        this.f15606e = str;
        this.f15607i = str2;
        this.f15608v = str3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15605d);
        C2679b.u(parcel, 2, this.f15606e, false);
        C2679b.u(parcel, 3, this.f15607i, false);
        C2679b.u(parcel, 4, this.f15608v, false);
        C2679b.b(parcel, iA);
    }
}
