package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.t;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new t();

    private final zzl f15584d;

    private final String f15585e;

    private final String f15586i;

    private final zzm[] f15587v;

    private final zzj[] f15588w;

    private final String[] f15589y;

    private final zze[] f15590z;

    public zzh(zzl zzlVar, String str, String str2, zzm[] zzmVarArr, zzj[] zzjVarArr, String[] strArr, zze[] zzeVarArr) {
        this.f15584d = zzlVar;
        this.f15585e = str;
        this.f15586i = str2;
        this.f15587v = zzmVarArr;
        this.f15588w = zzjVarArr;
        this.f15589y = strArr;
        this.f15590z = zzeVarArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 1, this.f15584d, i7, false);
        C2679b.u(parcel, 2, this.f15585e, false);
        C2679b.u(parcel, 3, this.f15586i, false);
        C2679b.x(parcel, 4, this.f15587v, i7, false);
        C2679b.x(parcel, 5, this.f15588w, i7, false);
        C2679b.v(parcel, 6, this.f15589y, false);
        C2679b.x(parcel, 7, this.f15590z, i7, false);
        C2679b.b(parcel, iA);
    }
}
