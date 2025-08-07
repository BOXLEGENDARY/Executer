package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.V9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzxs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxs> CREATOR = new V9();

    private final zzxw f15497d;

    private final String f15498e;

    private final String f15499i;

    private final zzxx[] f15500v;

    private final zzxu[] f15501w;

    private final String[] f15502y;

    private final zzxp[] f15503z;

    public zzxs(zzxw zzxwVar, String str, String str2, zzxx[] zzxxVarArr, zzxu[] zzxuVarArr, String[] strArr, zzxp[] zzxpVarArr) {
        this.f15497d = zzxwVar;
        this.f15498e = str;
        this.f15499i = str2;
        this.f15500v = zzxxVarArr;
        this.f15501w = zzxuVarArr;
        this.f15502y = strArr;
        this.f15503z = zzxpVarArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 1, this.f15497d, i7, false);
        C2679b.u(parcel, 2, this.f15498e, false);
        C2679b.u(parcel, 3, this.f15499i, false);
        C2679b.x(parcel, 4, this.f15500v, i7, false);
        C2679b.x(parcel, 5, this.f15501w, i7, false);
        C2679b.v(parcel, 6, this.f15502y, false);
        C2679b.x(parcel, 7, this.f15503z, i7, false);
        C2679b.b(parcel, iA);
    }
}
