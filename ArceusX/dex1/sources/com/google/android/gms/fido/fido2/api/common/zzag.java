package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new C3.g();

    private final String f14587d;

    public zzag(String str) {
        this.f14587d = (String) C2651i.l(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.f14587d.equals(((zzag) obj).f14587d);
        }
        return false;
    }

    public final int hashCode() {
        return C2649g.c(this.f14587d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, this.f14587d, false);
        C2679b.b(parcel, iA);
    }
}
