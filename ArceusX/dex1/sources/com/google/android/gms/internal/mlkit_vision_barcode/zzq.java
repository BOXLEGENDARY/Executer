package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.C0599e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C0599e();

    public int f15454d;

    public String f15455e;

    public zzq() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, this.f15454d);
        C2679b.u(parcel, 3, this.f15455e, false);
        C2679b.b(parcel, iA);
    }

    public zzq(int i7, String str) {
        this.f15454d = i7;
        this.f15455e = str;
    }
}
