package com.google.android.gms.fido.fido2.api.common;

import K3.E;
import K3.Y0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import java.util.Arrays;
import java.util.List;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    private final PublicKeyCredentialType f14551d;

    private final byte[] f14552e;

    private final List f14553i;

    private static final E f14550v = E.q(Y0.f1832a, Y0.f1833b);
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new C3.i();

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List<Transport> list) {
        C2651i.l(str);
        try {
            this.f14551d = PublicKeyCredentialType.c(str);
            this.f14552e = (byte[]) C2651i.l(bArr);
            this.f14553i = list;
        } catch (PublicKeyCredentialType.a e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.f14551d.equals(publicKeyCredentialDescriptor.f14551d) || !Arrays.equals(this.f14552e, publicKeyCredentialDescriptor.f14552e)) {
            return false;
        }
        List list2 = this.f14553i;
        if (list2 == null && publicKeyCredentialDescriptor.f14553i == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.f14553i) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.f14553i.containsAll(this.f14553i);
    }

    public int hashCode() {
        return C2649g.c(this.f14551d, Integer.valueOf(Arrays.hashCode(this.f14552e)), this.f14553i);
    }

    public byte[] l() {
        return this.f14552e;
    }

    public List<Transport> n() {
        return this.f14553i;
    }

    public String o() {
        return this.f14551d.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, o(), false);
        C2679b.f(parcel, 3, l(), false);
        C2679b.y(parcel, 4, n(), false);
        C2679b.b(parcel, iA);
    }
}
