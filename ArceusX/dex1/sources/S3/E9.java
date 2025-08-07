package S3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import o3.C2678a;

public final class E9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        long jX = 0;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                iV2 = C2678a.v(parcel, iT);
            } else if (iM == 3) {
                iV3 = C2678a.v(parcel, iT);
            } else if (iM == 4) {
                iV4 = C2678a.v(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                jX = C2678a.x(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzuq(iV, iV2, iV3, iV4, jX);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzuq[i7];
    }
}
