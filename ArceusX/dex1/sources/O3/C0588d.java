package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import o3.C2678a;

public final class C0588d implements Parcelable.Creator {
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
                    strG3 = C2678a.g(parcel, iT);
                    break;
                case 5:
                    strG4 = C2678a.g(parcel, iT);
                    break;
                case 6:
                    strG5 = C2678a.g(parcel, iT);
                    break;
                case 7:
                    strG6 = C2678a.g(parcel, iT);
                    break;
                case 8:
                    strG7 = C2678a.g(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzp(strG, strG2, strG3, strG4, strG5, strG6, strG7);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzp[i7];
    }
}
