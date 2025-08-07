package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import o3.C2678a;

public final class l implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        byte[] bArrB = null;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                bArrB = C2678a.b(parcel, iT);
            } else if (iM == 3) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 4) {
                strG2 = C2678a.g(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                strG3 = C2678a.g(parcel, iT);
            }
        }
        C2678a.l(parcel, iC);
        return new PublicKeyCredentialUserEntity(bArrB, strG, strG2, strG3);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new PublicKeyCredentialUserEntity[i7];
    }
}
