package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import o3.C2678a;

public final class j implements Parcelable.Creator<zzba> {
    @Override
    public final zzba createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        List<ClientIdentity> listK = zzba.f14619E;
        LocationRequest locationRequest = null;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        boolean zN4 = false;
        boolean zN5 = false;
        long jX = Long.MAX_VALUE;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM != 1) {
                switch (iM) {
                    case 5:
                        listK = C2678a.k(parcel, iT, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        strG = C2678a.g(parcel, iT);
                        break;
                    case 7:
                        zN = C2678a.n(parcel, iT);
                        break;
                    case 8:
                        zN2 = C2678a.n(parcel, iT);
                        break;
                    case 9:
                        zN3 = C2678a.n(parcel, iT);
                        break;
                    case 10:
                        strG2 = C2678a.g(parcel, iT);
                        break;
                    case 11:
                        zN4 = C2678a.n(parcel, iT);
                        break;
                    case 12:
                        zN5 = C2678a.n(parcel, iT);
                        break;
                    case 13:
                        strG3 = C2678a.g(parcel, iT);
                        break;
                    case 14:
                        jX = C2678a.x(parcel, iT);
                        break;
                    default:
                        C2678a.B(parcel, iT);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) C2678a.f(parcel, iT, LocationRequest.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new zzba(locationRequest, listK, strG, zN, zN2, zN3, strG2, zN4, zN5, strG3, jX);
    }

    @Override
    public final zzba[] newArray(int i7) {
        return new zzba[i7];
    }
}
