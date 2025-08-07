package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class m implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        UvmEntries uvmEntries = null;
        zzf zzfVar = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        zzh zzhVar = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                uvmEntries = (UvmEntries) C2678a.f(parcel, iT, UvmEntries.CREATOR);
            } else if (iM == 2) {
                zzfVar = (zzf) C2678a.f(parcel, iT, zzf.CREATOR);
            } else if (iM == 3) {
                authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) C2678a.f(parcel, iT, AuthenticationExtensionsCredPropsOutputs.CREATOR);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                zzhVar = (zzh) C2678a.f(parcel, iT, zzh.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new AuthenticationExtensionsClientOutputs[i7];
    }
}
