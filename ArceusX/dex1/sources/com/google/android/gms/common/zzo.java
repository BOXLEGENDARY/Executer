package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;
import y3.BinderC3024b;
import y3.InterfaceC3023a;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new B();

    private final String f14405d;

    private final boolean f14406e;

    private final boolean f14407i;

    private final Context f14408v;

    private final boolean f14409w;

    private final boolean f14410y;

    zzo(String str, boolean z7, boolean z8, IBinder iBinder, boolean z9, boolean z10) {
        this.f14405d = str;
        this.f14406e = z7;
        this.f14407i = z8;
        this.f14408v = (Context) BinderC3024b.V0(InterfaceC3023a.AbstractBinderC0238a.O0(iBinder));
        this.f14409w = z9;
        this.f14410y = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f14405d;
        int iA = C2679b.a(parcel);
        C2679b.u(parcel, 1, str, false);
        C2679b.c(parcel, 2, this.f14406e);
        C2679b.c(parcel, 3, this.f14407i);
        C2679b.l(parcel, 4, BinderC3024b.h3(this.f14408v), false);
        C2679b.c(parcel, 5, this.f14409w);
        C2679b.c(parcel, 6, this.f14410y);
        C2679b.b(parcel, iA);
    }
}
