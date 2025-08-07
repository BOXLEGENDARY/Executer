package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import o3.C2678a;
import o3.C2679b;

public final class f4 implements Parcelable.Creator<zzkv> {
    static void a(zzkv zzkvVar, Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, zzkvVar.f17146d);
        C2679b.u(parcel, 2, zzkvVar.f17147e, false);
        C2679b.q(parcel, 3, zzkvVar.f17148i);
        C2679b.r(parcel, 4, zzkvVar.f17149v, false);
        C2679b.k(parcel, 5, null, false);
        C2679b.u(parcel, 6, zzkvVar.f17150w, false);
        C2679b.u(parcel, 7, zzkvVar.f17151y, false);
        C2679b.i(parcel, 8, zzkvVar.f17152z, false);
        C2679b.b(parcel, iA);
    }

    @Override
    public final zzkv createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        String strG = null;
        Long lY = null;
        Float fS = null;
        String strG2 = null;
        String strG3 = null;
        Double dQ = null;
        long jX = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 2:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 3:
                    jX = C2678a.x(parcel, iT);
                    break;
                case 4:
                    lY = C2678a.y(parcel, iT);
                    break;
                case 5:
                    fS = C2678a.s(parcel, iT);
                    break;
                case 6:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 7:
                    strG3 = C2678a.g(parcel, iT);
                    break;
                case 8:
                    dQ = C2678a.q(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzkv(iV, strG, jX, lY, fS, strG2, strG3, dQ);
    }

    @Override
    public final zzkv[] newArray(int i7) {
        return new zzkv[i7];
    }
}
