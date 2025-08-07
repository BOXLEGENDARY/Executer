package G3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

public final class A extends C0420a implements IInterface {
    A(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void V0(G g7, SavePasswordRequest savePasswordRequest) throws RemoteException {
        Parcel parcelE0 = E0();
        t.d(parcelE0, g7);
        t.c(parcelE0, savePasswordRequest);
        O0(2, parcelE0);
    }
}
