package S3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import y3.InterfaceC3023a;

public final class F9 extends C1244a implements H9 {
    F9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ICommonTextRecognizerCreator");
    }

    @Override
    public final I9 F3(InterfaceC3023a interfaceC3023a, InterfaceC3023a interfaceC3023a2, zzvh zzvhVar) throws RemoteException {
        Parcel parcelE0 = E0();
        C1267c0.b(parcelE0, interfaceC3023a);
        I9 i9 = null;
        C1267c0.b(parcelE0, null);
        C1267c0.a(parcelE0, zzvhVar);
        Parcel parcelO0 = O0(1, parcelE0);
        IBinder strongBinder = parcelO0.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            i9 = iInterfaceQueryLocalInterface instanceof I9 ? (I9) iInterfaceQueryLocalInterface : new I9(strongBinder);
        }
        parcelO0.recycle();
        return i9;
    }
}
