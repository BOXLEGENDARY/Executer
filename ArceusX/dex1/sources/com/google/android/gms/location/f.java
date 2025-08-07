package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class f implements Parcelable.Creator<zzbo> {
    @Override
    public final zzbo createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 1;
        int iV2 = 1;
        long jX = -1;
        long jX2 = -1;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                iV2 = C2678a.v(parcel, iT);
            } else if (iM == 3) {
                jX = C2678a.x(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                jX2 = C2678a.x(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzbo(iV, iV2, jX, jX2);
    }

    @Override
    public final zzbo[] newArray(int i7) {
        return new zzbo[i7];
    }
}
