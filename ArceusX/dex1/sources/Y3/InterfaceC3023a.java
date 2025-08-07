package y3;

import android.os.IBinder;
import android.os.IInterface;

public interface InterfaceC3023a extends IInterface {

    public static abstract class AbstractBinderC0238a extends J3.b implements InterfaceC3023a {
        public AbstractBinderC0238a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static InterfaceC3023a O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3023a ? (InterfaceC3023a) iInterfaceQueryLocalInterface : new C3026d(iBinder);
        }
    }
}
