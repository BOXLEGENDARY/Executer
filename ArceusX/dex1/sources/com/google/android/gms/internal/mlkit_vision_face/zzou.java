package com.google.android.gms.internal.mlkit_vision_face;

import R3.C6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new C6();

    private final int f15677d;

    private final int f15678e;

    private final int f15679i;

    private final int f15680v;

    private final boolean f15681w;

    private final float f15682y;

    public zzou(int i7, int i8, int i9, int i10, boolean z7, float f7) {
        this.f15677d = i7;
        this.f15678e = i8;
        this.f15679i = i9;
        this.f15680v = i10;
        this.f15681w = z7;
        this.f15682y = f7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15677d);
        C2679b.m(parcel, 2, this.f15678e);
        C2679b.m(parcel, 3, this.f15679i);
        C2679b.m(parcel, 4, this.f15680v);
        C2679b.c(parcel, 5, this.f15681w);
        C2679b.j(parcel, 6, this.f15682y);
        C2679b.b(parcel, iA);
    }
}
