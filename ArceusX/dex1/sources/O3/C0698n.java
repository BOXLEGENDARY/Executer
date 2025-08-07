package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import o3.C2678a;

public final class C0698n implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        long jX = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 3) {
                iV2 = C2678a.v(parcel, iT);
            } else if (iM == 4) {
                iV3 = C2678a.v(parcel, iT);
            } else if (iM == 5) {
                jX = C2678a.x(parcel, iT);
            } else if (iM != 6) {
                C2678a.B(parcel, iT);
            } else {
                iV4 = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzan(iV, iV2, iV3, jX, iV4);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzan[i7];
    }
}
