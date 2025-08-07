package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import o3.C2679b;

public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new d();

    final int f17185d;

    final zat f17186e;

    zai(int i7, zat zatVar) {
        this.f17185d = i7;
        this.f17186e = zatVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f17185d);
        C2679b.s(parcel, 2, this.f17186e, i7, false);
        C2679b.b(parcel, iA);
    }
}
