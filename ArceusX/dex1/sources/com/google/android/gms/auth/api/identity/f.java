package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import o3.C2678a;

public final class f implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        byte[] bArrB = null;
        boolean zN = false;
        String strG = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                zN = C2678a.n(parcel, iT);
            } else if (iM == 2) {
                bArrB = C2678a.b(parcel, iT);
            } else if (iM != 3) {
                C2678a.B(parcel, iT);
            } else {
                strG = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new BeginSignInRequest.PasskeysRequestOptions(zN, bArrB, strG);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new BeginSignInRequest.PasskeysRequestOptions[i7];
    }
}
