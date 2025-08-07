package m3;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public interface InterfaceC2573d extends IInterface {

    public static abstract class a extends I3.b implements InterfaceC2573d {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override
        protected final boolean h3(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
            if (i7 != 1) {
                return false;
            }
            Status status = (Status) I3.c.a(parcel, Status.CREATOR);
            I3.c.b(parcel);
            E2(status);
            return true;
        }
    }

    void E2(Status status) throws RemoteException;
}
