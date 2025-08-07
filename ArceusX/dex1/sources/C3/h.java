package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzai;
import o3.C2678a;

public final class h implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        byte[][] bArrC = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            if (C2678a.m(iT) != 1) {
                C2678a.B(parcel, iT);
            } else {
                bArrC = C2678a.c(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzai(bArrC);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzai[i7];
    }
}
