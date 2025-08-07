package E3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class a implements IInterface {

    private final IBinder f1076d;

    private final String f1077e = "com.google.android.gms.appset.internal.IAppSetService";

    protected a(IBinder iBinder, String str) {
        this.f1076d = iBinder;
    }

    protected final Parcel E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f1077e);
        return parcelObtain;
    }

    protected final void O0(int i7, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f1076d.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f1076d;
    }
}
