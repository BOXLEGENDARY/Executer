package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class b implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            if (C2678a.m(iT) != 1) {
                C2678a.B(parcel, iT);
            } else {
                iV = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new GetPhoneNumberHintIntentRequest(iV);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new GetPhoneNumberHintIntentRequest[i7];
    }
}
