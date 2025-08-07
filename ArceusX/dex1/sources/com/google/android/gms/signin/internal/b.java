package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class b implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        Intent intent = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                iV2 = C2678a.v(parcel, iT);
            } else if (iM != 3) {
                C2678a.B(parcel, iT);
            } else {
                intent = (Intent) C2678a.f(parcel, iT, Intent.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new zaa(iV, iV2, intent);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zaa[i7];
    }
}
