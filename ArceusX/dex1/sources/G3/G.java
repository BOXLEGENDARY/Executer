package G3;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

public interface G extends IInterface {
    void X5(Status status, SavePasswordResult savePasswordResult) throws RemoteException;
}
