package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new a();

    final int f14015d;

    private int f14016e;

    private Bundle f14017i;

    GoogleSignInOptionsExtensionParcelable(int i7, int i8, Bundle bundle) {
        this.f14015d = i7;
        this.f14016e = i8;
        this.f14017i = bundle;
    }

    public int l() {
        return this.f14016e;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f14015d);
        C2679b.m(parcel, 2, l());
        C2679b.e(parcel, 3, this.f14017i, false);
        C2679b.b(parcel, iA);
    }
}
