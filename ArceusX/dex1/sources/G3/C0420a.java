package G3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class C0420a implements IInterface {

    private final IBinder f1330d;

    private final String f1331e;

    protected C0420a(IBinder iBinder, String str) {
        this.f1330d = iBinder;
        this.f1331e = str;
    }

    protected final Parcel E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f1331e);
        return parcelObtain;
    }

    protected final void O0(int i7, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f1330d.transact(i7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f1330d;
    }
}
