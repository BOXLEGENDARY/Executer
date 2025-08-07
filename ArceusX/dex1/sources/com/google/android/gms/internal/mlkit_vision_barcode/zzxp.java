package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.P9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzxp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxp> CREATOR = new P9();

    private final int f15480d;

    private final String[] f15481e;

    public zzxp(int i7, String[] strArr) {
        this.f15480d = i7;
        this.f15481e = strArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15480d);
        C2679b.v(parcel, 2, this.f15481e, false);
        C2679b.b(parcel, iA);
    }
}
