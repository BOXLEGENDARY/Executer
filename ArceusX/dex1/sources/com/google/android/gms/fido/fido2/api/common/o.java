package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class o implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        byte[] bArrB = null;
        byte[] bArrB2 = null;
        byte[] bArrB3 = null;
        byte[] bArrB4 = null;
        byte[] bArrB5 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                bArrB = C2678a.b(parcel, iT);
            } else if (iM == 3) {
                bArrB2 = C2678a.b(parcel, iT);
            } else if (iM == 4) {
                bArrB3 = C2678a.b(parcel, iT);
            } else if (iM == 5) {
                bArrB4 = C2678a.b(parcel, iT);
            } else if (iM != 6) {
                C2678a.B(parcel, iT);
            } else {
                bArrB5 = C2678a.b(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new AuthenticatorAssertionResponse(bArrB, bArrB2, bArrB3, bArrB4, bArrB5);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new AuthenticatorAssertionResponse[i7];
    }
}
