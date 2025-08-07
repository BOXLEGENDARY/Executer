package p2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class a implements IInterface {

    private final IBinder f22673d;

    private final String f22674e;

    protected a(IBinder iBinder, String str) {
        this.f22673d = iBinder;
        this.f22674e = str;
    }

    protected final Parcel E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22674e);
        return parcelObtain;
    }

    protected final Parcel O0(Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f22673d.transact(1, parcel, parcelObtain, 0);
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
    public final IBinder asBinder() {
        return this.f22673d;
    }
}
