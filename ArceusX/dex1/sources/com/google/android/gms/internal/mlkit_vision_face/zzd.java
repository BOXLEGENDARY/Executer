package com.google.android.gms.internal.mlkit_vision_face;

import R3.C1045d1;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C1045d1();

    public final PointF[] f15643d;

    public final int f15644e;

    public zzd(PointF[] pointFArr, int i7) {
        this.f15643d = pointFArr;
        this.f15644e = i7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.x(parcel, 2, this.f15643d, i7, false);
        C2679b.m(parcel, 3, this.f15644e);
        C2679b.b(parcel, iA);
    }
}
