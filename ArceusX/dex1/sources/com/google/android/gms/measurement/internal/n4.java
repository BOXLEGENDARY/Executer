package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import o3.C2678a;

public final class n4 implements Parcelable.Creator<zzp> {
    @Override
    public final zzp createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = BuildConfig.FLAVOR;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        String strG8 = null;
        Boolean boolO = null;
        ArrayList<String> arrayListI = null;
        String strG9 = null;
        long jX = 0;
        long jX2 = 0;
        long jX3 = 0;
        long jX4 = 0;
        long jX5 = 0;
        boolean zN = true;
        boolean zN2 = true;
        boolean zN3 = false;
        int iV = 0;
        boolean zN4 = false;
        long jX6 = -2147483648L;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 2:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 3:
                    strG3 = C2678a.g(parcel, iT);
                    break;
                case 4:
                    strG4 = C2678a.g(parcel, iT);
                    break;
                case 5:
                    strG5 = C2678a.g(parcel, iT);
                    break;
                case 6:
                    jX = C2678a.x(parcel, iT);
                    break;
                case 7:
                    jX2 = C2678a.x(parcel, iT);
                    break;
                case 8:
                    strG6 = C2678a.g(parcel, iT);
                    break;
                case 9:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 10:
                    zN3 = C2678a.n(parcel, iT);
                    break;
                case 11:
                    jX6 = C2678a.x(parcel, iT);
                    break;
                case 12:
                    strG7 = C2678a.g(parcel, iT);
                    break;
                case 13:
                    jX3 = C2678a.x(parcel, iT);
                    break;
                case 14:
                    jX4 = C2678a.x(parcel, iT);
                    break;
                case 15:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 16:
                    zN2 = C2678a.n(parcel, iT);
                    break;
                case 17:
                case 20:
                default:
                    C2678a.B(parcel, iT);
                    break;
                case 18:
                    zN4 = C2678a.n(parcel, iT);
                    break;
                case 19:
                    strG8 = C2678a.g(parcel, iT);
                    break;
                case 21:
                    boolO = C2678a.o(parcel, iT);
                    break;
                case 22:
                    jX5 = C2678a.x(parcel, iT);
                    break;
                case 23:
                    arrayListI = C2678a.i(parcel, iT);
                    break;
                case 24:
                    strG9 = C2678a.g(parcel, iT);
                    break;
                case 25:
                    strG = C2678a.g(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzp(strG2, strG3, strG4, strG5, jX, jX2, strG6, zN, zN3, jX6, strG7, jX3, jX4, iV, zN2, zN4, strG8, boolO, jX5, arrayListI, strG9, strG);
    }

    @Override
    public final zzp[] newArray(int i7) {
        return new zzp[i7];
    }
}
