package K3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class C0453a implements IInterface {

    private final IBinder f1859d;

    private final String f1860e;

    protected C0453a(IBinder iBinder, String str) {
        this.f1859d = iBinder;
        this.f1860e = str;
    }

    protected final Parcel E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f1860e);
        return parcelObtain;
    }

    protected final void O0(int i7, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f1859d.transact(i7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f1859d;
    }
}
