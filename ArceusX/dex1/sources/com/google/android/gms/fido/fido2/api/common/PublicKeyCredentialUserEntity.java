package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new C3.l();

    private final byte[] f14562d;

    private final String f14563e;

    private final String f14564i;

    private final String f14565v;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        this.f14562d = (byte[]) C2651i.l(bArr);
        this.f14563e = (String) C2651i.l(str);
        this.f14564i = str2;
        this.f14565v = (String) C2651i.l(str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Arrays.equals(this.f14562d, publicKeyCredentialUserEntity.f14562d) && C2649g.b(this.f14563e, publicKeyCredentialUserEntity.f14563e) && C2649g.b(this.f14564i, publicKeyCredentialUserEntity.f14564i) && C2649g.b(this.f14565v, publicKeyCredentialUserEntity.f14565v);
    }

    public String getName() {
        return this.f14563e;
    }

    public int hashCode() {
        return C2649g.c(this.f14562d, this.f14563e, this.f14564i, this.f14565v);
    }

    public String l() {
        return this.f14565v;
    }

    public String n() {
        return this.f14564i;
    }

    public byte[] o() {
        return this.f14562d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.f(parcel, 2, o(), false);
        C2679b.u(parcel, 3, getName(), false);
        C2679b.u(parcel, 4, n(), false);
        C2679b.u(parcel, 5, l(), false);
        C2679b.b(parcel, iA);
    }
}
