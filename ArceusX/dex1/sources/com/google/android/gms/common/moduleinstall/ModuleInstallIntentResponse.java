package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;
import r3.C2748f;

public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = new C2748f();

    private final PendingIntent f14361d;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f14361d = pendingIntent;
    }

    public PendingIntent l() {
        return this.f14361d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 1, l(), i7, false);
        C2679b.b(parcel, iA);
    }
}
