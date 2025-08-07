package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class C0428a implements IInterface {

    private final IBinder f1591d;

    private final String f1592e;

    protected C0428a(IBinder iBinder, String str) {
        this.f1591d = iBinder;
        this.f1592e = str;
    }

    protected final Parcel E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f1592e);
        return parcelObtain;
    }

    protected final void O0(int i7, Parcel parcel) throws RemoteException {
        try {
            this.f1591d.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f1591d;
    }
}
