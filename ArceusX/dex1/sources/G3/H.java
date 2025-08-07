package G3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import m3.InterfaceC2573d;

public final class H extends C0420a implements IInterface {
    H(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void S5(InterfaceC2573d interfaceC2573d, String str) throws RemoteException {
        Parcel parcelE0 = E0();
        t.d(parcelE0, interfaceC2573d);
        parcelE0.writeString(str);
        O0(2, parcelE0);
    }

    public final void V0(z zVar, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel parcelE0 = E0();
        t.d(parcelE0, zVar);
        t.c(parcelE0, beginSignInRequest);
        O0(1, parcelE0);
    }

    public final void h3(C c2, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) throws RemoteException {
        Parcel parcelE0 = E0();
        t.d(parcelE0, c2);
        t.c(parcelE0, getPhoneNumberHintIntentRequest);
        parcelE0.writeString(str);
        O0(4, parcelE0);
    }

    public final void n3(E e7, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel parcelE0 = E0();
        t.d(parcelE0, e7);
        t.c(parcelE0, getSignInIntentRequest);
        O0(3, parcelE0);
    }
}
