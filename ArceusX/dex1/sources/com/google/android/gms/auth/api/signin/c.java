package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import o3.C2678a;

public final class c implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        Uri uri = null;
        String strG5 = null;
        String strG6 = null;
        ArrayList arrayListK = null;
        String strG7 = null;
        String strG8 = null;
        long jX = 0;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 2:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 3:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 4:
                    strG3 = C2678a.g(parcel, iT);
                    break;
                case 5:
                    strG4 = C2678a.g(parcel, iT);
                    break;
                case 6:
                    uri = (Uri) C2678a.f(parcel, iT, Uri.CREATOR);
                    break;
                case 7:
                    strG5 = C2678a.g(parcel, iT);
                    break;
                case 8:
                    jX = C2678a.x(parcel, iT);
                    break;
                case 9:
                    strG6 = C2678a.g(parcel, iT);
                    break;
                case 10:
                    arrayListK = C2678a.k(parcel, iT, Scope.CREATOR);
                    break;
                case 11:
                    strG7 = C2678a.g(parcel, iT);
                    break;
                case 12:
                    strG8 = C2678a.g(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new GoogleSignInAccount(iV, strG, strG2, strG3, strG4, uri, strG5, jX, strG6, arrayListK, strG7, strG8);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new GoogleSignInAccount[i7];
    }
}
