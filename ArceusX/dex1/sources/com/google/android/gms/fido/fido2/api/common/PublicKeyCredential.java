package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;
import o3.C2680c;
import org.json.JSONException;
import org.json.JSONObject;

public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new d();

    private final String f14520A;

    private final String f14521d;

    private final String f14522e;

    private final byte[] f14523i;

    private final AuthenticatorAttestationResponse f14524v;

    private final AuthenticatorAssertionResponse f14525w;

    private final AuthenticatorErrorResponse f14526y;

    private final AuthenticationExtensionsClientOutputs f14527z;

    PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z7 = true;
        if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
            z7 = false;
        }
        C2651i.a(z7);
        this.f14521d = str;
        this.f14522e = str2;
        this.f14523i = bArr;
        this.f14524v = authenticatorAttestationResponse;
        this.f14525w = authenticatorAssertionResponse;
        this.f14526y = authenticatorErrorResponse;
        this.f14527z = authenticationExtensionsClientOutputs;
        this.f14520A = str3;
    }

    public static PublicKeyCredential l(byte[] bArr) {
        return (PublicKeyCredential) C2680c.a(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return C2649g.b(this.f14521d, publicKeyCredential.f14521d) && C2649g.b(this.f14522e, publicKeyCredential.f14522e) && Arrays.equals(this.f14523i, publicKeyCredential.f14523i) && C2649g.b(this.f14524v, publicKeyCredential.f14524v) && C2649g.b(this.f14525w, publicKeyCredential.f14525w) && C2649g.b(this.f14526y, publicKeyCredential.f14526y) && C2649g.b(this.f14527z, publicKeyCredential.f14527z) && C2649g.b(this.f14520A, publicKeyCredential.f14520A);
    }

    public int hashCode() {
        return C2649g.c(this.f14521d, this.f14522e, this.f14523i, this.f14525w, this.f14524v, this.f14526y, this.f14527z, this.f14520A);
    }

    public String n() {
        return this.f14520A;
    }

    public AuthenticationExtensionsClientOutputs o() {
        return this.f14527z;
    }

    public String p() {
        return this.f14521d;
    }

    public byte[] q() {
        return this.f14523i;
    }

    public AuthenticatorResponse r() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f14524v;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f14525w;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f14526y;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    public String s() {
        return this.f14522e;
    }

    public String t() throws JSONException {
        JSONObject jSONObjectP;
        try {
            JSONObject jSONObject = new JSONObject();
            byte[] bArr = this.f14523i;
            if (bArr != null && bArr.length > 0) {
                jSONObject.put("rawId", v3.c.b(bArr));
            }
            String str = this.f14520A;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.f14522e;
            if (str2 != null && this.f14526y == null) {
                jSONObject.put("type", str2);
            }
            String str3 = this.f14521d;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = "response";
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f14525w;
            boolean z7 = true;
            if (authenticatorAssertionResponse != null) {
                jSONObjectP = authenticatorAssertionResponse.r();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f14524v;
                if (authenticatorAttestationResponse != null) {
                    jSONObjectP = authenticatorAttestationResponse.q();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.f14526y;
                    z7 = false;
                    if (authenticatorErrorResponse != null) {
                        jSONObjectP = authenticatorErrorResponse.p();
                        str4 = "error";
                    } else {
                        jSONObjectP = null;
                    }
                }
            }
            if (jSONObjectP != null) {
                jSONObject.put(str4, jSONObjectP);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f14527z;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject.put("clientExtensionResults", authenticationExtensionsClientOutputs.o());
            } else if (z7) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e7);
        }
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, p(), false);
        C2679b.u(parcel, 2, s(), false);
        C2679b.f(parcel, 3, q(), false);
        C2679b.s(parcel, 4, this.f14524v, i7, false);
        C2679b.s(parcel, 5, this.f14525w, i7, false);
        C2679b.s(parcel, 6, this.f14526y, i7, false);
        C2679b.s(parcel, 7, o(), i7, false);
        C2679b.u(parcel, 8, n(), false);
        C2679b.b(parcel, iA);
    }
}
