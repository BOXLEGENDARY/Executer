package O3;

import android.os.IBinder;
import android.os.IInterface;

public abstract class ba extends BinderC0752s implements ca {
    public static ca E0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof ca ? (ca) iInterfaceQueryLocalInterface : new aa(iBinder);
    }
}
