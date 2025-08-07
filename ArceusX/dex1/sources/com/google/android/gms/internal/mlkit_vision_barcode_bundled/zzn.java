package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.i;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new i();

    private final String f15620d;

    private final String f15621e;

    public zzn(String str, String str2) {
        this.f15620d = str;
        this.f15621e = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, this.f15620d, false);
        C2679b.u(parcel, 2, this.f15621e, false);
        C2679b.b(parcel, iA);
    }
}
