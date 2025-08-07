package com.google.android.gms.internal.mlkit_vision_barcode;

import O3.H8;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new H8();

    public zzr f15463A;

    public zzt f15464B;

    public zzs f15465C;

    public zzo f15466D;

    public zzk f15467E;

    public zzl f15468F;

    public zzm f15469G;

    public byte[] f15470H;

    public boolean f15471I;

    public double f15472J;

    public int f15473d;

    public String f15474e;

    public String f15475i;

    public int f15476v;

    public Point[] f15477w;

    public zzn f15478y;

    public zzq f15479z;

    public zzu() {
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 2, this.f15473d);
        C2679b.u(parcel, 3, this.f15474e, false);
        C2679b.u(parcel, 4, this.f15475i, false);
        C2679b.m(parcel, 5, this.f15476v);
        C2679b.x(parcel, 6, this.f15477w, i7, false);
        C2679b.s(parcel, 7, this.f15478y, i7, false);
        C2679b.s(parcel, 8, this.f15479z, i7, false);
        C2679b.s(parcel, 9, this.f15463A, i7, false);
        C2679b.s(parcel, 10, this.f15464B, i7, false);
        C2679b.s(parcel, 11, this.f15465C, i7, false);
        C2679b.s(parcel, 12, this.f15466D, i7, false);
        C2679b.s(parcel, 13, this.f15467E, i7, false);
        C2679b.s(parcel, 14, this.f15468F, i7, false);
        C2679b.s(parcel, 15, this.f15469G, i7, false);
        C2679b.f(parcel, 16, this.f15470H, false);
        C2679b.c(parcel, 17, this.f15471I);
        C2679b.h(parcel, 18, this.f15472J);
        C2679b.b(parcel, iA);
    }

    public zzu(int i7, String str, String str2, int i8, Point[] pointArr, zzn zznVar, zzq zzqVar, zzr zzrVar, zzt zztVar, zzs zzsVar, zzo zzoVar, zzk zzkVar, zzl zzlVar, zzm zzmVar, byte[] bArr, boolean z7, double d7) {
        this.f15473d = i7;
        this.f15474e = str;
        this.f15470H = bArr;
        this.f15475i = str2;
        this.f15476v = i8;
        this.f15477w = pointArr;
        this.f15471I = z7;
        this.f15472J = d7;
        this.f15478y = zznVar;
        this.f15479z = zzqVar;
        this.f15463A = zzrVar;
        this.f15464B = zztVar;
        this.f15465C = zzsVar;
        this.f15466D = zzoVar;
        this.f15467E = zzkVar;
        this.f15468F = zzlVar;
        this.f15469G = zzmVar;
    }
}
