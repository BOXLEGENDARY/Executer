package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new j();

    private final String f15622d;

    private final String f15623e;

    public zzo(String str, String str2) {
        this.f15622d = str;
        this.f15623e = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, this.f15622d, false);
        C2679b.u(parcel, 2, this.f15623e, false);
        C2679b.b(parcel, iA);
    }
}
