package r3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import o3.C2678a;

public final class C2750h implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        boolean zN = false;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                zN = C2678a.n(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new ModuleInstallResponse(iV, zN);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new ModuleInstallResponse[i7];
    }
}
