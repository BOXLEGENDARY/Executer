package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o3.C2678a;

public final class c implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArrB = null;
        ArrayList arrayListK = null;
        Double dQ = null;
        ArrayList arrayListK2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer numW = null;
        TokenBinding tokenBinding = null;
        String strG = null;
        AuthenticationExtensions authenticationExtensions = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) C2678a.f(parcel, iT, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) C2678a.f(parcel, iT, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArrB = C2678a.b(parcel, iT);
                    break;
                case 5:
                    arrayListK = C2678a.k(parcel, iT, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    dQ = C2678a.q(parcel, iT);
                    break;
                case 7:
                    arrayListK2 = C2678a.k(parcel, iT, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) C2678a.f(parcel, iT, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case 9:
                    numW = C2678a.w(parcel, iT);
                    break;
                case 10:
                    tokenBinding = (TokenBinding) C2678a.f(parcel, iT, TokenBinding.CREATOR);
                    break;
                case 11:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 12:
                    authenticationExtensions = (AuthenticationExtensions) C2678a.f(parcel, iT, AuthenticationExtensions.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrB, arrayListK, dQ, arrayListK2, authenticatorSelectionCriteria, numW, tokenBinding, strG, authenticationExtensions);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new PublicKeyCredentialCreationOptions[i7];
    }
}
