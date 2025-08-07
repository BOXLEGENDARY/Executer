package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.zzs;
import java.util.List;
import o3.C2678a;

public final class n implements Parcelable.Creator<zzj> {
    @Override
    public final zzj createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        zzs zzsVar = zzj.f14638w;
        List<ClientIdentity> listK = zzj.f14637v;
        String strG = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                zzsVar = (zzs) C2678a.f(parcel, iT, zzs.CREATOR);
            } else if (iM == 2) {
                listK = C2678a.k(parcel, iT, ClientIdentity.CREATOR);
            } else if (iM != 3) {
                C2678a.B(parcel, iT);
            } else {
                strG = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzj(zzsVar, listK, strG);
    }

    @Override
    public final zzj[] newArray(int i7) {
        return new zzj[i7];
    }
}
