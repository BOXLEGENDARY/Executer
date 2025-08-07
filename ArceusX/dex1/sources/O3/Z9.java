package O3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import java.util.ArrayList;
import java.util.List;
import y3.InterfaceC3023a;

public final class Z9 extends C0555a implements IInterface {
    Z9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final void b() throws RemoteException {
        V0(1, E0());
    }

    public final void c() throws RemoteException {
        V0(2, E0());
    }

    public final List h3(InterfaceC3023a interfaceC3023a, zzyu zzyuVar) throws RemoteException {
        Parcel parcelE0 = E0();
        N.b(parcelE0, interfaceC3023a);
        N.a(parcelE0, zzyuVar);
        Parcel parcelO0 = O0(3, parcelE0);
        ArrayList arrayListCreateTypedArrayList = parcelO0.createTypedArrayList(zzyb.CREATOR);
        parcelO0.recycle();
        return arrayListCreateTypedArrayList;
    }
}
