package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import n3.C2649g;
import o3.C2679b;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();

    @Deprecated
    int f16200d;

    @Deprecated
    int f16201e;

    long f16202i;

    int f16203v;

    zzbo[] f16204w;

    LocationAvailability(int i7, int i8, int i9, long j7, zzbo[] zzboVarArr) {
        this.f16203v = i7;
        this.f16200d = i8;
        this.f16201e = i9;
        this.f16202i = j7;
        this.f16204w = zzboVarArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f16200d == locationAvailability.f16200d && this.f16201e == locationAvailability.f16201e && this.f16202i == locationAvailability.f16202i && this.f16203v == locationAvailability.f16203v && Arrays.equals(this.f16204w, locationAvailability.f16204w)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C2649g.c(Integer.valueOf(this.f16203v), Integer.valueOf(this.f16200d), Integer.valueOf(this.f16201e), Long.valueOf(this.f16202i), this.f16204w);
    }

    public boolean l() {
        return this.f16203v < 1000;
    }

    public String toString() {
        boolean zL = l();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(zL);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f16200d);
        C2679b.m(parcel, 2, this.f16201e);
        C2679b.q(parcel, 3, this.f16202i);
        C2679b.m(parcel, 4, this.f16203v);
        C2679b.x(parcel, 5, this.f16204w, i7, false);
        C2679b.b(parcel, iA);
    }
}
