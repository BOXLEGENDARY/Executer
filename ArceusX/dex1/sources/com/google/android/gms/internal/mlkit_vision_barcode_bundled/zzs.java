package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new q();

    private final int f15642d;

    public zzs(int i7) {
        this.f15642d = i7;
    }

    public final int l() {
        return this.f15642d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15642d);
        C2679b.b(parcel, iA);
    }
}
