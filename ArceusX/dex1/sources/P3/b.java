package P3;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzak;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzq;
import java.util.List;
import y3.InterfaceC3023a;

public abstract class b extends m implements c {
    public b() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        if (i7 == 1) {
            a();
            parcel2.writeNoException();
        } else if (i7 == 2) {
            d();
            parcel2.writeNoException();
        } else {
            if (i7 != 3) {
                return false;
            }
            List<zzq> listV1 = V1(InterfaceC3023a.AbstractBinderC0238a.O0(parcel.readStrongBinder()), (zzak) n.a(parcel, zzak.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedList(listV1);
        }
        return true;
    }
}
