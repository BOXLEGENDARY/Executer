package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new s();

    private final String f15577d;

    private final String f15578e;

    private final String f15579i;

    private final String f15580v;

    private final String f15581w;

    private final zzf f15582y;

    private final zzf f15583z;

    public zzg(String str, String str2, String str3, String str4, String str5, zzf zzfVar, zzf zzfVar2) {
        this.f15577d = str;
        this.f15578e = str2;
        this.f15579i = str3;
        this.f15580v = str4;
        this.f15581w = str5;
        this.f15582y = zzfVar;
        this.f15583z = zzfVar2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, this.f15577d, false);
        C2679b.u(parcel, 2, this.f15578e, false);
        C2679b.u(parcel, 3, this.f15579i, false);
        C2679b.u(parcel, 4, this.f15580v, false);
        C2679b.u(parcel, 5, this.f15581w, false);
        C2679b.s(parcel, 6, this.f15582y, i7, false);
        C2679b.s(parcel, 7, this.f15583z, i7, false);
        C2679b.b(parcel, iA);
    }
}
