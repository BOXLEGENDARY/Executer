package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class C implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        boolean zN = false;
        int iV = 0;
        String strG = null;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                zN = C2678a.n(parcel, iT);
            } else if (iM == 2) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 3) {
                iV2 = C2678a.v(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                iV = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzq(zN, strG, iV2, iV);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzq[i7];
    }
}
