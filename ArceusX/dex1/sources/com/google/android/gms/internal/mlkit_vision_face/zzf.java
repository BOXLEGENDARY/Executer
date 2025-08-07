package com.google.android.gms.internal.mlkit_vision_face;

import R3.C1054e2;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C1054e2();

    public final float f15645A;

    public final float f15646B;

    public final zzn[] f15647C;

    public final float f15648D;

    public final float f15649E;

    public final float f15650F;

    public final zzd[] f15651G;

    public final float f15652H;

    public final int f15653d;

    public final int f15654e;

    public final float f15655i;

    public final float f15656v;

    public final float f15657w;

    public final float f15658y;

    public final float f15659z;

    public zzf(int i7, int i8, float f7, float f8, float f9, float f10, float f11, float f12, float f13, zzn[] zznVarArr, float f14, float f15, float f16, zzd[] zzdVarArr, float f17) {
        this.f15653d = i7;
        this.f15654e = i8;
        this.f15655i = f7;
        this.f15656v = f8;
        this.f15657w = f9;
        this.f15658y = f10;
        this.f15659z = f11;
        this.f15645A = f12;
        this.f15646B = f13;
        this.f15647C = zznVarArr;
        this.f15648D = f14;
        this.f15649E = f15;
        this.f15650F = f16;
        this.f15651G = zzdVarArr;
        this.f15652H = f17;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15653d);
        C2679b.m(parcel, 2, this.f15654e);
        C2679b.j(parcel, 3, this.f15655i);
        C2679b.j(parcel, 4, this.f15656v);
        C2679b.j(parcel, 5, this.f15657w);
        C2679b.j(parcel, 6, this.f15658y);
        C2679b.j(parcel, 7, this.f15659z);
        C2679b.j(parcel, 8, this.f15645A);
        C2679b.x(parcel, 9, this.f15647C, i7, false);
        C2679b.j(parcel, 10, this.f15648D);
        C2679b.j(parcel, 11, this.f15649E);
        C2679b.j(parcel, 12, this.f15650F);
        C2679b.x(parcel, 13, this.f15651G, i7, false);
        C2679b.j(parcel, 14, this.f15646B);
        C2679b.j(parcel, 15, this.f15652H);
        C2679b.b(parcel, iA);
    }
}
