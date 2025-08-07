package O3;

import android.os.IBinder;
import android.os.IInterface;

public abstract class AbstractBinderC0676l extends BinderC0752s implements InterfaceC0687m {
    public static InterfaceC0687m E0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0687m ? (InterfaceC0687m) iInterfaceQueryLocalInterface : new C0665k(iBinder);
    }
}
