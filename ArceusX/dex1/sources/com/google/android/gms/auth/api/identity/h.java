package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class h implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        SignInPassword signInPassword = null;
        String strG = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                signInPassword = (SignInPassword) C2678a.f(parcel, iT, SignInPassword.CREATOR);
            } else if (iM == 2) {
                strG = C2678a.g(parcel, iT);
            } else if (iM != 3) {
                C2678a.B(parcel, iT);
            } else {
                iV = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new SavePasswordRequest(signInPassword, strG, iV);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new SavePasswordRequest[i7];
    }
}
