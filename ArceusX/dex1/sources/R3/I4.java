package R3;

import android.os.IBinder;
import android.os.IInterface;

public abstract class I4 extends B implements InterfaceC1097j5 {
    public static InterfaceC1097j5 E0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1097j5 ? (InterfaceC1097j5) iInterfaceQueryLocalInterface : new C1080h4(iBinder);
    }
}
