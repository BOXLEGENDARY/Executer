package P3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzp;
import o3.C2678a;

public final class k implements Parcelable.Creator<zzp> {
    @Override
    public final zzp createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        int iV = 0;
        String strG2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 2) {
                strG2 = C2678a.g(parcel, iT);
            } else if (iM != 3) {
                C2678a.B(parcel, iT);
            } else {
                iV = C2678a.v(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzp(strG, strG2, iV);
    }

    @Override
    public final zzp[] newArray(int i7) {
        return new zzp[i7];
    }
}
