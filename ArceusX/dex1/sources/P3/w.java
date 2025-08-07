package P3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzk;
import o3.C2678a;

public final class w implements Parcelable.Creator<zzk> {
    @Override
    public final zzk createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        double dP = 0.0d;
        double dP2 = 0.0d;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                dP = C2678a.p(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                dP2 = C2678a.p(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzk(dP, dP2);
    }

    @Override
    public final zzk[] newArray(int i7) {
        return new zzk[i7];
    }
}
