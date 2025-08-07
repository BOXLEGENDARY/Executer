package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxr;
import o3.C2678a;

public final class U9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        zzxq zzxqVar = null;
        zzxq zzxqVar2 = null;
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
                    zzxqVar = (zzxq) C2678a.f(parcel, iT, zzxq.CREATOR);
                    break;
                case 7:
                    zzxqVar2 = (zzxq) C2678a.f(parcel, iT, zzxq.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzxr(strG, strG2, strG3, strG4, strG5, zzxqVar, zzxqVar2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzxr[i7];
    }
}
