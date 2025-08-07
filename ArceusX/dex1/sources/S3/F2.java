package S3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import y3.InterfaceC3023a;

public final class F2 extends C1244a implements IInterface {
    F2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    public final void d() throws RemoteException {
        V0(2, E0());
    }

    public final zzl[] h3(InterfaceC3023a interfaceC3023a, zzd zzdVar) throws RemoteException {
        Parcel parcelE0 = E0();
        C1267c0.b(parcelE0, interfaceC3023a);
        C1267c0.a(parcelE0, zzdVar);
        Parcel parcelO0 = O0(1, parcelE0);
        zzl[] zzlVarArr = (zzl[]) parcelO0.createTypedArray(zzl.CREATOR);
        parcelO0.recycle();
        return zzlVarArr;
    }
}
