package G3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

public abstract class y extends s implements z {
    public y() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) t.a(parcel, Status.CREATOR);
        BeginSignInResult beginSignInResult = (BeginSignInResult) t.a(parcel, BeginSignInResult.CREATOR);
        t.b(parcel);
        Y1(status, beginSignInResult);
        return true;
    }
}
