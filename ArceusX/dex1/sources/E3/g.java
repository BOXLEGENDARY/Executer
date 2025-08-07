package E3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zza;

public final class g extends a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void V0(zza zzaVar, f fVar) throws RemoteException {
        Parcel parcelE0 = E0();
        c.b(parcelE0, zzaVar);
        c.c(parcelE0, fVar);
        O0(1, parcelE0);
    }
}
