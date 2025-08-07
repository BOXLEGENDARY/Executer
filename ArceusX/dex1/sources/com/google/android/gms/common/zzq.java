package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C();

    private final boolean f14411d;

    private final String f14412e;

    private final int f14413i;

    private final int f14414v;

    zzq(boolean z7, String str, int i7, int i8) {
        this.f14411d = z7;
        this.f14412e = str;
        this.f14413i = I.a(i7) - 1;
        this.f14414v = q.a(i8) - 1;
    }

    public final String l() {
        return this.f14412e;
    }

    public final boolean n() {
        return this.f14411d;
    }

    public final int o() {
        return q.a(this.f14414v);
    }

    public final int p() {
        return I.a(this.f14413i);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.c(parcel, 1, this.f14411d);
        C2679b.u(parcel, 2, this.f14412e, false);
        C2679b.m(parcel, 3, this.f14413i);
        C2679b.m(parcel, 4, this.f14414v);
        C2679b.b(parcel, iA);
    }
}
