package com.google.android.gms.fido.fido2.api.common;

import K3.C0479n;
import K3.C0481o;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import n3.C2649g;
import o3.C2679b;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new q();

    private final ErrorCode f14493d;

    private final String f14494e;

    private final int f14495i;

    AuthenticatorErrorResponse(int i7, String str, int i8) {
        try {
            this.f14493d = ErrorCode.f(i7);
            this.f14494e = str;
            this.f14495i = i8;
        } catch (ErrorCode.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return C2649g.b(this.f14493d, authenticatorErrorResponse.f14493d) && C2649g.b(this.f14494e, authenticatorErrorResponse.f14494e) && C2649g.b(Integer.valueOf(this.f14495i), Integer.valueOf(authenticatorErrorResponse.f14495i));
    }

    public int hashCode() {
        return C2649g.c(this.f14493d, this.f14494e, Integer.valueOf(this.f14495i));
    }

    public ErrorCode l() {
        return this.f14493d;
    }

    public int n() {
        return this.f14493d.c();
    }

    public String o() {
        return this.f14494e;
    }

    public final JSONObject p() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.f14493d.c());
            String str = this.f14494e;
            if (str != null) {
                jSONObject.put("message", str);
            }
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e7);
        }
    }

    public String toString() {
        C0479n c0479nA = C0481o.a(this);
        c0479nA.a("errorCode", this.f14493d.c());
        String str = this.f14494e;
        if (str != null) {
            c0479nA.b("errorMessage", str);
        }
        return c0479nA.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, n());
        C2679b.u(parcel, 3, o(), false);
        C2679b.m(parcel, 4, this.f14495i);
        C2679b.b(parcel, iA);
    }
}
