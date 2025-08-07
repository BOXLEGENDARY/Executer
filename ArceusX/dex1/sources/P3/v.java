package P3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzj;
import o3.C2678a;

public final class v implements Parcelable.Creator<zzj> {
    @Override
    public final zzj createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM == 2) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 3) {
                strG2 = C2678a.g(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                strG3 = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzj(iV, strG, strG2, strG3);
    }

    @Override
    public final zzj[] newArray(int i7) {
        return new zzj[i7];
    }
}
