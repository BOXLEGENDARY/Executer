package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.C0643i;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2649g;
import o3.C2679b;

public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C0643i();

    public int f15396d;

    public boolean f15397e;

    public zzah() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        return this.f15396d == zzahVar.f15396d && C2649g.b(Boolean.valueOf(this.f15397e), Boolean.valueOf(zzahVar.f15397e));
    }

    public final int hashCode() {
        return C2649g.c(Integer.valueOf(this.f15396d), Boolean.valueOf(this.f15397e));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, this.f15396d);
        C2679b.c(parcel, 3, this.f15397e);
        C2679b.b(parcel, iA);
    }

    public zzah(int i7, boolean z7) {
        this.f15396d = i7;
        this.f15397e = z7;
    }
}
