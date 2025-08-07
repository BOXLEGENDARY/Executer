package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.E9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzuq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuq> CREATOR = new E9();

    private final int f15730d;

    private final int f15731e;

    private final int f15732i;

    private final int f15733v;

    private final long f15734w;

    public zzuq(int i7, int i8, int i9, int i10, long j7) {
        this.f15730d = i7;
        this.f15731e = i8;
        this.f15732i = i9;
        this.f15733v = i10;
        this.f15734w = j7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f15730d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, i8);
        C2679b.m(parcel, 2, this.f15731e);
        C2679b.m(parcel, 3, this.f15732i);
        C2679b.m(parcel, 4, this.f15733v);
        C2679b.q(parcel, 5, this.f15734w);
        C2679b.b(parcel, iA);
    }
}
