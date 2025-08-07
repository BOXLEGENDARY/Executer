package j3;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class o extends G3.s implements p {
    public o() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 == 1) {
            d2();
        } else {
            if (i7 != 2) {
                return false;
            }
            r1();
        }
        return true;
    }
}
