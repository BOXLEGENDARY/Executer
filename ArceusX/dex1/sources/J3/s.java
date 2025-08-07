package j3;

import G3.C0420a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class s extends C0420a implements IInterface {
    s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void V0(r rVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelE0 = E0();
        G3.t.d(parcelE0, rVar);
        G3.t.c(parcelE0, googleSignInOptions);
        O0(103, parcelE0);
    }

    public final void h3(r rVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelE0 = E0();
        G3.t.d(parcelE0, rVar);
        G3.t.c(parcelE0, googleSignInOptions);
        O0(102, parcelE0);
    }
}
