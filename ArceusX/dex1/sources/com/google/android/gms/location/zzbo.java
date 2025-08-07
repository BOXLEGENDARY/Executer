package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new f();

    public final int f16226d;

    public final int f16227e;

    public final long f16228i;

    public final long f16229v;

    zzbo(int i7, int i8, long j7, long j8) {
        this.f16226d = i7;
        this.f16227e = i8;
        this.f16228i = j7;
        this.f16229v = j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzboVar = (zzbo) obj;
            if (this.f16226d == zzboVar.f16226d && this.f16227e == zzboVar.f16227e && this.f16228i == zzboVar.f16228i && this.f16229v == zzboVar.f16229v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2649g.c(Integer.valueOf(this.f16227e), Integer.valueOf(this.f16226d), Long.valueOf(this.f16229v), Long.valueOf(this.f16228i));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f16226d + " Cell status: " + this.f16227e + " elapsed time NS: " + this.f16229v + " system time ms: " + this.f16228i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f16226d);
        C2679b.m(parcel, 2, this.f16227e);
        C2679b.q(parcel, 3, this.f16228i);
        C2679b.q(parcel, 4, this.f16229v);
        C2679b.b(parcel, iA);
    }
}
