package H4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class M extends B implements N {
    public M() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 == 2) {
            Bundle bundle = (Bundle) F.a(parcel, Bundle.CREATOR);
            F.b(parcel);
            D4(bundle);
            return true;
        }
        if (i7 == 3) {
            Bundle bundle2 = (Bundle) F.a(parcel, Bundle.CREATOR);
            F.b(parcel);
            U2(bundle2);
            return true;
        }
        if (i7 == 4) {
            Bundle bundle3 = (Bundle) F.a(parcel, Bundle.CREATOR);
            F.b(parcel);
            h5(bundle3);
            return true;
        }
        if (i7 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) F.a(parcel, Bundle.CREATOR);
        F.b(parcel);
        w0(bundle4);
        return true;
    }
}
