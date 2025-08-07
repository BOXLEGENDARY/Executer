package H3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class f extends a implements IInterface {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void V0(h hVar) throws RemoteException {
        Parcel parcelE0 = E0();
        e.c(parcelE0, hVar);
        O0(1, parcelE0);
    }
}
