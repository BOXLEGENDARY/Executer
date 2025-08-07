package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C3.d();

    private final long f14585d;

    public zzab(long j7) {
        this.f14585d = ((Long) C2651i.l(Long.valueOf(j7))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzab) && this.f14585d == ((zzab) obj).f14585d;
    }

    public final int hashCode() {
        return C2649g.c(Long.valueOf(this.f14585d));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.q(parcel, 1, this.f14585d);
        C2679b.b(parcel, iA);
    }
}
