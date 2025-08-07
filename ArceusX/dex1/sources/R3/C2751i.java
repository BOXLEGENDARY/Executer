package r3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import o3.C2678a;

public final class C2751i implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        Long lY = null;
        Long lY2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                iV2 = C2678a.v(parcel, iT);
            } else if (iM == 3) {
                lY = C2678a.y(parcel, iT);
            } else if (iM == 4) {
                lY2 = C2678a.y(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                iV3 = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new ModuleInstallStatusUpdate(iV, iV2, lY, lY2, iV3);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new ModuleInstallStatusUpdate[i7];
    }
}
