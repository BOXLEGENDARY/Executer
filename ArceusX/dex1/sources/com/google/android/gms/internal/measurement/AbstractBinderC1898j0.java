package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class AbstractBinderC1898j0 extends Q implements InterfaceC1906k0 {
    public AbstractBinderC1898j0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        P((Bundle) S.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
