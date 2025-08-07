package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class c extends I3.a implements IInterface {
    c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void h3(zai zaiVar, Y3.c cVar) throws RemoteException {
        Parcel parcelE0 = E0();
        I3.c.c(parcelE0, zaiVar);
        I3.c.d(parcelE0, cVar);
        O0(12, parcelE0);
    }
}
