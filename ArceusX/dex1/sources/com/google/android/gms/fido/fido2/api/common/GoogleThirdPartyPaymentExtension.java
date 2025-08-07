package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new C3.f();

    private final boolean f14519d;

    public GoogleThirdPartyPaymentExtension(boolean z7) {
        this.f14519d = z7;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GoogleThirdPartyPaymentExtension) && this.f14519d == ((GoogleThirdPartyPaymentExtension) obj).l();
    }

    public int hashCode() {
        return C2649g.c(Boolean.valueOf(this.f14519d));
    }

    public boolean l() {
        return this.f14519d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.c(parcel, 1, l());
        C2679b.b(parcel, iA);
    }
}
