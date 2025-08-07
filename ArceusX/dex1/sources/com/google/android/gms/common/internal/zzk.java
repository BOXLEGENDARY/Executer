package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new r();

    Bundle f14350d;

    Feature[] f14351e;

    int f14352i;

    ConnectionTelemetryConfiguration f14353v;

    zzk(Bundle bundle, Feature[] featureArr, int i7, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f14350d = bundle;
        this.f14351e = featureArr;
        this.f14352i = i7;
        this.f14353v = connectionTelemetryConfiguration;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.e(parcel, 1, this.f14350d, false);
        C2679b.x(parcel, 2, this.f14351e, i7, false);
        C2679b.m(parcel, 3, this.f14352i);
        C2679b.s(parcel, 4, this.f14353v, i7, false);
        C2679b.b(parcel, iA);
    }

    public zzk() {
    }
}
