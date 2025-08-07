package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class b implements Parcelable.Creator<LocationRequest> {
    @Override
    public final LocationRequest createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 102;
        long jX = 3600000;
        long jX2 = 600000;
        boolean zN = false;
        boolean zN2 = false;
        long jX3 = Long.MAX_VALUE;
        int iV2 = Integer.MAX_VALUE;
        float fR = 0.0f;
        long jX4 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 2:
                    jX = C2678a.x(parcel, iT);
                    break;
                case 3:
                    jX2 = C2678a.x(parcel, iT);
                    break;
                case 4:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 5:
                    jX3 = C2678a.x(parcel, iT);
                    break;
                case 6:
                    iV2 = C2678a.v(parcel, iT);
                    break;
                case 7:
                    fR = C2678a.r(parcel, iT);
                    break;
                case 8:
                    jX4 = C2678a.x(parcel, iT);
                    break;
                case 9:
                    zN2 = C2678a.n(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new LocationRequest(iV, jX, jX2, zN, jX3, iV2, fR, jX4, zN2);
    }

    @Override
    public final LocationRequest[] newArray(int i7) {
        return new LocationRequest[i7];
    }
}
