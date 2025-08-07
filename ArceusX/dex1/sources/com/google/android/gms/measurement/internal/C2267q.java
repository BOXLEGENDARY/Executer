package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class C2267q implements Parcelable.Creator<zzar> {
    @Override
    public final zzar createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            if (C2678a.m(iT) != 2) {
                C2678a.B(parcel, iT);
            } else {
                bundleA = C2678a.a(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzar(bundleA);
    }

    @Override
    public final zzar[] newArray(int i7) {
        return new zzar[i7];
    }
}
