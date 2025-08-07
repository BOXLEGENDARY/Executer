package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import o3.C2678a;

public final class j implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        Integer numW = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                strG = C2678a.g(parcel, iT);
            } else if (iM != 3) {
                C2678a.B(parcel, iT);
            } else {
                numW = C2678a.w(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new PublicKeyCredentialParameters(strG, numW.intValue());
    }

    @Override
    public final Object[] newArray(int i7) {
        return new PublicKeyCredentialParameters[i7];
    }
}
