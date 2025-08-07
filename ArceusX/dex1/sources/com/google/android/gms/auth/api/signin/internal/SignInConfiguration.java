package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j3.C2492a;
import j3.u;
import n3.C2651i;
import o3.C2679b;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new u();

    private final String f14018d;

    private final GoogleSignInOptions f14019e;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f14018d = C2651i.f(str);
        this.f14019e = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f14018d.equals(signInConfiguration.f14018d)) {
            GoogleSignInOptions googleSignInOptions = this.f14019e;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f14019e;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C2492a().a(this.f14018d).a(this.f14019e).b();
    }

    public final GoogleSignInOptions l() {
        return this.f14019e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f14018d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, str, false);
        C2679b.s(parcel, 5, this.f14019e, i7, false);
        C2679b.b(parcel, iA);
    }
}
