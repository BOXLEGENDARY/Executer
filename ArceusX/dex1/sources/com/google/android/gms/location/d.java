package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import o3.C2678a;

public final class d implements Parcelable.Creator<zzbj> {
    @Override
    public final zzbj createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = BuildConfig.FLAVOR;
        String strG2 = BuildConfig.FLAVOR;
        String strG3 = strG2;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                strG2 = C2678a.g(parcel, iT);
            } else if (iM == 2) {
                strG3 = C2678a.g(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                strG = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzbj(strG, strG2, strG3);
    }

    @Override
    public final zzbj[] newArray(int i7) {
        return new zzbj[i7];
    }
}
