package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import y3.InterfaceC3023a;

public final class n extends J3.a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final InterfaceC3023a V0(InterfaceC3023a interfaceC3023a, String str, int i7, InterfaceC3023a interfaceC3023a2) throws RemoteException {
        Parcel parcelO0 = O0();
        J3.c.d(parcelO0, interfaceC3023a);
        parcelO0.writeString(str);
        parcelO0.writeInt(i7);
        J3.c.d(parcelO0, interfaceC3023a2);
        Parcel parcelE0 = E0(2, parcelO0);
        InterfaceC3023a interfaceC3023aO0 = InterfaceC3023a.AbstractBinderC0238a.O0(parcelE0.readStrongBinder());
        parcelE0.recycle();
        return interfaceC3023aO0;
    }

    public final InterfaceC3023a h3(InterfaceC3023a interfaceC3023a, String str, int i7, InterfaceC3023a interfaceC3023a2) throws RemoteException {
        Parcel parcelO0 = O0();
        J3.c.d(parcelO0, interfaceC3023a);
        parcelO0.writeString(str);
        parcelO0.writeInt(i7);
        J3.c.d(parcelO0, interfaceC3023a2);
        Parcel parcelE0 = E0(3, parcelO0);
        InterfaceC3023a interfaceC3023aO0 = InterfaceC3023a.AbstractBinderC0238a.O0(parcelE0.readStrongBinder());
        parcelE0.recycle();
        return interfaceC3023aO0;
    }
}
