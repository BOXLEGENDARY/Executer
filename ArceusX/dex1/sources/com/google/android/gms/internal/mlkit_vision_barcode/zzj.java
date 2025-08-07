package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.C0653i9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C0653i9();

    public String f15405A;

    public int f15406d;

    public int f15407e;

    public int f15408i;

    public int f15409v;

    public int f15410w;

    public int f15411y;

    public boolean f15412z;

    public zzj() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, this.f15406d);
        C2679b.m(parcel, 3, this.f15407e);
        C2679b.m(parcel, 4, this.f15408i);
        C2679b.m(parcel, 5, this.f15409v);
        C2679b.m(parcel, 6, this.f15410w);
        C2679b.m(parcel, 7, this.f15411y);
        C2679b.c(parcel, 8, this.f15412z);
        C2679b.u(parcel, 9, this.f15405A, false);
        C2679b.b(parcel, iA);
    }

    public zzj(int i7, int i8, int i9, int i10, int i11, int i12, boolean z7, String str) {
        this.f15406d = i7;
        this.f15407e = i8;
        this.f15408i = i9;
        this.f15409v = i10;
        this.f15410w = i11;
        this.f15411y = i12;
        this.f15412z = z7;
        this.f15405A = str;
    }
}
