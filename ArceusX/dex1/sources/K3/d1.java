package K3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

public final class d1 extends C0453a implements IInterface {
    d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    public final void V0(c1 c1Var, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) throws RemoteException {
        Parcel parcelE0 = E0();
        int i7 = C0456b0.f1862b;
        parcelE0.writeStrongBinder(c1Var);
        C0456b0.c(parcelE0, publicKeyCredentialCreationOptions);
        O0(1, parcelE0);
    }
}
