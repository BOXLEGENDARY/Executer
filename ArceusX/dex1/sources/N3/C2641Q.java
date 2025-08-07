package n3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import y3.InterfaceC3023a;

public final class C2641Q extends J3.a implements InterfaceC2628D {
    C2641Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override
    public final int a() throws RemoteException {
        Parcel parcelE0 = E0(2, O0());
        int i7 = parcelE0.readInt();
        parcelE0.recycle();
        return i7;
    }

    @Override
    public final InterfaceC3023a d() throws RemoteException {
        Parcel parcelE0 = E0(1, O0());
        InterfaceC3023a interfaceC3023aO0 = InterfaceC3023a.AbstractBinderC0238a.O0(parcelE0.readStrongBinder());
        parcelE0.recycle();
        return interfaceC3023aO0;
    }
}
