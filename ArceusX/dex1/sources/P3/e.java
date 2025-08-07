package P3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzs;
import y3.InterfaceC3023a;

public abstract class e extends m implements f {
    public e() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    public static f asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new d(iBinder);
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 != 1) {
            return false;
        }
        c cVarNewBarcodeScanner = newBarcodeScanner(InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), (zzs) n.a(parcel, zzs.CREATOR));
        parcel2.writeNoException();
        n.b(parcel2, cVarNewBarcodeScanner);
        return true;
    }
}
