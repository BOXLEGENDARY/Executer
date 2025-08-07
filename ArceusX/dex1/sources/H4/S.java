package H4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class S extends B implements T {
    public S() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) F.a(parcel, Bundle.CREATOR);
        F.b(parcel);
        w0(bundle);
        return true;
    }
}
