package com.google.android.gms.internal.mlkit_vision_face;

import R3.B6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import o3.C2679b;

public final class zzos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzos> CREATOR = new B6();

    private final int f15675d;

    private final List f15676e;

    public zzos(int i7, List list) {
        this.f15675d = i7;
        this.f15676e = list;
    }

    public final int l() {
        return this.f15675d;
    }

    public final List n() {
        return this.f15676e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15675d);
        C2679b.y(parcel, 2, this.f15676e, false);
        C2679b.b(parcel, iA);
    }
}
