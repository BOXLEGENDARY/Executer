package n3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import y3.InterfaceC3023a;

public final class C2630F extends J3.a implements InterfaceC2632H {
    C2630F(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override
    public final boolean e() throws RemoteException {
        Parcel parcelE0 = E0(7, O0());
        boolean zE = J3.c.e(parcelE0);
        parcelE0.recycle();
        return zE;
    }

    @Override
    public final zzq k4(zzo zzoVar) throws RemoteException {
        Parcel parcelO0 = O0();
        J3.c.c(parcelO0, zzoVar);
        Parcel parcelE0 = E0(8, parcelO0);
        zzq zzqVar = (zzq) J3.c.a(parcelE0, zzq.CREATOR);
        parcelE0.recycle();
        return zzqVar;
    }

    @Override
    public final zzq q3(zzo zzoVar) throws RemoteException {
        Parcel parcelO0 = O0();
        J3.c.c(parcelO0, zzoVar);
        Parcel parcelE0 = E0(6, parcelO0);
        zzq zzqVar = (zzq) J3.c.a(parcelE0, zzq.CREATOR);
        parcelE0.recycle();
        return zzqVar;
    }

    @Override
    public final boolean v6(zzs zzsVar, InterfaceC3023a interfaceC3023a) throws RemoteException {
        Parcel parcelO0 = O0();
        J3.c.c(parcelO0, zzsVar);
        J3.c.d(parcelO0, interfaceC3023a);
        Parcel parcelE0 = E0(5, parcelO0);
        boolean zE = J3.c.e(parcelE0);
        parcelE0.recycle();
        return zE;
    }
}
