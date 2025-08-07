package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new g();

    private final String f15611d;

    private final String f15612e;

    private final String f15613i;

    private final String f15614v;

    private final String f15615w;

    private final String f15616y;

    private final String f15617z;

    public zzl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f15611d = str;
        this.f15612e = str2;
        this.f15613i = str3;
        this.f15614v = str4;
        this.f15615w = str5;
        this.f15616y = str6;
        this.f15617z = str7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, this.f15611d, false);
        C2679b.u(parcel, 2, this.f15612e, false);
        C2679b.u(parcel, 3, this.f15613i, false);
        C2679b.u(parcel, 4, this.f15614v, false);
        C2679b.u(parcel, 5, this.f15615w, false);
        C2679b.u(parcel, 6, this.f15616y, false);
        C2679b.u(parcel, 7, this.f15617z, false);
        C2679b.b(parcel, iA);
    }
}
