package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.R9;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzyb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyb> CREATOR = new R9();

    private final zzxx f15540A;

    private final zzxy f15541B;

    private final zzya f15542C;

    private final zzxz f15543D;

    private final zzxv f15544E;

    private final zzxr f15545F;

    private final zzxs f15546G;

    private final zzxt f15547H;

    private final int f15548d;

    private final String f15549e;

    private final String f15550i;

    private final byte[] f15551v;

    private final Point[] f15552w;

    private final int f15553y;

    private final zzxu f15554z;

    public zzyb(int i7, String str, String str2, byte[] bArr, Point[] pointArr, int i8, zzxu zzxuVar, zzxx zzxxVar, zzxy zzxyVar, zzya zzyaVar, zzxz zzxzVar, zzxv zzxvVar, zzxr zzxrVar, zzxs zzxsVar, zzxt zzxtVar) {
        this.f15548d = i7;
        this.f15549e = str;
        this.f15550i = str2;
        this.f15551v = bArr;
        this.f15552w = pointArr;
        this.f15553y = i8;
        this.f15554z = zzxuVar;
        this.f15540A = zzxxVar;
        this.f15541B = zzxyVar;
        this.f15542C = zzyaVar;
        this.f15543D = zzxzVar;
        this.f15544E = zzxvVar;
        this.f15545F = zzxrVar;
        this.f15546G = zzxsVar;
        this.f15547H = zzxtVar;
    }

    public final int l() {
        return this.f15548d;
    }

    public final int n() {
        return this.f15553y;
    }

    public final String o() {
        return this.f15550i;
    }

    public final Point[] p() {
        return this.f15552w;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15548d);
        C2679b.u(parcel, 2, this.f15549e, false);
        C2679b.u(parcel, 3, this.f15550i, false);
        C2679b.f(parcel, 4, this.f15551v, false);
        C2679b.x(parcel, 5, this.f15552w, i7, false);
        C2679b.m(parcel, 6, this.f15553y);
        C2679b.s(parcel, 7, this.f15554z, i7, false);
        C2679b.s(parcel, 8, this.f15540A, i7, false);
        C2679b.s(parcel, 9, this.f15541B, i7, false);
        C2679b.s(parcel, 10, this.f15542C, i7, false);
        C2679b.s(parcel, 11, this.f15543D, i7, false);
        C2679b.s(parcel, 12, this.f15544E, i7, false);
        C2679b.s(parcel, 13, this.f15545F, i7, false);
        C2679b.s(parcel, 14, this.f15546G, i7, false);
        C2679b.s(parcel, 15, this.f15547H, i7, false);
        C2679b.b(parcel, iA);
    }
}
