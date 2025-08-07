package Y3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;
import o3.C2678a;

public final class d implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        ArrayList<String> arrayListI = null;
        String strG = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 1) {
                arrayListI = C2678a.i(parcel, iT);
            } else if (iM != 2) {
                C2678a.B(parcel, iT);
            } else {
                strG = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new zag(arrayListI, strG);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new zag[i7];
    }
}
