package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d3.C2385d;
import o3.C2679b;

public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C2385d();

    private final String f13890d;

    private final String f13891e;

    public zza(String str, String str2) {
        this.f13890d = str;
        this.f13891e = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, this.f13890d, false);
        C2679b.u(parcel, 2, this.f13891e, false);
        C2679b.b(parcel, iA);
    }
}
