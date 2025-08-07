package E3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import ka.oik.UJEa;

public abstract class e extends b implements f {
    public e() {
        super(UJEa.GzlAZ);
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        p4((Status) c.a(parcel, Status.CREATOR), (zzc) c.a(parcel, zzc.CREATOR));
        return true;
    }
}
