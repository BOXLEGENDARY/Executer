package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzs;
import java.util.Collections;
import java.util.List;
import n3.C2649g;
import o3.C2679b;

public final class zzj extends AbstractSafeParcelable {

    final zzs f14639d;

    final List<ClientIdentity> f14640e;

    final String f14641i;

    static final List<ClientIdentity> f14637v = Collections.emptyList();

    static final zzs f14638w = new zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new n();

    zzj(zzs zzsVar, List<ClientIdentity> list, String str) {
        this.f14639d = zzsVar;
        this.f14640e = list;
        this.f14641i = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return C2649g.b(this.f14639d, zzjVar.f14639d) && C2649g.b(this.f14640e, zzjVar.f14640e) && C2649g.b(this.f14641i, zzjVar.f14641i);
    }

    public final int hashCode() {
        return this.f14639d.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14639d);
        String strValueOf2 = String.valueOf(this.f14640e);
        String str = this.f14641i;
        int length = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + strValueOf2.length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(strValueOf);
        sb.append(", clients=");
        sb.append(strValueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 1, this.f14639d, i7, false);
        C2679b.y(parcel, 2, this.f14640e, false);
        C2679b.u(parcel, 3, this.f14641i, false);
        C2679b.b(parcel, iA);
    }
}
