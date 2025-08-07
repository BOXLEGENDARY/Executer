package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import m3.InterfaceC2573d;
import s3.InterfaceC2875e;
import s3.InterfaceC2877g;

public final class c extends I3.a implements IInterface {
    c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void S5(InterfaceC2573d interfaceC2573d, InterfaceC2877g interfaceC2877g) throws RemoteException {
        Parcel parcelE0 = E0();
        I3.c.d(parcelE0, interfaceC2573d);
        I3.c.d(parcelE0, interfaceC2877g);
        O0(6, parcelE0);
    }

    public final void h3(InterfaceC2875e interfaceC2875e, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel parcelE0 = E0();
        I3.c.d(parcelE0, interfaceC2875e);
        I3.c.c(parcelE0, apiFeatureRequest);
        O0(1, parcelE0);
    }

    public final void n3(InterfaceC2875e interfaceC2875e, ApiFeatureRequest apiFeatureRequest, InterfaceC2877g interfaceC2877g) throws RemoteException {
        Parcel parcelE0 = E0();
        I3.c.d(parcelE0, interfaceC2875e);
        I3.c.c(parcelE0, apiFeatureRequest);
        I3.c.d(parcelE0, interfaceC2877g);
        O0(2, parcelE0);
    }
}
