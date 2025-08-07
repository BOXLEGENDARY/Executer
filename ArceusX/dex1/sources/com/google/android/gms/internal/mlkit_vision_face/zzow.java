package com.google.android.gms.internal.mlkit_vision_face;

import R3.D6;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import o3.C2679b;

public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = new D6();

    private final float f15683A;

    private final float f15684B;

    private final List f15685C;

    private final List f15686D;

    private final int f15687d;

    private final Rect f15688e;

    private final float f15689i;

    private final float f15690v;

    private final float f15691w;

    private final float f15692y;

    private final float f15693z;

    public zzow(int i7, Rect rect, float f7, float f8, float f9, float f10, float f11, float f12, float f13, List list, List list2) {
        this.f15687d = i7;
        this.f15688e = rect;
        this.f15689i = f7;
        this.f15690v = f8;
        this.f15691w = f9;
        this.f15692y = f10;
        this.f15693z = f11;
        this.f15683A = f12;
        this.f15684B = f13;
        this.f15685C = list;
        this.f15686D = list2;
    }

    public final float l() {
        return this.f15692y;
    }

    public final float n() {
        return this.f15690v;
    }

    public final float o() {
        return this.f15693z;
    }

    public final float p() {
        return this.f15689i;
    }

    public final float q() {
        return this.f15683A;
    }

    public final float r() {
        return this.f15691w;
    }

    public final int s() {
        return this.f15687d;
    }

    public final Rect t() {
        return this.f15688e;
    }

    public final List v() {
        return this.f15686D;
    }

    public final List w() {
        return this.f15685C;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f15687d);
        C2679b.s(parcel, 2, this.f15688e, i7, false);
        C2679b.j(parcel, 3, this.f15689i);
        C2679b.j(parcel, 4, this.f15690v);
        C2679b.j(parcel, 5, this.f15691w);
        C2679b.j(parcel, 6, this.f15692y);
        C2679b.j(parcel, 7, this.f15693z);
        C2679b.j(parcel, 8, this.f15683A);
        C2679b.j(parcel, 9, this.f15684B);
        C2679b.y(parcel, 10, this.f15685C, false);
        C2679b.y(parcel, 11, this.f15686D, false);
        C2679b.b(parcel, iA);
    }
}
