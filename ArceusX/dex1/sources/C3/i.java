package C3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.ArrayList;
import o3.C2678a;

public final class i implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        byte[] bArrB = null;
        ArrayList arrayListK = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                strG = C2678a.g(parcel, iT);
            } else if (iM == 3) {
                bArrB = C2678a.b(parcel, iT);
            } else if (iM != 4) {
                C2678a.B(parcel, iT);
            } else {
                arrayListK = C2678a.k(parcel, iT, Transport.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new PublicKeyCredentialDescriptor(strG, bArrB, arrayListK);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new PublicKeyCredentialDescriptor[i7];
    }
}
