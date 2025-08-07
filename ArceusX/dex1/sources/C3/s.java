package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzu;
import o3.C2678a;

public final class s implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        boolean zN = false;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            if (C2678a.m(iT) != 1) {
                C2678a.B(parcel, iT);
            } else {
                zN = C2678a.n(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zzu(zN);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzu[i7];
    }
}
