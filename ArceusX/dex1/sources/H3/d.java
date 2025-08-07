package H3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class d extends Binder implements IInterface {
    protected d(String str) {
        attachInterface(this, str);
    }

    protected boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        throw null;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i8)) {
            return true;
        }
        return E0(i7, parcel, parcel2, i8);
    }
}
