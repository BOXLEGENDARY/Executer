package H4;

import android.os.IBinder;
import android.os.IInterface;

public abstract class K extends B implements L {
    public static L O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new J(iBinder);
    }
}
