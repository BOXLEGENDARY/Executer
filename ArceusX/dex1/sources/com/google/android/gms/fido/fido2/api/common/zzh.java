package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import n3.C2649g;
import o3.C2679b;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C3.q();

    private final boolean f14596d;

    private final byte[] f14597e;

    public zzh(boolean z7, byte[] bArr) {
        this.f14596d = z7;
        this.f14597e = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f14596d == zzhVar.f14596d && Arrays.equals(this.f14597e, zzhVar.f14597e);
    }

    public final int hashCode() {
        return C2649g.c(Boolean.valueOf(this.f14596d), this.f14597e);
    }

    public final JSONObject l() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enabled", this.f14596d);
            JSONObject jSONObject2 = new JSONObject();
            byte[] bArr = this.f14597e;
            if (bArr != null) {
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOfRange(bArr, 0, 31), 11));
                byte[] bArr2 = this.f14597e;
                if (bArr2.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArr2, 32, 64), 11));
                }
            }
            jSONObject.put("results", jSONObject2);
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e7);
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.c(parcel, 1, this.f14596d);
        C2679b.f(parcel, 2, this.f14597e, false);
        C2679b.b(parcel, iA);
    }
}
