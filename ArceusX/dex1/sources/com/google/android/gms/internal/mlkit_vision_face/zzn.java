package com.google.android.gms.internal.mlkit_vision_face;

import R3.C1106k6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C1106k6();

    public final int f15666d;

    public final float f15667e;

    public final float f15668i;

    public final int f15669v;

    public zzn(int i7, float f7, float f8, int i8) {
        this.f15666d = i7;
        this.f15667e = f7;
        this.f15668i = f8;
        this.f15669v = i8;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15666d);
        C2679b.j(parcel, 2, this.f15667e);
        C2679b.j(parcel, 3, this.f15668i);
        C2679b.m(parcel, 4, this.f15669v);
        C2679b.b(parcel, iA);
    }
}
