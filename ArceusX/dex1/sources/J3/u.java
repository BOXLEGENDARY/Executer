package j3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import o3.C2678a;

public final class u implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            int iM = C2678a.m(iT);
            if (iM == 2) {
                strG = C2678a.g(parcel, iT);
            } else if (iM != 5) {
                C2678a.B(parcel, iT);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C2678a.f(parcel, iT, GoogleSignInOptions.CREATOR);
            }
        }
        C2678a.l(parcel, iC);
        return new SignInConfiguration(strG, googleSignInOptions);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new SignInConfiguration[i7];
    }
}
