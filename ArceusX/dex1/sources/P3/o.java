package P3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zze;
import o3.C2678a;

public final class o implements Parcelable.Creator<zze> {
    @Override
    public final zze createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        int iV = 0;
        String[] strArrH = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                iV = C2678a.v(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                strArrH = C2678a.h(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zze(iV, strArrH);
    }

    @Override
    public final zze[] newArray(int i7) {
        return new zze[i7];
    }
}
