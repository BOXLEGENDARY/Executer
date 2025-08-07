package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class a implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                strG = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new Scope(iV, strG);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new Scope[i7];
    }
}
