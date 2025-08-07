package G3;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

public interface z extends IInterface {
    void Y1(Status status, BeginSignInResult beginSignInResult) throws RemoteException;
}
