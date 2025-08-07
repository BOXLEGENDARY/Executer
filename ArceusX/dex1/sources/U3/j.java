package U3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class j extends M3.f implements k {
    public static k O0(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new i(iBinder);
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        throw null;
    }
}
