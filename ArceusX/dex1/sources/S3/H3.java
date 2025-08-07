package S3;

import android.os.IBinder;
import android.os.IInterface;

public abstract class H3 extends B implements InterfaceC1337i4 {
    public static InterfaceC1337i4 E0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1337i4 ? (InterfaceC1337i4) iInterfaceQueryLocalInterface : new C1314g3(iBinder);
    }
}
