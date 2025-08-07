package G3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class D extends s implements E {
    public D() {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) t.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) t.a(parcel, PendingIntent.CREATOR);
        t.b(parcel);
        D0(status, pendingIntent);
        return true;
    }
}
