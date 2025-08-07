package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.C0621g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C0621g();

    public String f15458d;

    public String f15459e;

    public zzs() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, this.f15458d, false);
        C2679b.u(parcel, 3, this.f15459e, false);
        C2679b.b(parcel, iA);
    }

    public zzs(String str, String str2) {
        this.f15458d = str;
        this.f15459e = str2;
    }
}
