package E4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class I extends h0 implements K {
    I(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    @Override
    public final void e2(String str, List list, Bundle bundle, M m7) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeTypedList(list);
        j0.c(parcelE0, bundle);
        parcelE0.writeStrongBinder(m7);
        O0(2, parcelE0);
    }

    @Override
    public final void l3(String str, List list, Bundle bundle, M m7) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeTypedList(list);
        j0.c(parcelE0, bundle);
        parcelE0.writeStrongBinder(m7);
        O0(8, parcelE0);
    }

    @Override
    public final void l4(String str, List list, Bundle bundle, M m7) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeTypedList(list);
        j0.c(parcelE0, bundle);
        parcelE0.writeStrongBinder(m7);
        O0(7, parcelE0);
    }

    @Override
    public final void s4(String str, int i7, Bundle bundle, M m7) throws RemoteException {
        Parcel parcelE0 = E0();
        parcelE0.writeString(str);
        parcelE0.writeInt(i7);
        j0.c(parcelE0, bundle);
        parcelE0.writeStrongBinder(m7);
        O0(4, parcelE0);
    }
}
