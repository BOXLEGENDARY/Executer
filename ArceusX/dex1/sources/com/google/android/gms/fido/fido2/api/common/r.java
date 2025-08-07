package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class r implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        Boolean boolO = null;
        String strG2 = null;
        String strG3 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 3) {
                boolO = C2678a.o(parcel, iT);
            } else if (iM == 4) {
                strG2 = C2678a.g(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                strG3 = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new AuthenticatorSelectionCriteria(strG, boolO, strG2, strG3);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new AuthenticatorSelectionCriteria[i7];
    }
}
