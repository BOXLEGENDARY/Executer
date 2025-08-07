package R3;

import android.os.IBinder;
import android.os.IInterface;

public abstract class G6 extends B implements H6 {
    public static H6 E0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        return iInterfaceQueryLocalInterface instanceof H6 ? (H6) iInterfaceQueryLocalInterface : new F6(iBinder);
    }
}
