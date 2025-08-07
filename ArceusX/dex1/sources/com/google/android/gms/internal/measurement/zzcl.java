package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C1946p0();

    public final String f15388A;

    public final long f15389d;

    public final long f15390e;

    public final boolean f15391i;

    public final String f15392v;

    public final String f15393w;

    public final String f15394y;

    public final Bundle f15395z;

    public zzcl(long j7, long j8, boolean z7, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f15389d = j7;
        this.f15390e = j8;
        this.f15391i = z7;
        this.f15392v = str;
        this.f15393w = str2;
        this.f15394y = str3;
        this.f15395z = bundle;
        this.f15388A = str4;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.q(parcel, 1, this.f15389d);
        C2679b.q(parcel, 2, this.f15390e);
        C2679b.c(parcel, 3, this.f15391i);
        C2679b.u(parcel, 4, this.f15392v, false);
        C2679b.u(parcel, 5, this.f15393w, false);
        C2679b.u(parcel, 6, this.f15394y, false);
        C2679b.e(parcel, 7, this.f15395z, false);
        C2679b.u(parcel, 8, this.f15388A, false);
        C2679b.b(parcel, iA);
    }
}
