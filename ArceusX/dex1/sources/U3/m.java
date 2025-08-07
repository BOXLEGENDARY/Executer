package U3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public abstract class m extends M3.f implements n {
    public static n O0(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new l(iBinder);
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 == 1) {
            D1((LocationResult) M3.i.b(parcel, LocationResult.CREATOR));
        } else {
            if (i7 != 2) {
                return false;
            }
            P2((LocationAvailability) M3.i.b(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
