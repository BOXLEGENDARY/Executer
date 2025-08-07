package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.fa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzxy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxy> CREATOR = new fa();

    private final String f15533d;

    private final String f15534e;

    public zzxy(String str, String str2) {
        this.f15533d = str;
        this.f15534e = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15533d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.u(parcel, 2, this.f15534e, false);
        C2679b.b(parcel, iA);
    }
}
