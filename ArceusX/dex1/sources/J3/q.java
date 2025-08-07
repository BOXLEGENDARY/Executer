package j3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class q extends G3.s implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        switch (i7) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) G3.t.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) G3.t.a(parcel, Status.CREATOR);
                G3.t.b(parcel);
                K3(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) G3.t.a(parcel, Status.CREATOR);
                G3.t.b(parcel);
                x4(status2);
                break;
            case 103:
                Status status3 = (Status) G3.t.a(parcel, Status.CREATOR);
                G3.t.b(parcel);
                G3(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
