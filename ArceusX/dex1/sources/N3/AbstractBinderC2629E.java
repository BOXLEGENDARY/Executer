package n3;

import W0.JWp.kNUgEaOjcPdX;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzk;

public abstract class AbstractBinderC2629E extends J3.b implements InterfaceC2646d {
    public AbstractBinderC2629E() {
        super(kNUgEaOjcPdX.nHKKNtCd);
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 == 1) {
            int i9 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) J3.c.a(parcel, Bundle.CREATOR);
            J3.c.b(parcel);
            S3(i9, strongBinder, bundle);
        } else if (i7 == 2) {
            int i10 = parcel.readInt();
            Bundle bundle2 = (Bundle) J3.c.a(parcel, Bundle.CREATOR);
            J3.c.b(parcel);
            r0(i10, bundle2);
        } else {
            if (i7 != 3) {
                return false;
            }
            int i11 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) J3.c.a(parcel, zzk.CREATOR);
            J3.c.b(parcel);
            o6(i11, strongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
