package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class a implements Parcelable.Creator<LocationAvailability> {
    @Override
    public final LocationAvailability createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 1000;
        int iV2 = 1;
        int iV3 = 1;
        long jX = 0;
        zzbo[] zzboVarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV2 = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                iV3 = C2678a.v(parcel, iT);
            } else if (iM == 3) {
                jX = C2678a.x(parcel, iT);
            } else if (iM == 4) {
                iV = C2678a.v(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                zzboVarArr = (zzbo[]) C2678a.j(parcel, iT, zzbo.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new LocationAvailability(iV, iV2, iV3, jX, zzboVarArr);
    }

    @Override
    public final LocationAvailability[] newArray(int i7) {
        return new LocationAvailability[i7];
    }
}
