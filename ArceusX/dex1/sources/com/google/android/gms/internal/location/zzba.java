package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import n3.C2649g;
import o3.C2679b;

public final class zzba extends AbstractSafeParcelable {

    final boolean f14620A;

    boolean f14621B;

    String f14622C;

    long f14623D;

    final LocationRequest f14624d;

    final List<ClientIdentity> f14625e;

    final String f14626i;

    final boolean f14627v;

    final boolean f14628w;

    final boolean f14629y;

    final String f14630z;

    static final List<ClientIdentity> f14619E = Collections.emptyList();
    public static final Parcelable.Creator<zzba> CREATOR = new j();

    zzba(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z7, boolean z8, boolean z9, String str2, boolean z10, boolean z11, String str3, long j7) {
        this.f14624d = locationRequest;
        this.f14625e = list;
        this.f14626i = str;
        this.f14627v = z7;
        this.f14628w = z8;
        this.f14629y = z9;
        this.f14630z = str2;
        this.f14620A = z10;
        this.f14621B = z11;
        this.f14622C = str3;
        this.f14623D = j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (C2649g.b(this.f14624d, zzbaVar.f14624d) && C2649g.b(this.f14625e, zzbaVar.f14625e) && C2649g.b(this.f14626i, zzbaVar.f14626i) && this.f14627v == zzbaVar.f14627v && this.f14628w == zzbaVar.f14628w && this.f14629y == zzbaVar.f14629y && C2649g.b(this.f14630z, zzbaVar.f14630z) && this.f14620A == zzbaVar.f14620A && this.f14621B == zzbaVar.f14621B && C2649g.b(this.f14622C, zzbaVar.f14622C)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14624d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14624d);
        if (this.f14626i != null) {
            sb.append(" tag=");
            sb.append(this.f14626i);
        }
        if (this.f14630z != null) {
            sb.append(" moduleId=");
            sb.append(this.f14630z);
        }
        if (this.f14622C != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.f14622C);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f14627v);
        sb.append(" clients=");
        sb.append(this.f14625e);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f14628w);
        if (this.f14629y) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.f14620A) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.f14621B) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 1, this.f14624d, i7, false);
        C2679b.y(parcel, 5, this.f14625e, false);
        C2679b.u(parcel, 6, this.f14626i, false);
        C2679b.c(parcel, 7, this.f14627v);
        C2679b.c(parcel, 8, this.f14628w);
        C2679b.c(parcel, 9, this.f14629y);
        C2679b.u(parcel, 10, this.f14630z, false);
        C2679b.c(parcel, 11, this.f14620A);
        C2679b.c(parcel, 12, this.f14621B);
        C2679b.u(parcel, 13, this.f14622C, false);
        C2679b.q(parcel, 14, this.f14623D);
        C2679b.b(parcel, iA);
    }
}
