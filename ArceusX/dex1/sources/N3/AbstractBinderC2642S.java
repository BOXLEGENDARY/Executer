package n3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import y3.InterfaceC3023a;

public abstract class AbstractBinderC2642S extends J3.b implements InterfaceC2628D {
    public AbstractBinderC2642S() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static InterfaceC2628D O0(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2628D ? (InterfaceC2628D) iInterfaceQueryLocalInterface : new C2641Q(iBinder);
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 == 1) {
            InterfaceC3023a interfaceC3023aD = d();
            parcel2.writeNoException();
            J3.c.d(parcel2, interfaceC3023aD);
        } else {
            if (i7 != 2) {
                return false;
            }
            int iA = a();
            parcel2.writeNoException();
            parcel2.writeInt(iA);
        }
        return true;
    }
}
