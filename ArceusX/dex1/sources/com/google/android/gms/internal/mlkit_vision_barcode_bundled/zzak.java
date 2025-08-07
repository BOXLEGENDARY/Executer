package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new l();

    private final int f15562d;

    private final int f15563e;

    private final int f15564i;

    private final int f15565v;

    private final long f15566w;

    public zzak(int i7, int i8, int i9, int i10, long j7) {
        this.f15562d = i7;
        this.f15563e = i8;
        this.f15564i = i9;
        this.f15565v = i10;
        this.f15566w = j7;
    }

    public final int l() {
        return this.f15564i;
    }

    public final int n() {
        return this.f15562d;
    }

    public final int o() {
        return this.f15565v;
    }

    public final int p() {
        return this.f15563e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15562d);
        C2679b.m(parcel, 2, this.f15563e);
        C2679b.m(parcel, 3, this.f15564i);
        C2679b.m(parcel, 4, this.f15565v);
        C2679b.q(parcel, 5, this.f15566w);
        C2679b.b(parcel, iA);
    }
}
