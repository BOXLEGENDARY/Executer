package n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import o3.C2678a;

public final class C2667y implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = -1;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        String strG = null;
        String strG2 = null;
        long jX = 0;
        long jX2 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    iV2 = C2678a.v(parcel, iT);
                    break;
                case 2:
                    iV3 = C2678a.v(parcel, iT);
                    break;
                case 3:
                    iV4 = C2678a.v(parcel, iT);
                    break;
                case 4:
                    jX = C2678a.x(parcel, iT);
                    break;
                case 5:
                    jX2 = C2678a.x(parcel, iT);
                    break;
                case 6:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 7:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 8:
                    iV5 = C2678a.v(parcel, iT);
                    break;
                case 9:
                    iV = C2678a.v(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new MethodInvocation(iV2, iV3, iV4, jX, jX2, strG, strG2, iV5, iV);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new MethodInvocation[i7];
    }
}
