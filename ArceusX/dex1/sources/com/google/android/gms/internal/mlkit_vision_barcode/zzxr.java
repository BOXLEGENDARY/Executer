package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.U9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxr> CREATOR = new U9();

    private final String f15490d;

    private final String f15491e;

    private final String f15492i;

    private final String f15493v;

    private final String f15494w;

    private final zzxq f15495y;

    private final zzxq f15496z;

    public zzxr(String str, String str2, String str3, String str4, String str5, zzxq zzxqVar, zzxq zzxqVar2) {
        this.f15490d = str;
        this.f15491e = str2;
        this.f15492i = str3;
        this.f15493v = str4;
        this.f15494w = str5;
        this.f15495y = zzxqVar;
        this.f15496z = zzxqVar2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15490d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.u(parcel, 2, this.f15491e, false);
        C2679b.u(parcel, 3, this.f15492i, false);
        C2679b.u(parcel, 4, this.f15493v, false);
        C2679b.u(parcel, 5, this.f15494w, false);
        C2679b.s(parcel, 6, this.f15495y, i7, false);
        C2679b.s(parcel, 7, this.f15496z, i7, false);
        C2679b.b(parcel, iA);
    }
}
