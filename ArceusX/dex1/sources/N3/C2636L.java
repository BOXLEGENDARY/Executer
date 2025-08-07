package n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import o3.C2678a;

public final class C2636L implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrD = null;
        int[] iArrD2 = null;
        boolean zN = false;
        boolean zN2 = false;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) C2678a.f(parcel, iT, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zN = C2678a.n(parcel, iT);
                    break;
                case 3:
                    zN2 = C2678a.n(parcel, iT);
                    break;
                case 4:
                    iArrD = C2678a.d(parcel, iT);
                    break;
                case 5:
                    iV = C2678a.v(parcel, iT);
                    break;
                case 6:
                    iArrD2 = C2678a.d(parcel, iT);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zN, zN2, iArrD, iV, iArrD2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new ConnectionTelemetryConfiguration[i7];
    }
}
