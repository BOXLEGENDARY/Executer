package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class C1890i0 extends P implements InterfaceC1906k0 {
    C1890i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override
    public final void P(Bundle bundle) throws RemoteException {
        Parcel parcelE0 = E0();
        S.d(parcelE0, bundle);
        V0(1, parcelE0);
    }
}
