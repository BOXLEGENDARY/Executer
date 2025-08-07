package H4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class O extends C0428a implements Q {
    O(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    @Override
    public final void W1(Bundle bundle, T t7) throws RemoteException {
        Parcel parcelE0 = E0();
        F.c(parcelE0, bundle);
        parcelE0.writeStrongBinder(t7);
        O0(2, parcelE0);
    }
}
