package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.ja;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new ja();

    public String f15427A;

    public String f15428B;

    public String f15429C;

    public String f15430D;

    public String f15431E;

    public String f15432F;

    public String f15433G;

    public String f15434d;

    public String f15435e;

    public String f15436i;

    public String f15437v;

    public String f15438w;

    public String f15439y;

    public String f15440z;

    public zzm() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, this.f15434d, false);
        C2679b.u(parcel, 3, this.f15435e, false);
        C2679b.u(parcel, 4, this.f15436i, false);
        C2679b.u(parcel, 5, this.f15437v, false);
        C2679b.u(parcel, 6, this.f15438w, false);
        C2679b.u(parcel, 7, this.f15439y, false);
        C2679b.u(parcel, 8, this.f15440z, false);
        C2679b.u(parcel, 9, this.f15427A, false);
        C2679b.u(parcel, 10, this.f15428B, false);
        C2679b.u(parcel, 11, this.f15429C, false);
        C2679b.u(parcel, 12, this.f15430D, false);
        C2679b.u(parcel, 13, this.f15431E, false);
        C2679b.u(parcel, 14, this.f15432F, false);
        C2679b.u(parcel, 15, this.f15433G, false);
        C2679b.b(parcel, iA);
    }

    public zzm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f15434d = str;
        this.f15435e = str2;
        this.f15436i = str3;
        this.f15437v = str4;
        this.f15438w = str5;
        this.f15439y = str6;
        this.f15440z = str7;
        this.f15427A = str8;
        this.f15428B = str9;
        this.f15429C = str10;
        this.f15430D = str11;
        this.f15431E = str12;
        this.f15432F = str13;
        this.f15433G = str14;
    }
}
