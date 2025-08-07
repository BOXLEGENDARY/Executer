package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import n3.C2657o;
import o3.C2679b;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C2657o();

    public final int f14225d;

    public final String f14226e;

    public ClientIdentity(int i7, String str) {
        this.f14225d = i7;
        this.f14226e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f14225d == this.f14225d && C2649g.b(clientIdentity.f14226e, this.f14226e);
    }

    public final int hashCode() {
        return this.f14225d;
    }

    public final String toString() {
        return this.f14225d + ":" + this.f14226e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14225d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, i8);
        C2679b.u(parcel, 2, this.f14226e, false);
        C2679b.b(parcel, iA);
    }
}
