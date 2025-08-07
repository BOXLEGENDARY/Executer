package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import o3.C2678a;

public final class e implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        boolean zN = false;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                zN = C2678a.n(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                strG = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new BeginSignInRequest.PasskeyJsonRequestOptions(zN, strG);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new BeginSignInRequest.PasskeyJsonRequestOptions[i7];
    }
}
