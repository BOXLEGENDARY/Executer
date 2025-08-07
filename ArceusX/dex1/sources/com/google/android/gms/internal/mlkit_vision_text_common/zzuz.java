package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.N9;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import o3.C2679b;

public final class zzuz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuz> CREATOR = new N9();

    private final String f15735d;

    private final Rect f15736e;

    private final List f15737i;

    private final String f15738v;

    private final List f15739w;

    public zzuz(String str, Rect rect, List list, String str2, List list2) {
        this.f15735d = str;
        this.f15736e = rect;
        this.f15737i = list;
        this.f15738v = str2;
        this.f15739w = list2;
    }

    public final Rect l() {
        return this.f15736e;
    }

    public final String n() {
        return this.f15738v;
    }

    public final String o() {
        return this.f15735d;
    }

    public final List p() {
        return this.f15737i;
    }

    public final List q() {
        return this.f15739w;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15735d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.s(parcel, 2, this.f15736e, i7, false);
        C2679b.y(parcel, 3, this.f15737i, false);
        C2679b.u(parcel, 4, this.f15738v, false);
        C2679b.y(parcel, 5, this.f15739w, false);
        C2679b.b(parcel, iA);
    }
}
