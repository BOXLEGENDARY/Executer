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
import org.json.JSONException;
import org.json.JSONObject;

public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new o();

    private final byte[] f14484d;

    private final byte[] f14485e;

    private final byte[] f14486i;

    private final byte[] f14487v;

    private final byte[] f14488w;

    AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f14484d = (byte[]) C2651i.l(bArr);
        this.f14485e = (byte[]) C2651i.l(bArr2);
        this.f14486i = (byte[]) C2651i.l(bArr3);
        this.f14487v = (byte[]) C2651i.l(bArr4);
        this.f14488w = bArr5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Arrays.equals(this.f14484d, authenticatorAssertionResponse.f14484d) && Arrays.equals(this.f14485e, authenticatorAssertionResponse.f14485e) && Arrays.equals(this.f14486i, authenticatorAssertionResponse.f14486i) && Arrays.equals(this.f14487v, authenticatorAssertionResponse.f14487v) && Arrays.equals(this.f14488w, authenticatorAssertionResponse.f14488w);
    }

    public int hashCode() {
        return C2649g.c(Integer.valueOf(Arrays.hashCode(this.f14484d)), Integer.valueOf(Arrays.hashCode(this.f14485e)), Integer.valueOf(Arrays.hashCode(this.f14486i)), Integer.valueOf(Arrays.hashCode(this.f14487v)), Integer.valueOf(Arrays.hashCode(this.f14488w)));
    }

    public byte[] l() {
        return this.f14486i;
    }

    public byte[] n() {
        return this.f14485e;
    }

    @Deprecated
    public byte[] o() {
        return this.f14484d;
    }

    public byte[] p() {
        return this.f14487v;
    }

    public byte[] q() {
        return this.f14488w;
    }

    public final JSONObject r() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", v3.c.b(this.f14485e));
            jSONObject.put("authenticatorData", v3.c.b(this.f14486i));
            jSONObject.put("signature", v3.c.b(this.f14487v));
            byte[] bArr = this.f14488w;
            if (bArr != null) {
                jSONObject.put("userHandle", v3.c.b(bArr));
            }
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e7);
        }
    }

    public String toString() {
        C0479n c0479nA = C0481o.a(this);
        AbstractC0472j0 abstractC0472j0D = AbstractC0472j0.d();
        byte[] bArr = this.f14484d;
        c0479nA.b("keyHandle", abstractC0472j0D.e(bArr, 0, bArr.length));
        AbstractC0472j0 abstractC0472j0D2 = AbstractC0472j0.d();
        byte[] bArr2 = this.f14485e;
        c0479nA.b("clientDataJSON", abstractC0472j0D2.e(bArr2, 0, bArr2.length));
        AbstractC0472j0 abstractC0472j0D3 = AbstractC0472j0.d();
        byte[] bArr3 = this.f14486i;
        c0479nA.b("authenticatorData", abstractC0472j0D3.e(bArr3, 0, bArr3.length));
        AbstractC0472j0 abstractC0472j0D4 = AbstractC0472j0.d();
        byte[] bArr4 = this.f14487v;
        c0479nA.b("signature", abstractC0472j0D4.e(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f14488w;
        if (bArr5 != null) {
            c0479nA.b("userHandle", AbstractC0472j0.d().e(bArr5, 0, bArr5.length));
        }
        return c0479nA.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.f(parcel, 2, o(), false);
        C2679b.f(parcel, 3, n(), false);
        C2679b.f(parcel, 4, l(), false);
        C2679b.f(parcel, 5, p(), false);
        C2679b.f(parcel, 6, q(), false);
        C2679b.b(parcel, iA);
    }
}
