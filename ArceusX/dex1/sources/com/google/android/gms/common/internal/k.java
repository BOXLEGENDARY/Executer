package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import n3.InterfaceC2646d;
import n3.InterfaceC2647e;

final class k implements InterfaceC2647e {

    private final IBinder f14310d;

    k(IBinder iBinder) {
        this.f14310d = iBinder;
    }

    @Override
    public final void O1(InterfaceC2646d interfaceC2646d, GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC2646d != null ? interfaceC2646d.asBinder() : null);
            if (getServiceRequest != null) {
                parcelObtain.writeInt(1);
                s.a(getServiceRequest, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f14310d.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f14310d;
    }
}
