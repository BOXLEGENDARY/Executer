package j3;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public interface r extends IInterface {
    void G3(Status status) throws RemoteException;

    void K3(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;

    void x4(Status status) throws RemoteException;
}
