package d3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzc;
import o3.C2678a;

public final class C2386e implements Parcelable.Creator<zzc> {
    @Override
    public final zzc createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        int iV = 0;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                strG = C2678a.g(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                iV = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzc(strG, iV);
    }

    @Override
    public final zzc[] newArray(int i7) {
        return new zzc[i7];
    }
}
