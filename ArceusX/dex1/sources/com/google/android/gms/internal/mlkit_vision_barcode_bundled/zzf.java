package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new r();

    private final String f15569A;

    private final int f15570d;

    private final int f15571e;

    private final int f15572i;

    private final int f15573v;

    private final int f15574w;

    private final int f15575y;

    private final boolean f15576z;

    public zzf(int i7, int i8, int i9, int i10, int i11, int i12, boolean z7, String str) {
        this.f15570d = i7;
        this.f15571e = i8;
        this.f15572i = i9;
        this.f15573v = i10;
        this.f15574w = i11;
        this.f15575y = i12;
        this.f15576z = z7;
        this.f15569A = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15570d);
        C2679b.m(parcel, 2, this.f15571e);
        C2679b.m(parcel, 3, this.f15572i);
        C2679b.m(parcel, 4, this.f15573v);
        C2679b.m(parcel, 5, this.f15574w);
        C2679b.m(parcel, 6, this.f15575y);
        C2679b.c(parcel, 7, this.f15576z);
        C2679b.u(parcel, 8, this.f15569A, false);
        C2679b.b(parcel, iA);
    }
}
