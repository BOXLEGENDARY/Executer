package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2667y;
import o3.C2679b;

public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C2667y();

    private final int f14249A;

    private final int f14250B;

    private final int f14251d;

    private final int f14252e;

    private final int f14253i;

    private final long f14254v;

    private final long f14255w;

    private final String f14256y;

    private final String f14257z;

    @Deprecated
    public MethodInvocation(int i7, int i8, int i9, long j7, long j8, String str, String str2, int i10) {
        this(i7, i8, i9, j7, j8, str, str2, i10, -1);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14251d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, i8);
        C2679b.m(parcel, 2, this.f14252e);
        C2679b.m(parcel, 3, this.f14253i);
        C2679b.q(parcel, 4, this.f14254v);
        C2679b.q(parcel, 5, this.f14255w);
        C2679b.u(parcel, 6, this.f14256y, false);
        C2679b.u(parcel, 7, this.f14257z, false);
        C2679b.m(parcel, 8, this.f14249A);
        C2679b.m(parcel, 9, this.f14250B);
        C2679b.b(parcel, iA);
    }

    public MethodInvocation(int i7, int i8, int i9, long j7, long j8, String str, String str2, int i10, int i11) {
        this.f14251d = i7;
        this.f14252e = i8;
        this.f14253i = i9;
        this.f14254v = j7;
        this.f14255w = j8;
        this.f14256y = str;
        this.f14257z = str2;
        this.f14249A = i10;
        this.f14250B = i11;
    }
}
