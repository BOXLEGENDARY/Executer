package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.ArrayList;
import o3.C2678a;

public final class d implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        ArrayList<String> arrayListI = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 2:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 3:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 4:
                    zN2 = C2678a.n(parcel, iT);
                    break;
                case 5:
                    strG3 = C2678a.g(parcel, iT);
                    break;
                case 6:
                    arrayListI = C2678a.i(parcel, iT);
                    break;
                case 7:
                    zN3 = C2678a.n(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zN, strG, strG2, zN2, strG3, arrayListI, zN3);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i7];
    }
}
