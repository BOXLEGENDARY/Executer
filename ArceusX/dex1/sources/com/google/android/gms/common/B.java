package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class B implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        boolean zN4 = false;
        String strG = null;
        IBinder iBinderU = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 2:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 3:
                    zN2 = C2678a.n(parcel, iT);
                    break;
                case 4:
                    iBinderU = C2678a.u(parcel, iT);
                    break;
                case 5:
                    zN3 = C2678a.n(parcel, iT);
                    break;
                case 6:
                    zN4 = C2678a.n(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzo(strG, zN, zN2, iBinderU, zN3, zN4);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzo[i7];
    }
}
