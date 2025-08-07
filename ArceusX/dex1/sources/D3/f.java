package D3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class f extends a implements d {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override
    public final String Z() throws RemoteException {
        Parcel parcelO0 = O0(1, E0());
        String string = parcelO0.readString();
        parcelO0.recycle();
        return string;
    }

    @Override
    public final boolean a() throws RemoteException {
        Parcel parcelO0 = O0(6, E0());
        boolean zB = c.b(parcelO0);
        parcelO0.recycle();
        return zB;
    }

    @Override
    public final boolean c0(boolean z7) throws RemoteException {
        Parcel parcelE0 = E0();
        c.a(parcelE0, true);
        Parcel parcelO0 = O0(2, parcelE0);
        boolean zB = c.b(parcelO0);
        parcelO0.recycle();
        return zB;
    }
}
