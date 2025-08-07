package S3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import o3.C2678a;

public final class R9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        boolean zN = false;
        int iV = 0;
        boolean zN2 = false;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
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
                    zN = C2678a.n(parcel, iT);
                    break;
                case 5:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 6:
                    strG4 = C2678a.g(parcel, iT);
                    break;
                case 7:
                    zN2 = C2678a.n(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzvh(strG, strG2, strG3, zN, iV, strG4, zN2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzvh[i7];
    }
}
