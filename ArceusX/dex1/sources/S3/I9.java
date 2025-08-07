package S3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import y3.InterfaceC3023a;

public final class I9 extends C1244a implements IInterface {
    I9(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizer");
    }

    public final void b() throws RemoteException {
        V0(1, E0());
    }

    public final void c() throws RemoteException {
        V0(2, E0());
    }

    public final zzvf h3(InterfaceC3023a interfaceC3023a, zzuq zzuqVar) throws RemoteException {
        Parcel parcelE0 = E0();
        C1267c0.b(parcelE0, interfaceC3023a);
        C1267c0.a(parcelE0, zzuqVar);
        Parcel parcelO0 = O0(3, parcelE0);
        zzvf zzvfVarCreateFromParcel = parcelO0.readInt() == 0 ? null : zzvf.CREATOR.createFromParcel(parcelO0);
        parcelO0.recycle();
        return zzvfVarCreateFromParcel;
    }
}
