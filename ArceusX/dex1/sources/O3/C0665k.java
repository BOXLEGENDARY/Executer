package O3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import y3.InterfaceC3023a;

public final class C0665k extends C0555a implements InterfaceC0687m {
    C0665k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override
    public final C0654j s3(InterfaceC3023a interfaceC3023a, zzah zzahVar) throws RemoteException {
        C0654j c0654j;
        Parcel parcelE0 = E0();
        N.b(parcelE0, interfaceC3023a);
        N.a(parcelE0, zzahVar);
        Parcel parcelO0 = O0(1, parcelE0);
        IBinder strongBinder = parcelO0.readStrongBinder();
        if (strongBinder == null) {
            c0654j = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            c0654j = iInterfaceQueryLocalInterface instanceof C0654j ? (C0654j) iInterfaceQueryLocalInterface : new C0654j(strongBinder);
        }
        parcelO0.recycle();
        return c0654j;
    }
}
