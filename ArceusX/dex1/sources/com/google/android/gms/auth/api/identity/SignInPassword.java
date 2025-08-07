package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

@Deprecated
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new f3.i();

    private final String f13966d;

    private final String f13967e;

    public SignInPassword(String str, String str2) {
        this.f13966d = C2651i.g(((String) C2651i.m(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f13967e = C2651i.f(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return C2649g.b(this.f13966d, signInPassword.f13966d) && C2649g.b(this.f13967e, signInPassword.f13967e);
    }

    public int hashCode() {
        return C2649g.c(this.f13966d, this.f13967e);
    }

    public String l() {
        return this.f13966d;
    }

    public String n() {
        return this.f13967e;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, l(), false);
        C2679b.u(parcel, 2, n(), false);
        C2679b.b(parcel, iA);
    }
}
