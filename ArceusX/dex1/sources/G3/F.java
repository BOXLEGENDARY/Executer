package G3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;

public abstract class F extends s implements G {
    public F() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) t.a(parcel, Status.CREATOR);
        SavePasswordResult savePasswordResult = (SavePasswordResult) t.a(parcel, SavePasswordResult.CREATOR);
        t.b(parcel);
        X5(status, savePasswordResult);
        return true;
    }
}
