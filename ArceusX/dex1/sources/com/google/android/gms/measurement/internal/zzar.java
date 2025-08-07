package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;
import o3.C2679b;

public final class zzar extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzar> CREATOR = new C2267q();

    private final Bundle f17141d;

    zzar(Bundle bundle) {
        this.f17141d = bundle;
    }

    @Override
    public final Iterator<String> iterator() {
        return new C2262p(this);
    }

    public final int l() {
        return this.f17141d.size();
    }

    public final Bundle o() {
        return new Bundle(this.f17141d);
    }

    final Double p(String str) {
        return Double.valueOf(this.f17141d.getDouble("value"));
    }

    final Long q(String str) {
        return Long.valueOf(this.f17141d.getLong("value"));
    }

    final Object r(String str) {
        return this.f17141d.get(str);
    }

    final String s(String str) {
        return this.f17141d.getString(str);
    }

    public final String toString() {
        return this.f17141d.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.e(parcel, 2, o(), false);
        C2679b.b(parcel, iA);
    }
}
