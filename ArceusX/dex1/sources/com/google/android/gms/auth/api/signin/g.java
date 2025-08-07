package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import o3.C2678a;

public final class g implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = BuildConfig.FLAVOR;
        GoogleSignInAccount googleSignInAccount = null;
        String strG2 = BuildConfig.FLAVOR;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 4) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 7) {
                googleSignInAccount = (GoogleSignInAccount) C2678a.f(parcel, iT, GoogleSignInAccount.CREATOR);
            } else if (iM != 8) {
                C2678a.B(parcel, iT);
            } else {
                strG2 = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new SignInAccount(strG, googleSignInAccount, strG2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new SignInAccount[i7];
    }
}
