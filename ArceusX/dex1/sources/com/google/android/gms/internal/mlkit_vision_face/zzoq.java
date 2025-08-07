package com.google.android.gms.internal.mlkit_vision_face;

import R3.A6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new A6();

    private final int f15670d;

    private final int f15671e;

    private final int f15672i;

    private final int f15673v;

    private final long f15674w;

    public zzoq(int i7, int i8, int i9, int i10, long j7) {
        this.f15670d = i7;
        this.f15671e = i8;
        this.f15672i = i9;
        this.f15673v = i10;
        this.f15674w = j7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15670d);
        C2679b.m(parcel, 2, this.f15671e);
        C2679b.m(parcel, 3, this.f15672i);
        C2679b.m(parcel, 4, this.f15673v);
        C2679b.q(parcel, 5, this.f15674w);
        C2679b.b(parcel, iA);
    }
}
