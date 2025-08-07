package com.google.android.gms.internal.mlkit_vision_face;

import R3.J6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new J6();

    public int f15694d;

    public int f15695e;

    public int f15696i;

    public long f15697v;

    public int f15698w;

    public zzp(int i7, int i8, int i9, long j7, int i10) {
        this.f15694d = i7;
        this.f15695e = i8;
        this.f15696i = i9;
        this.f15697v = j7;
        this.f15698w = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, this.f15694d);
        C2679b.m(parcel, 3, this.f15695e);
        C2679b.m(parcel, 4, this.f15696i);
        C2679b.q(parcel, 5, this.f15697v);
        C2679b.m(parcel, 6, this.f15698w);
        C2679b.b(parcel, iA);
    }
}
