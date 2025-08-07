package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzh;
import o3.C2678a;

public final class q implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        byte[] bArrB = null;
        boolean zN = false;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                zN = C2678a.n(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                bArrB = C2678a.b(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzh(zN, bArrB);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzh[i7];
    }
}
