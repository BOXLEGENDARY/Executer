package K3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class b1 extends B implements c1 {
    public b1() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) C0456b0.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) C0456b0.a(parcel, PendingIntent.CREATOR);
        C0456b0.b(parcel);
        V5(status, pendingIntent);
        return true;
    }
}
