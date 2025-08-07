package R3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import o3.C2678a;

public final class C6 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        boolean zN = false;
        float fR = 0.0f;
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
                    zN = C2678a.n(parcel, iT);
                    break;
                case 6:
                    fR = C2678a.r(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzou(iV, iV2, iV3, iV4, zN, fR);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzou[i7];
    }
}
