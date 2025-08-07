package com.google.android.gms.internal.mlkit_vision_text_common;

import S3.C1373l7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C1373l7();

    private final String f15722d;

    public zzp(String str) {
        this.f15722d = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15722d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 2, str, false);
        C2679b.b(parcel, iA);
    }
}
