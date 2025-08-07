package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class c implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        boolean zN = false;
        int iV = 0;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 2:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 3:
                    strG3 = C2678a.g(parcel, iT);
                    break;
                case 4:
                    strG4 = C2678a.g(parcel, iT);
                    break;
                case 5:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 6:
                    iV = C2678a.v(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new GetSignInIntentRequest(strG, strG2, strG3, strG4, zN, iV);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new GetSignInIntentRequest[i7];
    }
}
