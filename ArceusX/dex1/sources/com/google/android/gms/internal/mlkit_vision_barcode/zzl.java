package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.Q9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new Q9();

    public zzp f15420d;

    public String f15421e;

    public String f15422i;

    public zzq[] f15423v;

    public zzn[] f15424w;

    public String[] f15425y;

    public zzi[] f15426z;

    public zzl() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 2, this.f15420d, i7, false);
        C2679b.u(parcel, 3, this.f15421e, false);
        C2679b.u(parcel, 4, this.f15422i, false);
        C2679b.x(parcel, 5, this.f15423v, i7, false);
        C2679b.x(parcel, 6, this.f15424w, i7, false);
        C2679b.v(parcel, 7, this.f15425y, false);
        C2679b.x(parcel, 8, this.f15426z, i7, false);
        C2679b.b(parcel, iA);
    }

    public zzl(zzp zzpVar, String str, String str2, zzq[] zzqVarArr, zzn[] zznVarArr, String[] strArr, zzi[] zziVarArr) {
        this.f15420d = zzpVar;
        this.f15421e = str;
        this.f15422i = str2;
        this.f15423v = zzqVarArr;
        this.f15424w = zznVarArr;
        this.f15425y = strArr;
        this.f15426z = zziVarArr;
    }
}
