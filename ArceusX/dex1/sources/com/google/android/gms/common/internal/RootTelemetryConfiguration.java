package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2635K;
import o3.C2679b;

public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C2635K();

    private final int f14258d;

    private final boolean f14259e;

    private final boolean f14260i;

    private final int f14261v;

    private final int f14262w;

    public RootTelemetryConfiguration(int i7, boolean z7, boolean z8, int i8, int i9) {
        this.f14258d = i7;
        this.f14259e = z7;
        this.f14260i = z8;
        this.f14261v = i8;
        this.f14262w = i9;
    }

    public int l() {
        return this.f14261v;
    }

    public int n() {
        return this.f14262w;
    }

    public boolean o() {
        return this.f14259e;
    }

    public boolean p() {
        return this.f14260i;
    }

    public int q() {
        return this.f14258d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, q());
        C2679b.c(parcel, 2, o());
        C2679b.c(parcel, 3, p());
        C2679b.m(parcel, 4, l());
        C2679b.m(parcel, 5, n());
        C2679b.b(parcel, iA);
    }
}
