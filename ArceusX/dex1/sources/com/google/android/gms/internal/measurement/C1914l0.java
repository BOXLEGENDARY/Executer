package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class C1914l0 extends P implements InterfaceC1922m0 {
    C1914l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override
    public final int d() throws RemoteException {
        Parcel parcelO0 = O0(2, E0());
        int i7 = parcelO0.readInt();
        parcelO0.recycle();
        return i7;
    }

    @Override
    public final void f1(String str, String str2, Bundle bundle, long j7) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeString(str2);
        S.d(parcelE0, bundle);
        parcelE0.writeLong(j7);
        V0(1, parcelE0);
    }
}
