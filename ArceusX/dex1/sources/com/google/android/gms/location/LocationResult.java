package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o3.C2679b;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    private final List<Location> f16215d;

    static final List<Location> f16214e = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new c();

    LocationResult(List<Location> list) {
        this.f16215d = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f16215d.size() != this.f16215d.size()) {
            return false;
        }
        Iterator<Location> it = locationResult.f16215d.iterator();
        Iterator<Location> it2 = this.f16215d.iterator();
        while (it.hasNext()) {
            if (it2.next().getTime() != it.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator<Location> it = this.f16215d.iterator();
        int i7 = 17;
        while (it.hasNext()) {
            long time = it.next().getTime();
            i7 = (i7 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i7;
    }

    public List<Location> l() {
        return this.f16215d;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f16215d);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.y(parcel, 1, l(), false);
        C2679b.b(parcel, iA);
    }
}
