package n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import o3.C2678a;

public final class C2635K implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        boolean zN = false;
        boolean zN2 = false;
        int iV2 = 0;
        int iV3 = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                zN = C2678a.n(parcel, iT);
            } else if (iM == 3) {
                zN2 = C2678a.n(parcel, iT);
            } else if (iM == 4) {
                iV2 = C2678a.v(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                iV3 = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new RootTelemetryConfiguration(iV, zN, zN2, iV2, iV3);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new RootTelemetryConfiguration[i7];
    }
}
