package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.P9;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import o3.C2679b;

public final class zzvd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvd> CREATOR = new P9();

    private final String f15747d;

    private final Rect f15748e;

    private final List f15749i;

    private final String f15750v;

    private final List f15751w;

    private final float f15752y;

    private final float f15753z;

    public zzvd(String str, Rect rect, List list, String str2, List list2, float f7, float f8) {
        this.f15747d = str;
        this.f15748e = rect;
        this.f15749i = list;
        this.f15750v = str2;
        this.f15751w = list2;
        this.f15752y = f7;
        this.f15753z = f8;
    }

    public final float l() {
        return this.f15753z;
    }

    public final float n() {
        return this.f15752y;
    }

    public final Rect o() {
        return this.f15748e;
    }

    public final String p() {
        return this.f15750v;
    }

    public final String q() {
        return this.f15747d;
    }

    public final List r() {
        return this.f15749i;
    }

    public final List s() {
        return this.f15751w;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15747d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.s(parcel, 2, this.f15748e, i7, false);
        C2679b.y(parcel, 3, this.f15749i, false);
        C2679b.u(parcel, 4, this.f15750v, false);
        C2679b.y(parcel, 5, this.f15751w, false);
        C2679b.j(parcel, 6, this.f15752y);
        C2679b.j(parcel, 7, this.f15753z);
        C2679b.b(parcel, iA);
    }
}
