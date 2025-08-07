package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import o3.C2678a;

public final class r implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        Bundle bundleA = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iV = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                bundleA = C2678a.a(parcel, iT);
            } else if (iM == 2) {
                featureArr = (Feature[]) C2678a.j(parcel, iT, Feature.CREATOR);
            } else if (iM == 3) {
                iV = C2678a.v(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) C2678a.f(parcel, iT, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new zzk(bundleA, featureArr, iV, connectionTelemetryConfiguration);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzk[i7];
    }
}
