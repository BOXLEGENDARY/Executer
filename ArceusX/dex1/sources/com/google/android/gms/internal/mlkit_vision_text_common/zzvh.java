package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.R9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzvh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvh> CREATOR = new R9();

    private final String f15756d;

    private final String f15757e;

    private final String f15758i;

    private final boolean f15759v;

    private final int f15760w;

    private final String f15761y;

    private final boolean f15762z;

    public zzvh(String str, String str2, String str3, boolean z7, int i7, String str4, boolean z8) {
        this.f15756d = str;
        this.f15757e = str2;
        this.f15758i = str3;
        this.f15761y = str4;
        this.f15760w = i7;
        this.f15759v = z7;
        this.f15762z = z8;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15756d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.u(parcel, 2, this.f15757e, false);
        C2679b.u(parcel, 3, this.f15758i, false);
        C2679b.c(parcel, 4, this.f15759v);
        C2679b.m(parcel, 5, this.f15760w);
        C2679b.u(parcel, 6, this.f15761y, false);
        C2679b.c(parcel, 7, this.f15762z);
        C2679b.b(parcel, iA);
    }
}
