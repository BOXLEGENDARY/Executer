package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new p();

    private final String f14040d;

    @Deprecated
    private final int f14041e;

    private final long f14042i;

    public Feature(String str, int i7, long j7) {
        this.f14040d = str;
        this.f14041e = i7;
        this.f14042i = j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && l() == feature.l()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.f14040d;
    }

    public final int hashCode() {
        return C2649g.c(getName(), Long.valueOf(l()));
    }

    public long l() {
        long j7 = this.f14042i;
        return j7 == -1 ? this.f14041e : j7;
    }

    public final String toString() {
        C2649g.a aVarD = C2649g.d(this);
        aVarD.a("name", getName());
        aVarD.a("version", Long.valueOf(l()));
        return aVarD.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, getName(), false);
        C2679b.m(parcel, 2, this.f14041e);
        C2679b.q(parcel, 3, l());
        C2679b.b(parcel, iA);
    }

    public Feature(String str, long j7) {
        this.f14040d = str;
        this.f14042i = j7;
        this.f14041e = -1;
    }
}
