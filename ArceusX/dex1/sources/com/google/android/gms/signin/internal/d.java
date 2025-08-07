package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zat;
import o3.C2678a;

public final class d implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        zat zatVar = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                zatVar = (zat) C2678a.f(parcel, iT, zat.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new zai(iV, zatVar);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zai[i7];
    }
}
