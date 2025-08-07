package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import o3.C2678a;

public final class b implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        ConnectionResult connectionResult = null;
        int iV = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 3) {
                pendingIntent = (PendingIntent) C2678a.f(parcel, iT, PendingIntent.CREATOR);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                connectionResult = (ConnectionResult) C2678a.f(parcel, iT, ConnectionResult.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new Status(iV, strG, pendingIntent, connectionResult);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new Status[i7];
    }
}
