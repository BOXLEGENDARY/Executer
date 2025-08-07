package S3;

import android.os.IBinder;
import android.os.IInterface;

public abstract class K9 extends B implements L9 {
    public static L9 E0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        return iInterfaceQueryLocalInterface instanceof L9 ? (L9) iInterfaceQueryLocalInterface : new J9(iBinder);
    }
}
