package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new C3.j();

    private final PublicKeyCredentialType f14554d;

    private final COSEAlgorithmIdentifier f14555e;

    public PublicKeyCredentialParameters(String str, int i7) {
        C2651i.l(str);
        try {
            this.f14554d = PublicKeyCredentialType.c(str);
            C2651i.l(Integer.valueOf(i7));
            try {
                this.f14555e = COSEAlgorithmIdentifier.a(i7);
            } catch (COSEAlgorithmIdentifier.a e7) {
                throw new IllegalArgumentException(e7);
            }
        } catch (PublicKeyCredentialType.a e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.f14554d.equals(publicKeyCredentialParameters.f14554d) && this.f14555e.equals(publicKeyCredentialParameters.f14555e);
    }

    public int hashCode() {
        return C2649g.c(this.f14554d, this.f14555e);
    }

    public int l() {
        return this.f14555e.b();
    }

    public String n() {
        return this.f14554d.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, n(), false);
        C2679b.p(parcel, 3, Integer.valueOf(l()), false);
        C2679b.b(parcel, iA);
    }
}
