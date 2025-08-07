package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.C0698n;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new C0698n();

    public int f15398d;

    public int f15399e;

    public int f15400i;

    public long f15401v;

    public int f15402w;

    public zzan(int i7, int i8, int i9, long j7, int i10) {
        this.f15398d = i7;
        this.f15399e = i8;
        this.f15400i = i9;
        this.f15401v = j7;
        this.f15402w = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, this.f15398d);
        C2679b.m(parcel, 3, this.f15399e);
        C2679b.m(parcel, 4, this.f15400i);
        C2679b.q(parcel, 5, this.f15401v);
        C2679b.m(parcel, 6, this.f15402w);
        C2679b.b(parcel, iA);
    }
}
