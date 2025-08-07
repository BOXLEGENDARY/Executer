package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o3.C2678a;

public final class e implements Parcelable.Creator<LocationSettingsRequest> {
    @Override
    public final LocationSettingsRequest createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        ArrayList arrayListK = null;
        boolean zN = false;
        boolean zN2 = false;
        zzbj zzbjVar = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                arrayListK = C2678a.k(parcel, iT, LocationRequest.CREATOR);
            } else if (iM == 2) {
                zN = C2678a.n(parcel, iT);
            } else if (iM == 3) {
                zN2 = C2678a.n(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                zzbjVar = (zzbj) C2678a.f(parcel, iT, zzbj.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new LocationSettingsRequest(arrayListK, zN, zN2, zzbjVar);
    }

    @Override
    public final LocationSettingsRequest[] newArray(int i7) {
        return new LocationSettingsRequest[i7];
    }
}
