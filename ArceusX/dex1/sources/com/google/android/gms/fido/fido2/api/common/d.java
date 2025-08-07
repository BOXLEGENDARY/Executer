package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class d implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        String strG2 = null;
        byte[] bArrB = null;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
        AuthenticatorErrorResponse authenticatorErrorResponse = null;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
        String strG3 = null;
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
                    bArrB = C2678a.b(parcel, iT);
                    break;
                case 4:
                    authenticatorAttestationResponse = (AuthenticatorAttestationResponse) C2678a.f(parcel, iT, AuthenticatorAttestationResponse.CREATOR);
                    break;
                case 5:
                    authenticatorAssertionResponse = (AuthenticatorAssertionResponse) C2678a.f(parcel, iT, AuthenticatorAssertionResponse.CREATOR);
                    break;
                case 6:
                    authenticatorErrorResponse = (AuthenticatorErrorResponse) C2678a.f(parcel, iT, AuthenticatorErrorResponse.CREATOR);
                    break;
                case 7:
                    authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) C2678a.f(parcel, iT, AuthenticationExtensionsClientOutputs.CREATOR);
                    break;
                case 8:
                    strG3 = C2678a.g(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new PublicKeyCredential(strG, strG2, bArrB, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, strG3);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new PublicKeyCredential[i7];
    }
}
