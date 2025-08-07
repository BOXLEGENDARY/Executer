package com.google.android.gms.internal.location;

import U3.p;
import U3.q;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o3.C2679b;

public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new k();

    final int f14631d;

    final zzba f14632e;

    final q f14633i;

    final PendingIntent f14634v;

    final U3.n f14635w;

    final M3.c f14636y;

    zzbc(int i7, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f14631d = i7;
        this.f14632e = zzbaVar;
        M3.c aVar = null;
        this.f14633i = iBinder == null ? null : p.O0(iBinder);
        this.f14634v = pendingIntent;
        this.f14635w = iBinder2 == null ? null : U3.m.O0(iBinder2);
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            aVar = iInterfaceQueryLocalInterface instanceof M3.c ? (M3.c) iInterfaceQueryLocalInterface : new a(iBinder3);
        }
        this.f14636y = aVar;
    }

    public static zzbc l(q qVar, M3.c cVar) {
        if (cVar == null) {
            cVar = null;
        }
        return new zzbc(2, null, qVar, null, null, cVar);
    }

    public static zzbc n(U3.n nVar, M3.c cVar) {
        if (cVar == null) {
            cVar = null;
        }
        return new zzbc(2, null, null, null, nVar, cVar);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.m(parcel, 1, this.f14631d);
        C2679b.s(parcel, 2, this.f14632e, i7, false);
        q qVar = this.f14633i;
        C2679b.l(parcel, 3, qVar == null ? null : qVar.asBinder(), false);
        C2679b.s(parcel, 4, this.f14634v, i7, false);
        U3.n nVar = this.f14635w;
        C2679b.l(parcel, 5, nVar == null ? null : nVar.asBinder(), false);
        M3.c cVar = this.f14636y;
        C2679b.l(parcel, 6, cVar != null ? cVar.asBinder() : null, false);
        C2679b.b(parcel, iA);
    }
}
