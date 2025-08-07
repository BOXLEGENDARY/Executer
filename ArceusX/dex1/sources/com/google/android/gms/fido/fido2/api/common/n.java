package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class n implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        zzs zzsVar = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        zzz zzzVar = null;
        zzab zzabVar = null;
        zzad zzadVar = null;
        zzu zzuVar = null;
        zzag zzagVar = null;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
        zzai zzaiVar = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 2:
                    fidoAppIdExtension = (FidoAppIdExtension) C2678a.f(parcel, iT, FidoAppIdExtension.CREATOR);
                    break;
                case 3:
                    zzsVar = (zzs) C2678a.f(parcel, iT, zzs.CREATOR);
                    break;
                case 4:
                    userVerificationMethodExtension = (UserVerificationMethodExtension) C2678a.f(parcel, iT, UserVerificationMethodExtension.CREATOR);
                    break;
                case 5:
                    zzzVar = (zzz) C2678a.f(parcel, iT, zzz.CREATOR);
                    break;
                case 6:
                    zzabVar = (zzab) C2678a.f(parcel, iT, zzab.CREATOR);
                    break;
                case 7:
                    zzadVar = (zzad) C2678a.f(parcel, iT, zzad.CREATOR);
                    break;
                case 8:
                    zzuVar = (zzu) C2678a.f(parcel, iT, zzu.CREATOR);
                    break;
                case 9:
                    zzagVar = (zzag) C2678a.f(parcel, iT, zzag.CREATOR);
                    break;
                case 10:
                    googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) C2678a.f(parcel, iT, GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                case 11:
                    zzaiVar = (zzai) C2678a.f(parcel, iT, zzai.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzaiVar);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new AuthenticationExtensions[i7];
    }
}
