package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import o3.C2678a;

public final class e implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        ConnectionResult connectionResult = null;
        int iV = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                connectionResult = (ConnectionResult) C2678a.f(parcel, iT, ConnectionResult.CREATOR);
            } else if (iM != 3) {
                C2678a.B(parcel, iT);
            } else {
                zavVar = (zav) C2678a.f(parcel, iT, zav.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new zak(iV, connectionResult, zavVar);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zak[i7];
    }
}
