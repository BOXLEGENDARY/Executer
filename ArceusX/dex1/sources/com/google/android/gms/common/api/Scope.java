package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2651i;
import o3.C2679b;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    final int f14052d;

    private final String f14053e;

    Scope(int i7, String str) {
        C2651i.g(str, "scopeUri must not be null or empty");
        this.f14052d = i7;
        this.f14053e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f14053e.equals(((Scope) obj).f14053e);
        }
        return false;
    }

    public int hashCode() {
        return this.f14053e.hashCode();
    }

    public String l() {
        return this.f14053e;
    }

    public String toString() {
        return this.f14053e;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14052d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, i8);
        C2679b.u(parcel, 2, l(), false);
        C2679b.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
