package n3;

import android.os.IBinder;
import android.os.IInterface;

public abstract class AbstractBinderC2631G extends J3.b implements InterfaceC2632H {
    public static InterfaceC2632H O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2632H ? (InterfaceC2632H) iInterfaceQueryLocalInterface : new C2630F(iBinder);
    }
}
