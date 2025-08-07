package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.O9;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import o3.C2679b;

public final class zzvb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvb> CREATOR = new O9();

    private final String f15740d;

    private final Rect f15741e;

    private final List f15742i;

    private final String f15743v;

    private final float f15744w;

    private final float f15745y;

    private final List f15746z;

    public zzvb(String str, Rect rect, List list, String str2, float f7, float f8, List list2) {
        this.f15740d = str;
        this.f15741e = rect;
        this.f15742i = list;
        this.f15743v = str2;
        this.f15744w = f7;
        this.f15745y = f8;
        this.f15746z = list2;
    }

    public final float l() {
        return this.f15745y;
    }

    public final float n() {
        return this.f15744w;
    }

    public final Rect o() {
        return this.f15741e;
    }

    public final String p() {
        return this.f15743v;
    }

    public final String q() {
        return this.f15740d;
    }

    public final List r() {
        return this.f15742i;
    }

    public final List s() {
        return this.f15746z;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15740d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.s(parcel, 2, this.f15741e, i7, false);
        C2679b.y(parcel, 3, this.f15742i, false);
        C2679b.u(parcel, 4, this.f15743v, false);
        C2679b.j(parcel, 5, this.f15744w);
        C2679b.j(parcel, 6, this.f15745y);
        C2679b.y(parcel, 7, this.f15746z, false);
        C2679b.b(parcel, iA);
    }
}
