package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class D implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        boolean zN = false;
        String strG = null;
        IBinder iBinderU = null;
        boolean zN2 = false;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 2) {
                iBinderU = C2678a.u(parcel, iT);
            } else if (iM == 3) {
                zN = C2678a.n(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                zN2 = C2678a.n(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzs(strG, iBinderU, zN, zN2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzs[i7];
    }
}
