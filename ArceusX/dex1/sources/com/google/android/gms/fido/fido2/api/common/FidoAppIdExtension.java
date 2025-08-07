package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new C3.t();

    private final String f14518d;

    public FidoAppIdExtension(String str) {
        this.f14518d = (String) C2651i.l(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.f14518d.equals(((FidoAppIdExtension) obj).f14518d);
        }
        return false;
    }

    public int hashCode() {
        return C2649g.c(this.f14518d);
    }

    public String l() {
        return this.f14518d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, l(), false);
        C2679b.b(parcel, iA);
    }
}
