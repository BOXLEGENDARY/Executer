package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import n3.C2658p;
import o3.C2679b;

public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C2658p();

    private final int f14263d;

    private List f14264e;

    public TelemetryData(int i7, List list) {
        this.f14263d = i7;
        this.f14264e = list;
    }

    public final int l() {
        return this.f14263d;
    }

    public final List n() {
        return this.f14264e;
    }

    public final void o(MethodInvocation methodInvocation) {
        if (this.f14264e == null) {
            this.f14264e = new ArrayList();
        }
        this.f14264e.add(methodInvocation);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f14263d);
        C2679b.y(parcel, 2, this.f14264e, false);
        C2679b.b(parcel, iA);
    }
}
