package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class AbstractBinderC2092k extends BinderC2062f implements InterfaceC2098l {
    public AbstractBinderC2092k() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        int i9 = parcel.readInt();
        C2068g.b(parcel);
        y(i9);
        return true;
    }
}
