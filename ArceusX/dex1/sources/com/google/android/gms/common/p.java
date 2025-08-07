package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class p implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        long jX = -1;
        int iV = 0;
        String strG = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 2) {
                iV = C2678a.v(parcel, iT);
            } else if (iM != 3) {
                C2678a.B(parcel, iT);
            } else {
                jX = C2678a.x(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new Feature(strG, iV, jX);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new Feature[i7];
    }
}
