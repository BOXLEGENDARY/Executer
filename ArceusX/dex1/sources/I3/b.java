package I3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class b extends Binder implements IInterface {
    protected b(String str) {
        attachInterface(this, str);
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    protected boolean h3(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        throw null;
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i8)) {
            return true;
        }
        return h3(i7, parcel, parcel2, i8);
    }
}
