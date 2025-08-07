package H4;

import android.os.IBinder;
import android.os.IInterface;

public abstract class P extends B implements Q {
    public static Q O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof Q ? (Q) iInterfaceQueryLocalInterface : new O(iBinder);
    }
}
