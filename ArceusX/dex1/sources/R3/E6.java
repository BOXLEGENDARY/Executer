package R3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import java.util.ArrayList;
import java.util.List;
import y3.InterfaceC3023a;

public final class E6 extends C1019a implements IInterface {
    E6(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    public final void b() throws RemoteException {
        V0(1, E0());
    }

    public final void c() throws RemoteException {
        V0(2, E0());
    }

    public final List h3(InterfaceC3023a interfaceC3023a, zzoq zzoqVar) throws RemoteException {
        Parcel parcelE0 = E0();
        C1036c0.b(parcelE0, interfaceC3023a);
        C1036c0.a(parcelE0, zzoqVar);
        Parcel parcelO0 = O0(3, parcelE0);
        ArrayList arrayListCreateTypedArrayList = parcelO0.createTypedArrayList(zzow.CREATOR);
        parcelO0.recycle();
        return arrayListCreateTypedArrayList;
    }
}
