package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import y3.InterfaceC3023a;

public final class m extends J3.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final InterfaceC3023a M6(InterfaceC3023a interfaceC3023a, String str, boolean z7, long j7) throws RemoteException {
        Parcel parcelO0 = O0();
        J3.c.d(parcelO0, interfaceC3023a);
        parcelO0.writeString(str);
        parcelO0.writeInt(z7 ? 1 : 0);
        parcelO0.writeLong(j7);
        Parcel parcelE0 = E0(7, parcelO0);
        InterfaceC3023a interfaceC3023aO0 = InterfaceC3023a.AbstractBinderC0238a.O0(parcelE0.readStrongBinder());
        parcelE0.recycle();
        return interfaceC3023aO0;
    }

    public final InterfaceC3023a S5(InterfaceC3023a interfaceC3023a, String str, int i7, InterfaceC3023a interfaceC3023a2) throws RemoteException {
        Parcel parcelO0 = O0();
        J3.c.d(parcelO0, interfaceC3023a);
        parcelO0.writeString(str);
        parcelO0.writeInt(i7);
        J3.c.d(parcelO0, interfaceC3023a2);
        Parcel parcelE0 = E0(8, parcelO0);
        InterfaceC3023a interfaceC3023aO0 = InterfaceC3023a.AbstractBinderC0238a.O0(parcelE0.readStrongBinder());
        parcelE0.recycle();
        return interfaceC3023aO0;
    }

    public final int V0(InterfaceC3023a interfaceC3023a, String str, boolean z7) throws RemoteException {
        Parcel parcelO0 = O0();
        J3.c.d(parcelO0, interfaceC3023a);
        parcelO0.writeString(str);
        parcelO0.writeInt(z7 ? 1 : 0);
        Parcel parcelE0 = E0(3, parcelO0);
        int i7 = parcelE0.readInt();
        parcelE0.recycle();
        return i7;
    }

    public final int b() throws RemoteException {
        Parcel parcelE0 = E0(6, O0());
        int i7 = parcelE0.readInt();
        parcelE0.recycle();
        return i7;
    }

    public final int h3(InterfaceC3023a interfaceC3023a, String str, boolean z7) throws RemoteException {
        Parcel parcelO0 = O0();
        J3.c.d(parcelO0, interfaceC3023a);
        parcelO0.writeString(str);
        parcelO0.writeInt(z7 ? 1 : 0);
        Parcel parcelE0 = E0(5, parcelO0);
        int i7 = parcelE0.readInt();
        parcelE0.recycle();
        return i7;
    }

    public final InterfaceC3023a n3(InterfaceC3023a interfaceC3023a, String str, int i7) throws RemoteException {
        Parcel parcelO0 = O0();
        J3.c.d(parcelO0, interfaceC3023a);
        parcelO0.writeString(str);
        parcelO0.writeInt(i7);
        Parcel parcelE0 = E0(2, parcelO0);
        InterfaceC3023a interfaceC3023aO0 = InterfaceC3023a.AbstractBinderC0238a.O0(parcelE0.readStrongBinder());
        parcelE0.recycle();
        return interfaceC3023aO0;
    }

    public final InterfaceC3023a w6(InterfaceC3023a interfaceC3023a, String str, int i7) throws RemoteException {
        Parcel parcelO0 = O0();
        J3.c.d(parcelO0, interfaceC3023a);
        parcelO0.writeString(str);
        parcelO0.writeInt(i7);
        Parcel parcelE0 = E0(4, parcelO0);
        InterfaceC3023a interfaceC3023aO0 = InterfaceC3023a.AbstractBinderC0238a.O0(parcelE0.readStrongBinder());
        parcelE0.recycle();
        return interfaceC3023aO0;
    }
}
