package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthenticationExtensionsCredPropsOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsCredPropsOutputs> CREATOR = new C3.o();

    private final boolean f14483d;

    public AuthenticationExtensionsCredPropsOutputs(boolean z7) {
        this.f14483d = z7;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AuthenticationExtensionsCredPropsOutputs) && this.f14483d == ((AuthenticationExtensionsCredPropsOutputs) obj).f14483d;
    }

    public int hashCode() {
        return C2649g.c(Boolean.valueOf(this.f14483d));
    }

    public boolean l() {
        return this.f14483d;
    }

    public final JSONObject n() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rk", this.f14483d);
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e7);
        }
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.c(parcel, 1, l());
        C2679b.b(parcel, iA);
    }
}
