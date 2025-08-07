package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;
import o3.C2679b;

public final class r implements Parcelable.Creator<zzat> {
    static void a(zzat zzatVar, Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, zzatVar.f17142d, false);
        C2679b.s(parcel, 3, zzatVar.f17143e, i7, false);
        C2679b.u(parcel, 4, zzatVar.f17144i, false);
        C2679b.q(parcel, 5, zzatVar.f17145v);
        C2679b.b(parcel, iA);
    }

    @Override
    public final zzat createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        zzar zzarVar = null;
        String strG2 = null;
        long jX = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 3) {
                zzarVar = (zzar) C2678a.f(parcel, iT, zzar.CREATOR);
            } else if (iM == 4) {
                strG2 = C2678a.g(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                jX = C2678a.x(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzat(strG, zzarVar, strG2, jX);
    }

    @Override
    public final zzat[] newArray(int i7) {
        return new zzat[i7];
    }
}
