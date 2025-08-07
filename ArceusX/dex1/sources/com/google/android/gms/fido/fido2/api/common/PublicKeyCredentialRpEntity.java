package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new C3.k();

    private final String f14556d;

    private final String f14557e;

    private final String f14558i;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        this.f14556d = (String) C2651i.l(str);
        this.f14557e = (String) C2651i.l(str2);
        this.f14558i = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return C2649g.b(this.f14556d, publicKeyCredentialRpEntity.f14556d) && C2649g.b(this.f14557e, publicKeyCredentialRpEntity.f14557e) && C2649g.b(this.f14558i, publicKeyCredentialRpEntity.f14558i);
    }

    public String getName() {
        return this.f14557e;
    }

    public int hashCode() {
        return C2649g.c(this.f14556d, this.f14557e, this.f14558i);
    }

    public String l() {
        return this.f14558i;
    }

    public String n() {
        return this.f14556d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, n(), false);
        C2679b.u(parcel, 3, getName(), false);
        C2679b.u(parcel, 4, l(), false);
        C2679b.b(parcel, iA);
    }
}
