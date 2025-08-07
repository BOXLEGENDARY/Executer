package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;
import r3.C2747e;

public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new C2747e();

    private final boolean f14359d;

    private final int f14360e;

    public ModuleAvailabilityResponse(boolean z7, int i7) {
        this.f14359d = z7;
        this.f14360e = i7;
    }

    public boolean l() {
        return this.f14359d;
    }

    public int n() {
        return this.f14360e;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.c(parcel, 1, l());
        C2679b.m(parcel, 2, n());
        C2679b.b(parcel, iA);
    }
}
