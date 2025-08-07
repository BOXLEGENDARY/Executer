package R3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import o3.C2678a;

public final class C1106k6 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        float fR = 0.0f;
        float fR2 = 0.0f;
        int iV2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                fR = C2678a.r(parcel, iT);
            } else if (iM == 3) {
                fR2 = C2678a.r(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                iV2 = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzn(iV, fR, fR2, iV2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzn[i7];
    }
}
