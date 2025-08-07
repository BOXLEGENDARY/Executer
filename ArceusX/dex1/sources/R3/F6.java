package R3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import y3.InterfaceC3023a;

public final class F6 extends C1019a implements H6 {
    F6(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    @Override
    public final E6 n4(InterfaceC3023a interfaceC3023a, zzou zzouVar) throws RemoteException {
        E6 e62;
        Parcel parcelE0 = E0();
        C1036c0.b(parcelE0, interfaceC3023a);
        C1036c0.a(parcelE0, zzouVar);
        Parcel parcelO0 = O0(1, parcelE0);
        IBinder strongBinder = parcelO0.readStrongBinder();
        if (strongBinder == null) {
            e62 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            e62 = iInterfaceQueryLocalInterface instanceof E6 ? (E6) iInterfaceQueryLocalInterface : new E6(strongBinder);
        }
        parcelO0.recycle();
        return e62;
    }
}
