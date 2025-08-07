package D3;

import android.os.IBinder;
import android.os.IInterface;

public abstract class e extends b implements d {
    public static d E0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new f(iBinder);
    }
}
