package I3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class a implements IInterface {

    private final IBinder f1686d;

    private final String f1687e;

    protected a(IBinder iBinder, String str) {
        this.f1686d = iBinder;
        this.f1687e = str;
    }

    protected final Parcel E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f1687e);
        return parcelObtain;
    }

    protected final void O0(int i7, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f1686d.transact(i7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void V0(int i7, Parcel parcel) throws RemoteException {
        try {
            this.f1686d.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f1686d;
    }
}
