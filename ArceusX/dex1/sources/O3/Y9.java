package O3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxv;
import o3.C2678a;

public final class Y9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
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
        return new zzxv(dP, dP2);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzxv[i7];
    }
}
