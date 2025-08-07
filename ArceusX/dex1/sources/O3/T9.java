package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxq;
import o3.C2678a;

public final class T9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        int iV6 = 0;
        boolean zN = false;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 2:
                    iV2 = C2678a.v(parcel, iT);
                    break;
                case 3:
                    iV3 = C2678a.v(parcel, iT);
                    break;
                case 4:
                    iV4 = C2678a.v(parcel, iT);
                    break;
                case 5:
                    iV5 = C2678a.v(parcel, iT);
                    break;
                case 6:
                    iV6 = C2678a.v(parcel, iT);
                    break;
                case 7:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 8:
                    strG = C2678a.g(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzxq(iV, iV2, iV3, iV4, iV5, iV6, zN, strG);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzxq[i7];
    }
}
