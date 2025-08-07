package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import o3.C2678a;

public final class e implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        ArrayList arrayListK = null;
        Account account = null;
        String strG = null;
        String strG2 = null;
        ArrayList arrayListK2 = null;
        String strG3 = null;
        int iV = 0;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 2:
                    arrayListK = C2678a.k(parcel, iT, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C2678a.f(parcel, iT, Account.CREATOR);
                    break;
                case 4:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 5:
                    zN2 = C2678a.n(parcel, iT);
                    break;
                case 6:
                    zN3 = C2678a.n(parcel, iT);
                    break;
                case 7:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 8:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 9:
                    arrayListK2 = C2678a.k(parcel, iT, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    strG3 = C2678a.g(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new GoogleSignInOptions(iV, arrayListK, account, zN, zN2, zN3, strG, strG2, arrayListK2, strG3);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new GoogleSignInOptions[i7];
    }
}
