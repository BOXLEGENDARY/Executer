package U3;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public interface n extends IInterface {
    void D1(LocationResult locationResult) throws RemoteException;

    void P2(LocationAvailability locationAvailability) throws RemoteException;
}
