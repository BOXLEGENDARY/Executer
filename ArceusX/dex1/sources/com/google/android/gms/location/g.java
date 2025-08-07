package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class g implements Parcelable.Creator<zzs> {
    @Override
    public final zzs createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        boolean zN = true;
        long jX = 50;
        float fR = 0.0f;
        long jX2 = Long.MAX_VALUE;
        int iV = Integer.MAX_VALUE;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                zN = C2678a.n(parcel, iT);
            } else if (iM == 2) {
                jX = C2678a.x(parcel, iT);
            } else if (iM == 3) {
                fR = C2678a.r(parcel, iT);
            } else if (iM == 4) {
                jX2 = C2678a.x(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                iV = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzs(zN, jX, fR, jX2, iV);
    }

    @Override
    public final zzs[] newArray(int i7) {
        return new zzs[i7];
    }
}
