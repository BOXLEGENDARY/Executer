package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.C0610f;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C0610f();

    public String f15456d;

    public String f15457e;

    public zzr() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, this.f15456d, false);
        C2679b.u(parcel, 3, this.f15457e, false);
        C2679b.b(parcel, iA);
    }

    public zzr(String str, String str2) {
        this.f15456d = str;
        this.f15457e = str2;
    }
}
