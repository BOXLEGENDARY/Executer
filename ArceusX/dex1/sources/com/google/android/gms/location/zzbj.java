package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

@Deprecated
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new d();

    private final String f16223d;

    private final String f16224e;

    private final String f16225i;

    zzbj(String str, String str2, String str3) {
        this.f16225i = str;
        this.f16223d = str2;
        this.f16224e = str3;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, this.f16223d, false);
        C2679b.u(parcel, 2, this.f16224e, false);
        C2679b.u(parcel, 5, this.f16225i, false);
        C2679b.b(parcel, iA);
    }
}
