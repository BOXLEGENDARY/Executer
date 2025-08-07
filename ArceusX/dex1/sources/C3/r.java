package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzq;
import com.google.android.gms.fido.fido2.api.common.zzs;
import java.util.ArrayList;
import o3.C2678a;

public final class r implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        ArrayList arrayListK = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            if (C2678a.m(iT) != 1) {
                C2678a.B(parcel, iT);
            } else {
                arrayListK = C2678a.k(parcel, iT, zzq.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new zzs(arrayListK);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzs[i7];
    }
}
