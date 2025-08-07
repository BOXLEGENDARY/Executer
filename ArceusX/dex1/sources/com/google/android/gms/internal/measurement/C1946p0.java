package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;

public final class C1946p0 implements Parcelable.Creator<zzcl> {
    @Override
    public final zzcl createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        long jX = 0;
        long jX2 = 0;
        boolean zN = false;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        Bundle bundleA = null;
        String strG4 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    jX = C2678a.x(parcel, iT);
                    break;
                case 2:
                    jX2 = C2678a.x(parcel, iT);
                    break;
                case 3:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 4:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 5:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 6:
                    strG3 = C2678a.g(parcel, iT);
                    break;
                case 7:
                    bundleA = C2678a.a(parcel, iT);
                    break;
                case 8:
                    strG4 = C2678a.g(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzcl(jX, jX2, zN, strG, strG2, strG3, bundleA, strG4);
    }

    @Override
    public final zzcl[] newArray(int i7) {
        return new zzcl[i7];
    }
}
