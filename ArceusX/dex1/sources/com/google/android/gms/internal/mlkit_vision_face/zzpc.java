package com.google.android.gms.internal.mlkit_vision_face;

import R3.I6;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzpc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpc> CREATOR = new I6();

    private final int f15699d;

    private final PointF f15700e;

    public zzpc(int i7, PointF pointF) {
        this.f15699d = i7;
        this.f15700e = pointF;
    }

    public final int l() {
        return this.f15699d;
    }

    public final PointF n() {
        return this.f15700e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15699d);
        C2679b.s(parcel, 2, this.f15700e, i7, false);
        C2679b.b(parcel, iA);
    }
}
