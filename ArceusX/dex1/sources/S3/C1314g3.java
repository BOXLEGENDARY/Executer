package S3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import y3.InterfaceC3023a;

public final class C1314g3 extends C1244a implements InterfaceC1337i4 {
    C1314g3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
    }

    @Override
    public final F2 f2(InterfaceC3023a interfaceC3023a, zzp zzpVar) throws RemoteException {
        F2 f22;
        Parcel parcelE0 = E0();
        C1267c0.b(parcelE0, interfaceC3023a);
        C1267c0.a(parcelE0, zzpVar);
        Parcel parcelO0 = O0(1, parcelE0);
        IBinder strongBinder = parcelO0.readStrongBinder();
        if (strongBinder == null) {
            f22 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            f22 = iInterfaceQueryLocalInterface instanceof F2 ? (F2) iInterfaceQueryLocalInterface : new F2(strongBinder);
        }
        parcelO0.recycle();
        return f22;
    }
}
