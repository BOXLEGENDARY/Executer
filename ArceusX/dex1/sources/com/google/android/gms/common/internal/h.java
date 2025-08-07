package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import o3.C2678a;

public final class h implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        Account account = null;
        int iV = 0;
        int iV2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                account = (Account) C2678a.f(parcel, iT, Account.CREATOR);
            } else if (iM == 3) {
                iV2 = C2678a.v(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C2678a.f(parcel, iT, GoogleSignInAccount.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new zat(iV, account, iV2, googleSignInAccount);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zat[i7];
    }
}
