package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.Q9;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import o3.C2679b;

public final class zzvf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvf> CREATOR = new Q9();

    private final String f15754d;

    private final List f15755e;

    public zzvf(String str, List list) {
        this.f15754d = str;
        this.f15755e = list;
    }

    public final String l() {
        return this.f15754d;
    }

    public final List n() {
        return this.f15755e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15754d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.y(parcel, 2, this.f15755e, false);
        C2679b.b(parcel, iA);
    }
}
