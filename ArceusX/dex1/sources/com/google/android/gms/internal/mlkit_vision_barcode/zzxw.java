package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.da;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzxw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxw> CREATOR = new da();

    private final String f15524d;

    private final String f15525e;

    private final String f15526i;

    private final String f15527v;

    private final String f15528w;

    private final String f15529y;

    private final String f15530z;

    public zzxw(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f15524d = str;
        this.f15525e = str2;
        this.f15526i = str3;
        this.f15527v = str4;
        this.f15528w = str5;
        this.f15529y = str6;
        this.f15530z = str7;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15524d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.u(parcel, 2, this.f15525e, false);
        C2679b.u(parcel, 3, this.f15526i, false);
        C2679b.u(parcel, 4, this.f15527v, false);
        C2679b.u(parcel, 5, this.f15528w, false);
        C2679b.u(parcel, 6, this.f15529y, false);
        C2679b.u(parcel, 7, this.f15530z, false);
        C2679b.b(parcel, iA);
    }
}
