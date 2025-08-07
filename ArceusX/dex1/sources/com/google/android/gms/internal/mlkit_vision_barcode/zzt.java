package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.C0632h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new C0632h();

    public String f15460d;

    public String f15461e;

    public int f15462i;

    public zzt() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, this.f15460d, false);
        C2679b.u(parcel, 3, this.f15461e, false);
        C2679b.m(parcel, 4, this.f15462i);
        C2679b.b(parcel, iA);
    }

    public zzt(String str, String str2, int i7) {
        this.f15460d = str;
        this.f15461e = str2;
        this.f15462i = i7;
    }
}
