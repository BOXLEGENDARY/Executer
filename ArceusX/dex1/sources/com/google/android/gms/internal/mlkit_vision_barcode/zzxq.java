package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.T9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzxq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxq> CREATOR = new T9();

    private final String f15482A;

    private final int f15483d;

    private final int f15484e;

    private final int f15485i;

    private final int f15486v;

    private final int f15487w;

    private final int f15488y;

    private final boolean f15489z;

    public zzxq(int i7, int i8, int i9, int i10, int i11, int i12, boolean z7, String str) {
        this.f15483d = i7;
        this.f15484e = i8;
        this.f15485i = i9;
        this.f15486v = i10;
        this.f15487w = i11;
        this.f15488y = i12;
        this.f15489z = z7;
        this.f15482A = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15483d);
        C2679b.m(parcel, 2, this.f15484e);
        C2679b.m(parcel, 3, this.f15485i);
        C2679b.m(parcel, 4, this.f15486v);
        C2679b.m(parcel, 5, this.f15487w);
        C2679b.m(parcel, 6, this.f15488y);
        C2679b.c(parcel, 7, this.f15489z);
        C2679b.u(parcel, 8, this.f15482A, false);
        C2679b.b(parcel, iA);
    }
}
