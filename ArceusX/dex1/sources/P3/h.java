package P3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzm;
import o3.C2678a;

public final class h implements Parcelable.Creator<zzm> {
    @Override
    public final zzm createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        String strG = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                strG = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzm(iV, strG);
    }

    @Override
    public final zzm[] newArray(int i7) {
        return new zzm[i7];
    }
}
