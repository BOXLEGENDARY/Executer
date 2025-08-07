package com.google.android.gms.fido.fido2.api.common;

import K3.AbstractC0472j0;
import K3.C0479n;
import K3.C0481o;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new p();

    private final byte[] f14489d;

    private final byte[] f14490e;

    private final byte[] f14491i;

    private final String[] f14492v;

    AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.f14489d = (byte[]) C2651i.l(bArr);
        this.f14490e = (byte[]) C2651i.l(bArr2);
        this.f14491i = (byte[]) C2651i.l(bArr3);
        this.f14492v = (String[]) C2651i.l(strArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.f14489d, authenticatorAttestationResponse.f14489d) && Arrays.equals(this.f14490e, authenticatorAttestationResponse.f14490e) && Arrays.equals(this.f14491i, authenticatorAttestationResponse.f14491i);
    }

    public int hashCode() {
        return C2649g.c(Integer.valueOf(Arrays.hashCode(this.f14489d)), Integer.valueOf(Arrays.hashCode(this.f14490e)), Integer.valueOf(Arrays.hashCode(this.f14491i)));
    }

    public byte[] l() {
        return this.f14491i;
    }

    public byte[] n() {
        return this.f14490e;
    }

    @Deprecated
    public byte[] o() {
        return this.f14489d;
    }

    public String[] p() {
        return this.f14492v;
    }

    public final org.json.JSONObject q() throws org.json.JSONException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.q():org.json.JSONObject");
    }

    public String toString() {
        C0479n c0479nA = C0481o.a(this);
        AbstractC0472j0 abstractC0472j0D = AbstractC0472j0.d();
        byte[] bArr = this.f14489d;
        c0479nA.b("keyHandle", abstractC0472j0D.e(bArr, 0, bArr.length));
        AbstractC0472j0 abstractC0472j0D2 = AbstractC0472j0.d();
        byte[] bArr2 = this.f14490e;
        c0479nA.b("clientDataJSON", abstractC0472j0D2.e(bArr2, 0, bArr2.length));
        AbstractC0472j0 abstractC0472j0D3 = AbstractC0472j0.d();
        byte[] bArr3 = this.f14491i;
        c0479nA.b("attestationObject", abstractC0472j0D3.e(bArr3, 0, bArr3.length));
        c0479nA.b("transports", Arrays.toString(this.f14492v));
        return c0479nA.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.f(parcel, 2, o(), false);
        C2679b.f(parcel, 3, n(), false);
        C2679b.f(parcel, 4, l(), false);
        C2679b.v(parcel, 5, p(), false);
        C2679b.b(parcel, iA);
    }
}
