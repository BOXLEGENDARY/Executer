package n3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import o3.C2678a;

public final class C2658p implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        ArrayList arrayListK = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                arrayListK = C2678a.k(parcel, iT, MethodInvocation.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new TelemetryData(iV, arrayListK);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new TelemetryData[i7];
    }
}
