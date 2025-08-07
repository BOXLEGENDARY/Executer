package P3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzo;
import o3.C2678a;

public final class j implements Parcelable.Creator<zzo> {
    @Override
    public final zzo createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        String strG2 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                strG = C2678a.g(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                strG2 = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzo(strG, strG2);
    }

    @Override
    public final zzo[] newArray(int i7) {
        return new zzo[i7];
    }
}
