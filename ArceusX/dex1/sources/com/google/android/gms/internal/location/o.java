package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class o implements Parcelable.Creator<zzl> {
    @Override
    public final zzl createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        zzj zzjVar = null;
        int iV = 1;
        IBinder iBinderU = null;
        IBinder iBinderU2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                zzjVar = (zzj) C2678a.f(parcel, iT, zzj.CREATOR);
            } else if (iM == 3) {
                iBinderU = C2678a.u(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                iBinderU2 = C2678a.u(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzl(iV, zzjVar, iBinderU, iBinderU2);
    }

    @Override
    public final zzl[] newArray(int i7) {
        return new zzl[i7];
    }
}
