package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

@Deprecated
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new i();

    private final String f13957A;

    private final PublicKeyCredential f13958B;

    private final String f13959d;

    private final String f13960e;

    private final String f13961i;

    private final String f13962v;

    private final Uri f13963w;

    private final String f13964y;

    private final String f13965z;

    SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        this.f13959d = (String) C2651i.l(str);
        this.f13960e = str2;
        this.f13961i = str3;
        this.f13962v = str4;
        this.f13963w = uri;
        this.f13964y = str5;
        this.f13965z = str6;
        this.f13957A = str7;
        this.f13958B = publicKeyCredential;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return C2649g.b(this.f13959d, signInCredential.f13959d) && C2649g.b(this.f13960e, signInCredential.f13960e) && C2649g.b(this.f13961i, signInCredential.f13961i) && C2649g.b(this.f13962v, signInCredential.f13962v) && C2649g.b(this.f13963w, signInCredential.f13963w) && C2649g.b(this.f13964y, signInCredential.f13964y) && C2649g.b(this.f13965z, signInCredential.f13965z) && C2649g.b(this.f13957A, signInCredential.f13957A) && C2649g.b(this.f13958B, signInCredential.f13958B);
    }

    public int hashCode() {
        return C2649g.c(this.f13959d, this.f13960e, this.f13961i, this.f13962v, this.f13963w, this.f13964y, this.f13965z, this.f13957A, this.f13958B);
    }

    public String l() {
        return this.f13960e;
    }

    public String n() {
        return this.f13962v;
    }

    public String o() {
        return this.f13961i;
    }

    public String p() {
        return this.f13965z;
    }

    public String q() {
        return this.f13959d;
    }

    public String r() {
        return this.f13964y;
    }

    @Deprecated
    public String s() {
        return this.f13957A;
    }

    public Uri t() {
        return this.f13963w;
    }

    public PublicKeyCredential v() {
        return this.f13958B;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, q(), false);
        C2679b.u(parcel, 2, l(), false);
        C2679b.u(parcel, 3, o(), false);
        C2679b.u(parcel, 4, n(), false);
        C2679b.s(parcel, 5, t(), i7, false);
        C2679b.u(parcel, 6, r(), false);
        C2679b.u(parcel, 7, p(), false);
        C2679b.u(parcel, 8, s(), false);
        C2679b.s(parcel, 9, v(), i7, false);
        C2679b.b(parcel, iA);
    }
}
