package R3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class C1019a implements IInterface {

    private final IBinder f5450d;

    private final String f5451e;

    protected C1019a(IBinder iBinder, String str) {
        this.f5450d = iBinder;
        this.f5451e = str;
    }

    protected final Parcel E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f5451e);
        return parcelObtain;
    }

    protected final Parcel O0(int i7, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f5450d.transact(i7, parcel, parcelObtain, 0);
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

    protected final void V0(int i7, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f5450d.transact(i7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f5450d;
    }
}
