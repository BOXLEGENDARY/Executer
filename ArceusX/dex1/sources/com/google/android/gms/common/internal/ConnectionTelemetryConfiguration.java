package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n3.C2636L;
import o3.C2679b;

public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C2636L();

    private final RootTelemetryConfiguration f14227d;

    private final boolean f14228e;

    private final boolean f14229i;

    private final int[] f14230v;

    private final int f14231w;

    private final int[] f14232y;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z7, boolean z8, int[] iArr, int i7, int[] iArr2) {
        this.f14227d = rootTelemetryConfiguration;
        this.f14228e = z7;
        this.f14229i = z8;
        this.f14230v = iArr;
        this.f14231w = i7;
        this.f14232y = iArr2;
    }

    public int l() {
        return this.f14231w;
    }

    public int[] n() {
        return this.f14230v;
    }

    public int[] o() {
        return this.f14232y;
    }

    public boolean p() {
        return this.f14228e;
    }

    public boolean q() {
        return this.f14229i;
    }

    public final RootTelemetryConfiguration r() {
        return this.f14227d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.s(parcel, 1, this.f14227d, i7, false);
        C2679b.c(parcel, 2, p());
        C2679b.c(parcel, 3, q());
        C2679b.n(parcel, 4, n(), false);
        C2679b.m(parcel, 5, l());
        C2679b.n(parcel, 6, o(), false);
        C2679b.b(parcel, iA);
    }
}
