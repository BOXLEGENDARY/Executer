package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new m();

    private final UvmEntries f14479d;

    private final zzf f14480e;

    private final AuthenticationExtensionsCredPropsOutputs f14481i;

    private final zzh f14482v;

    AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar) {
        this.f14479d = uvmEntries;
        this.f14480e = zzfVar;
        this.f14481i = authenticationExtensionsCredPropsOutputs;
        this.f14482v = zzhVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return C2649g.b(this.f14479d, authenticationExtensionsClientOutputs.f14479d) && C2649g.b(this.f14480e, authenticationExtensionsClientOutputs.f14480e) && C2649g.b(this.f14481i, authenticationExtensionsClientOutputs.f14481i) && C2649g.b(this.f14482v, authenticationExtensionsClientOutputs.f14482v);
    }

    public int hashCode() {
        return C2649g.c(this.f14479d, this.f14480e, this.f14481i, this.f14482v);
    }

    public AuthenticationExtensionsCredPropsOutputs l() {
        return this.f14481i;
    }

    public UvmEntries n() {
        return this.f14479d;
    }

    public final JSONObject o() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.f14481i;
            if (authenticationExtensionsCredPropsOutputs != null) {
                jSONObject.put("credProps", authenticationExtensionsCredPropsOutputs.n());
            }
            UvmEntries uvmEntries = this.f14479d;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.n());
            }
            zzh zzhVar = this.f14482v;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.l());
            }
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e7);
        }
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 1, n(), i7, false);
        C2679b.s(parcel, 2, this.f14480e, i7, false);
        C2679b.s(parcel, 3, l(), i7, false);
        C2679b.s(parcel, 4, this.f14482v, i7, false);
        C2679b.b(parcel, iA);
    }
}
