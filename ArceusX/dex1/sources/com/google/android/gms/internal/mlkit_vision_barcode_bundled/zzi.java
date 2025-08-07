package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new u();

    private final String f15591A;

    private final String f15592B;

    private final String f15593C;

    private final String f15594D;

    private final String f15595E;

    private final String f15596F;

    private final String f15597G;

    private final String f15598d;

    private final String f15599e;

    private final String f15600i;

    private final String f15601v;

    private final String f15602w;

    private final String f15603y;

    private final String f15604z;

    public zzi(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f15598d = str;
        this.f15599e = str2;
        this.f15600i = str3;
        this.f15601v = str4;
        this.f15602w = str5;
        this.f15603y = str6;
        this.f15604z = str7;
        this.f15591A = str8;
        this.f15592B = str9;
        this.f15593C = str10;
        this.f15594D = str11;
        this.f15595E = str12;
        this.f15596F = str13;
        this.f15597G = str14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, this.f15598d, false);
        C2679b.u(parcel, 2, this.f15599e, false);
        C2679b.u(parcel, 3, this.f15600i, false);
        C2679b.u(parcel, 4, this.f15601v, false);
        C2679b.u(parcel, 5, this.f15602w, false);
        C2679b.u(parcel, 6, this.f15603y, false);
        C2679b.u(parcel, 7, this.f15604z, false);
        C2679b.u(parcel, 8, this.f15591A, false);
        C2679b.u(parcel, 9, this.f15592B, false);
        C2679b.u(parcel, 10, this.f15593C, false);
        C2679b.u(parcel, 11, this.f15594D, false);
        C2679b.u(parcel, 12, this.f15595E, false);
        C2679b.u(parcel, 13, this.f15596F, false);
        C2679b.u(parcel, 14, this.f15597G, false);
        C2679b.b(parcel, iA);
    }
}
