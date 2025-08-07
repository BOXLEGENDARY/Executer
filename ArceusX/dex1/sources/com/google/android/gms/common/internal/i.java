package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import o3.C2678a;

public final class i implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        boolean zN = false;
        boolean zN2 = false;
        IBinder iBinderU = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                iBinderU = C2678a.u(parcel, iT);
            } else if (iM == 3) {
                connectionResult = (ConnectionResult) C2678a.f(parcel, iT, ConnectionResult.CREATOR);
            } else if (iM == 4) {
                zN = C2678a.n(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                zN2 = C2678a.n(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zav(iV, iBinderU, connectionResult, zN, zN2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zav[i7];
    }
}
