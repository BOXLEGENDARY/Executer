package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class b extends M3.a implements M3.d {
    b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override
    public final void A1(zzbc zzbcVar) throws RemoteException {
        Parcel parcelE0 = E0();
        M3.i.c(parcelE0, zzbcVar);
        O0(59, parcelE0);
    }

    @Override
    public final void E3(zzl zzlVar) throws RemoteException {
        Parcel parcelE0 = E0();
        M3.i.c(parcelE0, zzlVar);
        O0(75, parcelE0);
    }

    @Override
    public final void U0(boolean z7) throws RemoteException {
        Parcel parcelE0 = E0();
        M3.i.a(parcelE0, z7);
        O0(12, parcelE0);
    }
}
