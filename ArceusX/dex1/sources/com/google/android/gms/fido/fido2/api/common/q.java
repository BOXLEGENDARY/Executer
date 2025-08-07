package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class q implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        String strG = null;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 3) {
                strG = C2678a.g(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                iV2 = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new AuthenticatorErrorResponse(iV, strG, iV2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new AuthenticatorErrorResponse[i7];
    }
}
