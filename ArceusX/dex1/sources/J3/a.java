package J3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class a implements IInterface {

    private final IBinder f1717d;

    private final String f1718e;

    protected a(IBinder iBinder, String str) {
        this.f1717d = iBinder;
        this.f1718e = str;
    }

    protected final Parcel E0(int i7, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f1717d.transact(i7, parcel, parcelObtain, 0);
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

    protected final Parcel O0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f1718e);
        return parcelObtain;
    }

    @Override
    public final IBinder asBinder() {
        return this.f1717d;
    }
}
