package D3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class a implements IInterface {

    private final IBinder f888d;

    private final String f889e;

    protected a(IBinder iBinder, String str) {
        this.f888d = iBinder;
        this.f889e = str;
    }

    protected final Parcel E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f889e);
        return parcelObtain;
    }

    protected final Parcel O0(int i7, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f888d.transact(i7, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e7) {
                parcelObtain.recycle();
                throw e7;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override
    public IBinder asBinder() {
        return this.f888d;
    }
}
