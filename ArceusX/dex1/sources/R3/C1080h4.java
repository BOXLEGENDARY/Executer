package R3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import y3.InterfaceC3023a;

public final class C1080h4 extends C1019a implements InterfaceC1097j5 {
    C1080h4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    @Override
    public final G3 o5(InterfaceC3023a interfaceC3023a, zzh zzhVar) throws RemoteException {
        G3 g32;
        Parcel parcelE0 = E0();
        C1036c0.b(parcelE0, interfaceC3023a);
        C1036c0.a(parcelE0, zzhVar);
        Parcel parcelO0 = O0(1, parcelE0);
        IBinder strongBinder = parcelO0.readStrongBinder();
        if (strongBinder == null) {
            g32 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            g32 = iInterfaceQueryLocalInterface instanceof G3 ? (G3) iInterfaceQueryLocalInterface : new G3(strongBinder);
        }
        parcelO0.recycle();
        return g32;
    }
}
