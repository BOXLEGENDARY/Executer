package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.C0588d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C0588d();

    public String f15447d;

    public String f15448e;

    public String f15449i;

    public String f15450v;

    public String f15451w;

    public String f15452y;

    public String f15453z;

    public zzp() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, this.f15447d, false);
        C2679b.u(parcel, 3, this.f15448e, false);
        C2679b.u(parcel, 4, this.f15449i, false);
        C2679b.u(parcel, 5, this.f15450v, false);
        C2679b.u(parcel, 6, this.f15451w, false);
        C2679b.u(parcel, 7, this.f15452y, false);
        C2679b.u(parcel, 8, this.f15453z, false);
        C2679b.b(parcel, iA);
    }

    public zzp(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f15447d = str;
        this.f15448e = str2;
        this.f15449i = str3;
        this.f15450v = str4;
        this.f15451w = str5;
        this.f15452y = str6;
        this.f15453z = str7;
    }
}
