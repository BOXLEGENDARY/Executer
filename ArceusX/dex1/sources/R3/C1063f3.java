package R3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import o3.C2678a;

public final class C1063f3 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        boolean zN = false;
        boolean zN2 = false;
        float fR = -1.0f;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 2:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 3:
                    iV2 = C2678a.v(parcel, iT);
                    break;
                case 4:
                    iV3 = C2678a.v(parcel, iT);
                    break;
                case 5:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 6:
                    zN2 = C2678a.n(parcel, iT);
                    break;
                case 7:
                    fR = C2678a.r(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new zzh(iV, iV2, iV3, zN, zN2, fR);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzh[i7];
    }
}
