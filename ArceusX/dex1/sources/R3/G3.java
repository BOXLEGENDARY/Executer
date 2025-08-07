package R3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import y3.InterfaceC3023a;

public final class G3 extends C1019a implements IInterface {
    G3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    public final void d() throws RemoteException {
        V0(3, E0());
    }

    public final zzf[] h3(InterfaceC3023a interfaceC3023a, zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        C1036c0.b(parcelE0, interfaceC3023a);
        C1036c0.a(parcelE0, zzpVar);
        Parcel parcelO0 = O0(1, parcelE0);
        zzf[] zzfVarArr = (zzf[]) parcelO0.createTypedArray(zzf.CREATOR);
        parcelO0.recycle();
        return zzfVarArr;
    }

    public final zzf[] n3(InterfaceC3023a interfaceC3023a, InterfaceC3023a interfaceC3023a2, InterfaceC3023a interfaceC3023a3, int i7, int i8, int i9, int i10, int i11, int i12, zzp zzpVar) throws RemoteException {
        Parcel parcelE0 = E0();
        C1036c0.b(parcelE0, interfaceC3023a);
        C1036c0.b(parcelE0, interfaceC3023a2);
        C1036c0.b(parcelE0, interfaceC3023a3);
        parcelE0.writeInt(i7);
        parcelE0.writeInt(i8);
        parcelE0.writeInt(i9);
        parcelE0.writeInt(i10);
        parcelE0.writeInt(i11);
        parcelE0.writeInt(i12);
        C1036c0.a(parcelE0, zzpVar);
        Parcel parcelO0 = O0(4, parcelE0);
        zzf[] zzfVarArr = (zzf[]) parcelO0.createTypedArray(zzf.CREATOR);
        parcelO0.recycle();
        return zzfVarArr;
    }
}
