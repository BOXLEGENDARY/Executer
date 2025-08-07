package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;
import r3.C2750h;

public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new C2750h();

    private final int f14362d;

    private final boolean f14363e;

    public ModuleInstallResponse(int i7) {
        this(i7, false);
    }

    public int l() {
        return this.f14362d;
    }

    public final boolean n() {
        return this.f14363e;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, l());
        C2679b.c(parcel, 2, this.f14363e);
        C2679b.b(parcel, iA);
    }

    public ModuleInstallResponse(int i7, boolean z7) {
        this.f14362d = i7;
        this.f14363e = z7;
    }
}
