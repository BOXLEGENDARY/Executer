package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import P3.p;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new p();

    private final zzm f15627A;

    private final zzn f15628B;

    private final zzp f15629C;

    private final zzo f15630D;

    private final zzk f15631E;

    private final zzg f15632F;

    private final zzh f15633G;

    private final zzi f15634H;

    private final int f15635d;

    private final String f15636e;

    private final String f15637i;

    private final byte[] f15638v;

    private final Point[] f15639w;

    private final int f15640y;

    private final zzj f15641z;

    public zzq(int i7, String str, String str2, byte[] bArr, Point[] pointArr, int i8, zzj zzjVar, zzm zzmVar, zzn zznVar, zzp zzpVar, zzo zzoVar, zzk zzkVar, zzg zzgVar, zzh zzhVar, zzi zziVar) {
        this.f15635d = i7;
        this.f15636e = str;
        this.f15637i = str2;
        this.f15638v = bArr;
        this.f15639w = pointArr;
        this.f15640y = i8;
        this.f15641z = zzjVar;
        this.f15627A = zzmVar;
        this.f15628B = zznVar;
        this.f15629C = zzpVar;
        this.f15630D = zzoVar;
        this.f15631E = zzkVar;
        this.f15632F = zzgVar;
        this.f15633G = zzhVar;
        this.f15634H = zziVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15635d);
        C2679b.u(parcel, 2, this.f15636e, false);
        C2679b.u(parcel, 3, this.f15637i, false);
        C2679b.f(parcel, 4, this.f15638v, false);
        C2679b.x(parcel, 5, this.f15639w, i7, false);
        C2679b.m(parcel, 6, this.f15640y);
        C2679b.s(parcel, 7, this.f15641z, i7, false);
        C2679b.s(parcel, 8, this.f15627A, i7, false);
        C2679b.s(parcel, 9, this.f15628B, i7, false);
        C2679b.s(parcel, 10, this.f15629C, i7, false);
        C2679b.s(parcel, 11, this.f15630D, i7, false);
        C2679b.s(parcel, 12, this.f15631E, i7, false);
        C2679b.s(parcel, 13, this.f15632F, i7, false);
        C2679b.s(parcel, 14, this.f15633G, i7, false);
        C2679b.s(parcel, 15, this.f15634H, i7, false);
        C2679b.b(parcel, iA);
    }
}
