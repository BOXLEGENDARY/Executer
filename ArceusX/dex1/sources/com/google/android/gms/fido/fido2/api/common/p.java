package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class p implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        byte[] bArrB = null;
        byte[] bArrB2 = null;
        byte[] bArrB3 = null;
        String[] strArrH = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                bArrB = C2678a.b(parcel, iT);
            } else if (iM == 3) {
                bArrB2 = C2678a.b(parcel, iT);
            } else if (iM == 4) {
                bArrB3 = C2678a.b(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                strArrH = C2678a.h(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new AuthenticatorAttestationResponse(bArrB, bArrB2, bArrB3, strArrH);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new AuthenticatorAttestationResponse[i7];
    }
}
