package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import l3.InterfaceC2540o;
import o3.C2679b;

public final class zaa extends AbstractSafeParcelable implements InterfaceC2540o {
    public static final Parcelable.Creator<zaa> CREATOR = new b();

    final int f17180d;

    private int f17181e;

    private Intent f17182i;

    public zaa() {
        this(2, 0, null);
    }

    @Override
    public final Status d() {
        return this.f17181e == 0 ? Status.f14060y : Status.f14056C;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f17180d;
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, i8);
        C2679b.m(parcel, 2, this.f17181e);
        C2679b.s(parcel, 3, this.f17182i, i7, false);
        C2679b.b(parcel, iA);
    }

    zaa(int i7, int i8, Intent intent) {
        this.f17180d = i7;
        this.f17181e = i8;
        this.f17182i = intent;
    }
}
