package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxt;
import o3.C2678a;

public final class W9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        String strG8 = null;
        String strG9 = null;
        String strG10 = null;
        String strG11 = null;
        String strG12 = null;
        String strG13 = null;
        String strG14 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    strG = C2678a.g(parcel, iT);
                    break;
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
                    strG6 = C2678a.g(parcel, iT);
                    break;
                case 7:
                    strG7 = C2678a.g(parcel, iT);
                    break;
                case 8:
                    strG8 = C2678a.g(parcel, iT);
                    break;
                case 9:
                    strG9 = C2678a.g(parcel, iT);
                    break;
                case 10:
                    strG10 = C2678a.g(parcel, iT);
                    break;
                case 11:
                    strG11 = C2678a.g(parcel, iT);
                    break;
                case 12:
                    strG12 = C2678a.g(parcel, iT);
                    break;
                case 13:
                    strG13 = C2678a.g(parcel, iT);
                    break;
                case 14:
                    strG14 = C2678a.g(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzxt(strG, strG2, strG3, strG4, strG5, strG6, strG7, strG8, strG9, strG10, strG11, strG12, strG13, strG14);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzxt[i7];
    }
}
