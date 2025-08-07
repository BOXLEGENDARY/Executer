package S3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import java.util.ArrayList;
import o3.C2678a;

public final class Q9 implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        ArrayList arrayListK = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                strG = C2678a.g(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                arrayListK = C2678a.k(parcel, iT, zzuz.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new zzvf(strG, arrayListK);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zzvf[i7];
    }
}
