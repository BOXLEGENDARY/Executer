package E4;

import android.os.IBinder;
import android.os.IInterface;

public abstract class J extends i0 implements K {
    public static K O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return iInterfaceQueryLocalInterface instanceof K ? (K) iInterfaceQueryLocalInterface : new I(iBinder);
    }
}
