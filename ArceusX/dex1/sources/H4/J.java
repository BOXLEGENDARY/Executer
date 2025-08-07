package H4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class J extends C0428a implements L {
    J(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    @Override
    public final void B2(Bundle bundle, N n7) throws RemoteException {
        Parcel parcelE0 = E0();
        F.c(parcelE0, bundle);
        parcelE0.writeStrongBinder(n7);
        O0(3, parcelE0);
    }

    @Override
    public final void Q4(Bundle bundle, N n7) throws RemoteException {
        Parcel parcelE0 = E0();
        F.c(parcelE0, bundle);
        parcelE0.writeStrongBinder(n7);
        O0(2, parcelE0);
    }
}
