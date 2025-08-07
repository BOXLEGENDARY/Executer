package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class a implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        Bundle bundleA = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                iV2 = C2678a.v(parcel, iT);
            } else if (iM != 3) {
                C2678a.B(parcel, iT);
            } else {
                bundleA = C2678a.a(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new GoogleSignInOptionsExtensionParcelable(iV, iV2, bundleA);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new GoogleSignInOptionsExtensionParcelable[i7];
    }
}
