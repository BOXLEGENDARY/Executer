package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class P implements IInterface {

    private final IBinder f14981d;

    private final String f14982e;

    protected P(IBinder iBinder, String str) {
        this.f14981d = iBinder;
        this.f14982e = str;
    }

    protected final Parcel E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f14982e);
        return parcelObtain;
    }

    protected final Parcel O0(int i7, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f14981d.transact(i7, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e7) {
                parcelObtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void V0(int i7, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f14981d.transact(i7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f14981d;
    }
}
