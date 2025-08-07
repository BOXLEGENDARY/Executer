package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public class UserVerificationMethodExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserVerificationMethodExtension> CREATOR = new C3.m();

    private final boolean f14580d;

    public UserVerificationMethodExtension(boolean z7) {
        this.f14580d = z7;
    }

    public boolean equals(Object obj) {
        return (obj instanceof UserVerificationMethodExtension) && this.f14580d == ((UserVerificationMethodExtension) obj).f14580d;
    }

    public int hashCode() {
        return C2649g.c(Boolean.valueOf(this.f14580d));
    }

    public boolean l() {
        return this.f14580d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.c(parcel, 1, l());
        C2679b.b(parcel, iA);
    }
}
