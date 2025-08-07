package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class C2197c implements Parcelable.Creator<zzab> {
    @Override
    public final zzab createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        String strG2 = null;
        zzkv zzkvVar = null;
        String strG3 = null;
        zzat zzatVar = null;
        zzat zzatVar2 = null;
        zzat zzatVar3 = null;
        long jX = 0;
        long jX2 = 0;
        long jX3 = 0;
        boolean zN = false;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 2:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 3:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 4:
                    zzkvVar = (zzkv) C2678a.f(parcel, iT, zzkv.CREATOR);
                    break;
                case 5:
                    jX = C2678a.x(parcel, iT);
                    break;
                case 6:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 7:
                    strG3 = C2678a.g(parcel, iT);
                    break;
                case 8:
                    zzatVar = (zzat) C2678a.f(parcel, iT, zzat.CREATOR);
                    break;
                case 9:
                    jX2 = C2678a.x(parcel, iT);
                    break;
                case 10:
                    zzatVar2 = (zzat) C2678a.f(parcel, iT, zzat.CREATOR);
                    break;
                case 11:
                    jX3 = C2678a.x(parcel, iT);
                    break;
                case 12:
                    zzatVar3 = (zzat) C2678a.f(parcel, iT, zzat.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzab(strG, strG2, zzkvVar, jX, zN, strG3, zzatVar, jX2, zzatVar2, jX3, zzatVar3);
    }

    @Override
    public final zzab[] newArray(int i7) {
        return new zzab[i7];
    }
}
