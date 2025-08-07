package O3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import y3.InterfaceC3023a;

public final class aa extends C0555a implements ca {
    aa(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override
    public final Z9 u2(InterfaceC3023a interfaceC3023a, zzyd zzydVar) throws RemoteException {
        Z9 z9;
        Parcel parcelE0 = E0();
        N.b(parcelE0, interfaceC3023a);
        N.a(parcelE0, zzydVar);
        Parcel parcelO0 = O0(1, parcelE0);
        IBinder strongBinder = parcelO0.readStrongBinder();
        if (strongBinder == null) {
            z9 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            z9 = iInterfaceQueryLocalInterface instanceof Z9 ? (Z9) iInterfaceQueryLocalInterface : new Z9(strongBinder);
        }
        parcelO0.recycle();
        return z9;
    }
}
