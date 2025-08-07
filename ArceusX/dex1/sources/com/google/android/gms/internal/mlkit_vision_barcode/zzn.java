package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.C0566b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C0566b();

    public int f15441d;

    public String f15442e;

    public String f15443i;

    public String f15444v;

    public zzn() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, this.f15441d);
        C2679b.u(parcel, 3, this.f15442e, false);
        C2679b.u(parcel, 4, this.f15443i, false);
        C2679b.u(parcel, 5, this.f15444v, false);
        C2679b.b(parcel, iA);
    }

    public zzn(int i7, String str, String str2, String str3) {
        this.f15441d = i7;
        this.f15442e = str;
        this.f15443i = str2;
        this.f15444v = str3;
    }
}
