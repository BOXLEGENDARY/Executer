package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import n3.C2649g;
import n3.C2651i;
import o3.C2679b;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C3.r();

    private final List f14602d;

    public zzs(List list) {
        this.f14602d = (List) C2651i.l(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.f14602d.containsAll(zzsVar.f14602d) && zzsVar.f14602d.containsAll(this.f14602d);
    }

    public final int hashCode() {
        return C2649g.c(new HashSet(this.f14602d));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.y(parcel, 1, this.f14602d, false);
        C2679b.b(parcel, iA);
    }
}
