package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new C3.c();

    private final boolean f14604d;

    public zzz(boolean z7) {
        this.f14604d = ((Boolean) C2651i.l(Boolean.valueOf(z7))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzz) && this.f14604d == ((zzz) obj).f14604d;
    }

    public final int hashCode() {
        return C2649g.c(Boolean.valueOf(this.f14604d));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.c(parcel, 1, this.f14604d);
        C2679b.b(parcel, iA);
    }
}
