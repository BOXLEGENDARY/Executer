package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2651i;
import o3.C2679b;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    @Deprecated
    final String f14010d;

    private final GoogleSignInAccount f14011e;

    @Deprecated
    final String f14012i;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f14011e = googleSignInAccount;
        this.f14010d = C2651i.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f14012i = C2651i.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount l() {
        return this.f14011e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f14010d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 4, str, false);
        C2679b.s(parcel, 7, this.f14011e, i7, false);
        C2679b.u(parcel, 8, this.f14012i, false);
        C2679b.b(parcel, iA);
    }
}
