package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import o3.C2678a;

public final class k implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 3) {
                strG2 = C2678a.g(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                strG3 = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new PublicKeyCredentialRpEntity(strG, strG2, strG3);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new PublicKeyCredentialRpEntity[i7];
    }
}
