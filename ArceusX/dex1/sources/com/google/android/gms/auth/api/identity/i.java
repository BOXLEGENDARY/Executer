package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import o3.C2678a;

public final class i implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        int iC = C2678a.C(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        Uri uri = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        PublicKeyCredential publicKeyCredential = null;
        while (parcel.dataPosition() < iC) {
            int iT = C2678a.t(parcel);
            switch (C2678a.m(iT)) {
                case 1:
                    strG = C2678a.g(parcel, iT);
                    break;
                case 2:
                    strG2 = C2678a.g(parcel, iT);
                    break;
                case 3:
                    strG3 = C2678a.g(parcel, iT);
                    break;
                case 4:
                    strG4 = C2678a.g(parcel, iT);
                    break;
                case 5:
                    uri = (Uri) C2678a.f(parcel, iT, Uri.CREATOR);
                    break;
                case 6:
                    strG5 = C2678a.g(parcel, iT);
                    break;
                case 7:
                    strG6 = C2678a.g(parcel, iT);
                    break;
                case 8:
                    strG7 = C2678a.g(parcel, iT);
                    break;
                case 9:
                    publicKeyCredential = (PublicKeyCredential) C2678a.f(parcel, iT, PublicKeyCredential.CREATOR);
                    break;
                default:
                    C2678a.B(parcel, iT);
                    break;
            }
        }
        C2678a.l(parcel, iC);
        return new SignInCredential(strG, strG2, strG3, strG4, uri, strG5, strG6, strG7, publicKeyCredential);
    }

    @Override
    public final Object[] newArray(int i7) {
        return new SignInCredential[i7];
    }
}
