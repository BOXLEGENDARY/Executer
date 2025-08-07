package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.S9;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import o3.C2679b;

public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new S9();

    private final String f15763d;

    private final Rect f15764e;

    private final List f15765i;

    private final float f15766v;

    private final float f15767w;

    public zzvj(String str, Rect rect, List list, float f7, float f8) {
        this.f15763d = str;
        this.f15764e = rect;
        this.f15765i = list;
        this.f15766v = f7;
        this.f15767w = f8;
    }

    public final float l() {
        return this.f15767w;
    }

    public final float n() {
        return this.f15766v;
    }

    public final Rect o() {
        return this.f15764e;
    }

    public final String p() {
        return this.f15763d;
    }

    public final List q() {
        return this.f15765i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15763d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.s(parcel, 2, this.f15764e, i7, false);
        C2679b.y(parcel, 3, this.f15765i, false);
        C2679b.j(parcel, 4, this.f15766v);
        C2679b.j(parcel, 5, this.f15767w);
        C2679b.b(parcel, iA);
    }
}
