package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.J9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new J9();

    public String f15413d;

    public String f15414e;

    public String f15415i;

    public String f15416v;

    public String f15417w;

    public zzj f15418y;

    public zzj f15419z;

    public zzk() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, this.f15413d, false);
        C2679b.u(parcel, 3, this.f15414e, false);
        C2679b.u(parcel, 4, this.f15415i, false);
        C2679b.u(parcel, 5, this.f15416v, false);
        C2679b.u(parcel, 6, this.f15417w, false);
        C2679b.s(parcel, 7, this.f15418y, i7, false);
        C2679b.s(parcel, 8, this.f15419z, i7, false);
        C2679b.b(parcel, iA);
    }

    public zzk(String str, String str2, String str3, String str4, String str5, zzj zzjVar, zzj zzjVar2) {
        this.f15413d = str;
        this.f15414e = str2;
        this.f15415i = str3;
        this.f15416v = str4;
        this.f15417w = str5;
        this.f15418y = zzjVar;
        this.f15419z = zzjVar2;
    }
}
