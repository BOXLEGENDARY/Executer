package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.W9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzxt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxt> CREATOR = new W9();

    private final String f15504A;

    private final String f15505B;

    private final String f15506C;

    private final String f15507D;

    private final String f15508E;

    private final String f15509F;

    private final String f15510G;

    private final String f15511d;

    private final String f15512e;

    private final String f15513i;

    private final String f15514v;

    private final String f15515w;

    private final String f15516y;

    private final String f15517z;

    public zzxt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f15511d = str;
        this.f15512e = str2;
        this.f15513i = str3;
        this.f15514v = str4;
        this.f15515w = str5;
        this.f15516y = str6;
        this.f15517z = str7;
        this.f15504A = str8;
        this.f15505B = str9;
        this.f15506C = str10;
        this.f15507D = str11;
        this.f15508E = str12;
        this.f15509F = str13;
        this.f15510G = str14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15511d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.u(parcel, 2, this.f15512e, false);
        C2679b.u(parcel, 3, this.f15513i, false);
        C2679b.u(parcel, 4, this.f15514v, false);
        C2679b.u(parcel, 5, this.f15515w, false);
        C2679b.u(parcel, 6, this.f15516y, false);
        C2679b.u(parcel, 7, this.f15517z, false);
        C2679b.u(parcel, 8, this.f15504A, false);
        C2679b.u(parcel, 9, this.f15505B, false);
        C2679b.u(parcel, 10, this.f15506C, false);
        C2679b.u(parcel, 11, this.f15507D, false);
        C2679b.u(parcel, 12, this.f15508E, false);
        C2679b.u(parcel, 13, this.f15509F, false);
        C2679b.u(parcel, 14, this.f15510G, false);
        C2679b.b(parcel, iA);
    }
}
