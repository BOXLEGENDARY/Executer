package com.google.android.gms.internal.mlkit_vision_face;

import R3.C1063f3;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C1063f3();

    public int f15660d;

    public int f15661e;

    public int f15662i;

    public boolean f15663v;

    public boolean f15664w;

    public float f15665y;

    public zzh(int i7, int i8, int i9, boolean z7, boolean z8, float f7) {
        this.f15660d = i7;
        this.f15661e = i8;
        this.f15662i = i9;
        this.f15663v = z7;
        this.f15664w = z8;
        this.f15665y = f7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, this.f15660d);
        C2679b.m(parcel, 3, this.f15661e);
        C2679b.m(parcel, 4, this.f15662i);
        C2679b.c(parcel, 5, this.f15663v);
        C2679b.c(parcel, 6, this.f15664w);
        C2679b.j(parcel, 7, this.f15665y);
        C2679b.b(parcel, iA);
    }
}
