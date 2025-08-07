package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import o3.C2678a;

public final class c implements Parcelable.Creator<LocationResult> {
    @Override
    public final LocationResult createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        List<Location> listK = LocationResult.f16214e;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            if (C2678a.m(iT) != 1) {
                C2678a.B(parcel, iT);
            } else {
                listK = C2678a.k(parcel, iT, Location.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new LocationResult(listK);
    }

    @Override
    public final LocationResult[] newArray(int i7) {
        return new LocationResult[i7];
    }
}
