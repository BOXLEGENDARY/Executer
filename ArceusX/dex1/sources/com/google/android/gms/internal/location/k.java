package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class k implements Parcelable.Creator<zzbc> {
    @Override
    public final zzbc createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 1;
        zzba zzbaVar = null;
        IBinder iBinderU = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderU2 = null;
        IBinder iBinderU3 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 2:
                    zzbaVar = (zzba) C2678a.f(parcel, iT, zzba.CREATOR);
                    break;
                case 3:
                    iBinderU = C2678a.u(parcel, iT);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C2678a.f(parcel, iT, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderU2 = C2678a.u(parcel, iT);
                    break;
                case 6:
                    iBinderU3 = C2678a.u(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzbc(iV, zzbaVar, iBinderU, pendingIntent, iBinderU2, iBinderU3);
    }

    @Override
    public final zzbc[] newArray(int i7) {
        return new zzbc[i7];
    }
}
