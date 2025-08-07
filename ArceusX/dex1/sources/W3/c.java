package W3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzat;
import com.google.android.gms.measurement.internal.zzkv;
import com.google.android.gms.measurement.internal.zzp;
import java.util.List;

public abstract class c extends Q implements d {
    public c() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        switch (i7) {
            case 1:
                U3((zzat) S.a(parcel, zzat.CREATOR), (zzp) S.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                I5((zzkv) S.a(parcel, zzkv.CREATOR), (zzp) S.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                a3((zzp) S.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                T5((zzat) S.a(parcel, zzat.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                r3((zzp) S.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<zzkv> listU5 = u5((zzp) S.a(parcel, zzp.CREATOR), S.f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listU5);
                return true;
            case 9:
                byte[] bArrN2 = N2((zzat) S.a(parcel, zzat.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrN2);
                return true;
            case 10:
                j4(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String strU1 = U1((zzp) S.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strU1);
                return true;
            case 12:
                q1((zzab) S.a(parcel, zzab.CREATOR), (zzp) S.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                v2((zzab) S.a(parcel, zzab.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<zzkv> listR4 = r4(parcel.readString(), parcel.readString(), S.f(parcel), (zzp) S.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listR4);
                return true;
            case 15:
                List<zzkv> listY1 = y1(parcel.readString(), parcel.readString(), parcel.readString(), S.f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(listY1);
                return true;
            case 16:
                List<zzab> listC3 = c3(parcel.readString(), parcel.readString(), (zzp) S.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(listC3);
                return true;
            case 17:
                List<zzab> listZ2 = z2(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(listZ2);
                return true;
            case 18:
                I1((zzp) S.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                h1((Bundle) S.a(parcel, Bundle.CREATOR), (zzp) S.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                f4((zzp) S.a(parcel, zzp.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
