package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import o3.C2678a;

public final class a implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        boolean zN = false;
        int iV = 0;
        boolean zN2 = false;
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String strG = null;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) C2678a.f(parcel, iT, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                case 2:
                    googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) C2678a.f(parcel, iT, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                case 3:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 4:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 5:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 6:
                    passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) C2678a.f(parcel, iT, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                    break;
                case 7:
                    passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) C2678a.f(parcel, iT, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                    break;
                case 8:
                    zN2 = C2678a.n(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, strG, zN, iV, passkeysRequestOptions, passkeyJsonRequestOptions, zN2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new BeginSignInRequest[i7];
    }
}
