package K3;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public interface c1 extends IInterface {
    void V5(Status status, PendingIntent pendingIntent) throws RemoteException;
}
