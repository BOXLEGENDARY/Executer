package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new o();

    final int f14642d;

    final zzj f14643e;

    final U3.k f14644i;

    final M3.c f14645v;

    zzl(int i7, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.f14642d = i7;
        this.f14643e = zzjVar;
        M3.c aVar = null;
        this.f14644i = iBinder == null ? null : U3.j.O0(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            aVar = iInterfaceQueryLocalInterface instanceof M3.c ? (M3.c) iInterfaceQueryLocalInterface : new a(iBinder2);
        }
        this.f14645v = aVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f14642d);
        C2679b.s(parcel, 2, this.f14643e, i7, false);
        U3.k kVar = this.f14644i;
        C2679b.l(parcel, 3, kVar == null ? null : kVar.asBinder(), false);
        M3.c cVar = this.f14645v;
        C2679b.l(parcel, 4, cVar != null ? cVar.asBinder() : null, false);
        C2679b.b(parcel, iA);
    }
}
