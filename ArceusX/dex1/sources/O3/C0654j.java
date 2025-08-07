package O3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import y3.InterfaceC3023a;

public final class C0654j extends C0555a implements IInterface {
    C0654j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void d() throws RemoteException {
        V0(3, E0());
    }

    public final zzu[] h3(InterfaceC3023a interfaceC3023a, zzan zzanVar) throws RemoteException {
        Parcel parcelE0 = E0();
        N.b(parcelE0, interfaceC3023a);
        N.a(parcelE0, zzanVar);
        Parcel parcelO0 = O0(1, parcelE0);
        zzu[] zzuVarArr = (zzu[]) parcelO0.createTypedArray(zzu.CREATOR);
        parcelO0.recycle();
        return zzuVarArr;
    }

    public final zzu[] n3(InterfaceC3023a interfaceC3023a, zzan zzanVar) throws RemoteException {
        Parcel parcelE0 = E0();
        N.b(parcelE0, interfaceC3023a);
        N.a(parcelE0, zzanVar);
        Parcel parcelO0 = O0(2, parcelE0);
        zzu[] zzuVarArr = (zzu[]) parcelO0.createTypedArray(zzu.CREATOR);
        parcelO0.recycle();
        return zzuVarArr;
    }
}
