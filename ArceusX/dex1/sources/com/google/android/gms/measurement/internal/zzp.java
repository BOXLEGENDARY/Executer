package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import n3.C2651i;
import o3.C2679b;

public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new n4();

    public final boolean f17153A;

    public final boolean f17154B;

    public final long f17155C;

    public final String f17156D;

    public final long f17157E;

    public final long f17158F;

    public final int f17159G;

    public final boolean f17160H;

    public final boolean f17161I;

    public final String f17162J;

    public final Boolean f17163K;

    public final long f17164L;

    public final List<String> f17165M;

    public final String f17166N;

    public final String f17167O;

    public final String f17168d;

    public final String f17169e;

    public final String f17170i;

    public final String f17171v;

    public final long f17172w;

    public final long f17173y;

    public final String f17174z;

    zzp(String str, String str2, String str3, long j7, String str4, long j8, long j9, String str5, boolean z7, boolean z8, String str6, long j10, long j11, int i7, boolean z9, boolean z10, String str7, Boolean bool, long j12, List<String> list, String str8, String str9) {
        C2651i.f(str);
        this.f17168d = str;
        this.f17169e = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f17170i = str3;
        this.f17155C = j7;
        this.f17171v = str4;
        this.f17172w = j8;
        this.f17173y = j9;
        this.f17174z = str5;
        this.f17153A = z7;
        this.f17154B = z8;
        this.f17156D = str6;
        this.f17157E = j10;
        this.f17158F = j11;
        this.f17159G = i7;
        this.f17160H = z9;
        this.f17161I = z10;
        this.f17162J = str7;
        this.f17163K = bool;
        this.f17164L = j12;
        this.f17165M = list;
        this.f17166N = str8;
        this.f17167O = str9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, this.f17168d, false);
        C2679b.u(parcel, 3, this.f17169e, false);
        C2679b.u(parcel, 4, this.f17170i, false);
        C2679b.u(parcel, 5, this.f17171v, false);
        C2679b.q(parcel, 6, this.f17172w);
        C2679b.q(parcel, 7, this.f17173y);
        C2679b.u(parcel, 8, this.f17174z, false);
        C2679b.c(parcel, 9, this.f17153A);
        C2679b.c(parcel, 10, this.f17154B);
        C2679b.q(parcel, 11, this.f17155C);
        C2679b.u(parcel, 12, this.f17156D, false);
        C2679b.q(parcel, 13, this.f17157E);
        C2679b.q(parcel, 14, this.f17158F);
        C2679b.m(parcel, 15, this.f17159G);
        C2679b.c(parcel, 16, this.f17160H);
        C2679b.c(parcel, 18, this.f17161I);
        C2679b.u(parcel, 19, this.f17162J, false);
        C2679b.d(parcel, 21, this.f17163K, false);
        C2679b.q(parcel, 22, this.f17164L);
        C2679b.w(parcel, 23, this.f17165M, false);
        C2679b.u(parcel, 24, this.f17166N, false);
        C2679b.u(parcel, 25, this.f17167O, false);
        C2679b.b(parcel, iA);
    }

    zzp(String str, String str2, String str3, String str4, long j7, long j8, String str5, boolean z7, boolean z8, long j9, String str6, long j10, long j11, int i7, boolean z9, boolean z10, String str7, Boolean bool, long j12, List<String> list, String str8, String str9) {
        this.f17168d = str;
        this.f17169e = str2;
        this.f17170i = str3;
        this.f17155C = j9;
        this.f17171v = str4;
        this.f17172w = j7;
        this.f17173y = j8;
        this.f17174z = str5;
        this.f17153A = z7;
        this.f17154B = z8;
        this.f17156D = str6;
        this.f17157E = j10;
        this.f17158F = j11;
        this.f17159G = i7;
        this.f17160H = z9;
        this.f17161I = z10;
        this.f17162J = str7;
        this.f17163K = bool;
        this.f17164L = j12;
        this.f17165M = list;
        this.f17166N = str8;
        this.f17167O = str9;
    }
}
