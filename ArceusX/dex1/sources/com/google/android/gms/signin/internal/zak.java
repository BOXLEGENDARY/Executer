package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import o3.C2679b;

public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new e();

    final int f17187d;

    private final ConnectionResult f17188e;

    private final zav f17189i;

    zak(int i7, ConnectionResult connectionResult, zav zavVar) {
        this.f17187d = i7;
        this.f17188e = connectionResult;
        this.f17189i = zavVar;
    }

    public final ConnectionResult l() {
        return this.f17188e;
    }

    public final zav n() {
        return this.f17189i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f17187d);
        C2679b.s(parcel, 2, this.f17188e, i7, false);
        C2679b.s(parcel, 3, this.f17189i, i7, false);
        C2679b.b(parcel, iA);
    }
}
