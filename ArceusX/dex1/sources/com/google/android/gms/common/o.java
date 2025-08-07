package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class o implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        PendingIntent pendingIntent = null;
        int iV = 0;
        int iV2 = 0;
        String strG = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                iV2 = C2678a.v(parcel, iT);
            } else if (iM == 3) {
                pendingIntent = (PendingIntent) C2678a.f(parcel, iT, PendingIntent.CREATOR);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                strG = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new ConnectionResult(iV, iV2, pendingIntent, strG);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new ConnectionResult[i7];
    }
}
