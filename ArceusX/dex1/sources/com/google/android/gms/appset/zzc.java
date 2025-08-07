package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d3.C2386e;
import o3.C2679b;

public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C2386e();

    private final String f13892d;

    private final int f13893e;

    public zzc(String str, int i7) {
        this.f13892d = str;
        this.f13893e = i7;
    }

    public final int l() {
        return this.f13893e;
    }

    public final String n() {
        return this.f13892d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, this.f13892d, false);
        C2679b.m(parcel, 2, this.f13893e);
        C2679b.b(parcel, iA);
    }
}
