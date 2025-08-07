package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = new l();

    private final int f14582d;

    private final short f14583e;

    private final short f14584i;

    UvmEntry(int i7, short s7, short s8) {
        this.f14582d = i7;
        this.f14583e = s7;
        this.f14584i = s8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f14582d == uvmEntry.f14582d && this.f14583e == uvmEntry.f14583e && this.f14584i == uvmEntry.f14584i;
    }

    public int hashCode() {
        return C2649g.c(Integer.valueOf(this.f14582d), Short.valueOf(this.f14583e), Short.valueOf(this.f14584i));
    }

    public short l() {
        return this.f14583e;
    }

    public short n() {
        return this.f14584i;
    }

    public int o() {
        return this.f14582d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, o());
        C2679b.t(parcel, 2, l());
        C2679b.t(parcel, 3, n());
        C2679b.b(parcel, iA);
    }
}
