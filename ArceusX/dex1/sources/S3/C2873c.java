package s3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;
import o3.C2678a;

public final class C2873c implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        ArrayList arrayListK = null;
        String strG = null;
        boolean zN = false;
        String strG2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                arrayListK = C2678a.k(parcel, iT, Feature.CREATOR);
            } else if (iM == 2) {
                zN = C2678a.n(parcel, iT);
            } else if (iM == 3) {
                strG2 = C2678a.g(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                strG = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new ApiFeatureRequest(arrayListK, zN, strG2, strG);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new ApiFeatureRequest[i7];
    }
}
