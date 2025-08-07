package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new i();

    final int f14345d;

    final IBinder f14346e;

    private final ConnectionResult f14347i;

    private final boolean f14348v;

    private final boolean f14349w;

    zav(int i7, IBinder iBinder, ConnectionResult connectionResult, boolean z7, boolean z8) {
        this.f14345d = i7;
        this.f14346e = iBinder;
        this.f14347i = connectionResult;
        this.f14348v = z7;
        this.f14349w = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.f14347i.equals(zavVar.f14347i) && C2649g.b(n(), zavVar.n());
    }

    public final ConnectionResult l() {
        return this.f14347i;
    }

    public final e n() {
        IBinder iBinder = this.f14346e;
        if (iBinder == null) {
            return null;
        }
        return e.a.O0(iBinder);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f14345d);
        C2679b.l(parcel, 2, this.f14346e, false);
        C2679b.s(parcel, 3, this.f14347i, i7, false);
        C2679b.c(parcel, 4, this.f14348v);
        C2679b.c(parcel, 5, this.f14349w);
        C2679b.b(parcel, iA);
    }
}
