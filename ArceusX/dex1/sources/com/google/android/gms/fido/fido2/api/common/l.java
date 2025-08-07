package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class l implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        short sZ = 0;
        short sZ2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                sZ = C2678a.z(parcel, iT);
            } else if (iM != 3) {
                C2678a.B(parcel, iT);
            } else {
                sZ2 = C2678a.z(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new UvmEntry(iV, sZ, sZ2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new UvmEntry[i7];
    }
}
