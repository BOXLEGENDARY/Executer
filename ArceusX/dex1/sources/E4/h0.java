package E4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class h0 implements IInterface {

    private final IBinder f1135d;

    private final String f1136e = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService";

    protected h0(IBinder iBinder, String str) {
        this.f1135d = iBinder;
    }

    protected final Parcel E0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f1136e);
        return parcelObtain;
    }

    protected final void O0(int i7, Parcel parcel) throws RemoteException {
        try {
            this.f1135d.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f1135d;
    }
}
